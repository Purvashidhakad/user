package bank.UserMS.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import bank.UserMS.DTO.AccountDTO;
import bank.UserMS.DTO.UserDTO;
import bank.UserMS.service.UserService;


@CrossOrigin
@RestController
@RequestMapping(value = "/bank")
public class UserController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserService userService;
	
	@Autowired
	Environment environment;
	
	

	@GetMapping(value="/accountDetails/{customerId}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public AccountDTO viewDetails(@PathVariable Integer customerId) {
		AccountDTO accDTO=new RestTemplate().getForObject("http://localhost:8000/summary/"+customerId, AccountDTO.class);
			logger.info("Account details of ", customerId);
			AccountDTO accDetails=userService.getAccDetails(customerId,accDTO);
			return accDetails;
		}
	
	

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);//check

	@PostMapping(value = "/customerlogin",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> userLogin(@RequestBody UserDTO userDTO) {

		ResponseEntity<String> responseEntity = null;
		try {
			
			String successMessage = "Successful Login";
			
			String responseMessage = userService.userLogin(userDTO);//check
			if(successMessage.equals(responseMessage)) {
				
				Integer customerId=userService.getCustomerId(userDTO.getEmail(), userDTO.getPassword());
				AccountDTO accDTO=new RestTemplate().getForObject("http://localhost:8000/summary/"+customerId, AccountDTO.class);
				
				AccountDTO adto =userService.getAccDetails(customerId,accDTO);
				
				String responseMsg = "Login Successful \n"+adto.toString();
				
				userDTO.setCustomerId(adto.getCustomerId());
				
				userService.insertIntoUserAuth(userDTO);
				
				responseEntity = new ResponseEntity(responseMsg, HttpStatus.OK);
				
				return responseEntity;
			}
			responseEntity = new ResponseEntity(responseMessage, HttpStatus.OK);

		} catch (Exception exception) {
			LOGGER.error("Error: " + exception.getMessage(), exception);

			String errorMessage;

			if (exception.getMessage() == null) {
				errorMessage = environment.getProperty("General.EXCEPTION");
				responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.OK);
				return responseEntity;

			} else {
				errorMessage = environment.getProperty(exception.getMessage());

				if (errorMessage == null)
					errorMessage = environment.getProperty("General.EXCEPTION");
				responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.OK);
				return responseEntity;

			}
		}
		

		return responseEntity;
	}
}















