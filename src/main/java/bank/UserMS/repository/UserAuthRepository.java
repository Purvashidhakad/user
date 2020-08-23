package bank.UserMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bank.UserMS.entity.UserAuthenticateEntity;


@Repository
public interface UserAuthRepository extends CrudRepository<UserAuthenticateEntity, String> {
	List<UserAuthenticateEntity>findByCustomerId(Integer customerId);
}
