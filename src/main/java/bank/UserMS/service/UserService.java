package bank.UserMS.service;

import java.sql.Timestamp;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import bank.UserMS.repository.UserRepository;
import bank.UserMS.DTO.AccountDTO;
import bank.UserMS.DTO.UserDTO;
import bank.UserMS.entity.UserAuthenticateEntity;
import bank.UserMS.entity.UserEntity;
import bank.UserMS.repository.AccountRepository1;
import bank.UserMS.repository.UserAuthRepository;
import bank.UserMS.exception.UserException;

@Service
@PropertySource(value = { "classpath:configuration.properties" })
public class UserService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserRepository userRepository;
	@Autowired
	AccountRepository1 accountRepository;
	@Autowired
	UserAuthRepository userAuthRepository;

	public Integer getCustomerId(String email, String password) {
		Integer customerId = accountRepository.getAccountId(email, password);// getting customerid from repo
		return customerId;
	}

	public AccountDTO getAccDetails(Integer customerId, AccountDTO accDTO) {

		AccountDTO adto = null;
		if (accDTO != null) {
			adto = AccountDTO.valueOf(accDTO);

		}
		return adto;

	}

	public String userLogin(UserDTO userDTO) throws UserException {

		UserEntity userEntity = userRepository.findByEmail(userDTO.getEmail());// check
		if (userEntity != null) {
			if (userEntity.getPassword().equals(userDTO.getPassword())) {
				return "Successful Login";
			} else {
				return "Invalid Password";
			}

		} else {
			return "INVALID EMAILID";
		}

	}

	public void insertIntoUserAuth(UserDTO userDto) {
		UserAuthenticateEntity uae = new UserAuthenticateEntity();
		
		uae.setCustomerId(userDto.getCustomerId());
		uae.setEmail(userDto.getEmail());
		uae.setLoggedDate(new Timestamp(System.currentTimeMillis()));
		String pk = userDto.getCustomerId().toString() + "_" + new Timestamp(System.currentTimeMillis()).toString();
		uae.setPkLoggedDate(pk);
		
		userAuthRepository.save(uae);
	}

	
}
