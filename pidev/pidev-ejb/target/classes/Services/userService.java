package Services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entities.user;


@Stateless
@LocalBean
public class userService {
	@PersistenceContext(unitName = "imputation-ejb")
	EntityManager em;
	
	public List<user> getAllUsers() {
		List<user> emp = em.createQuery("Select e from user e where e.role='EMPLOYE' ",user.class).getResultList();
	
		return emp;
	}

}
