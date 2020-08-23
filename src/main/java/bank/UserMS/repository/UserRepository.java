package bank.UserMS.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import bank.UserMS.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

	UserEntity findByEmail(String emailId);

	UserEntity findByPhonenumber(Integer phonenumber);
	
}
