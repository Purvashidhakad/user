package bank.UserMS.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import bank.UserMS.entity.AccountEntity;
import bank.UserMS.entity.UserEntity;

@Repository
public class AccountRepositoryImpl implements AccountRepository1{ 
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public AccountEntity getByCustomerId(Integer customerId) {
		
		Query q=entityManager.createQuery("select c FROM AccountEntity c where c.customerId=:customerId");
		q.setParameter("customerId", customerId);
		List<AccountEntity> ae=q.getResultList();
		
		return ae.get(0);
	}
	@Override
	public Integer getAccountId(String email, String password) {
		
		Integer response = null;
		Query q=entityManager.createQuery("select c FROM UserEntity c where c.email=:email AND c.password=:password");
		q.setParameter("email", email);
		q.setParameter("password", password);
		List<UserEntity> ae=q.getResultList();
		for(UserEntity i : ae){
		
			AccountEntity pe = i.getAccount();
			response = pe.getCustomerId();
			}
		
		
		return response;
	}

}
















