package bank.UserMS.repository;



import org.springframework.stereotype.Repository;

import bank.UserMS.entity.AccountEntity;


@Repository
public interface AccountRepository1{

	AccountEntity getByCustomerId(Integer customerId);
    Integer getAccountId(String email, String password);
}
