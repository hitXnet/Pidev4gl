package Services;

import java.util.List;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import Entities.EvaluationSimple;
import Entities.user;
import ServicesRemote.EvaluationSimpleServiceRemote;


@Stateless
@LocalBean

public class EvaluationSimpleService implements EvaluationSimpleServiceRemote {
	@PersistenceContext(unitName = "imputation-ejb")
	EntityManager em;

	public void ajouterEvaluationSimple(EvaluationSimple e) {

		em.persist(e);

	}
	
	
	
	public List<EvaluationSimple> getAllEvaluationSimples() {
		List<EvaluationSimple> emp = em.createQuery("Select e from EvaluationSimple e where e.employe='2' ", EvaluationSimple.class).getResultList();
		return emp;
	}
	
	public List<user> getAllUsers() {
		List<user> emp = em.createQuery("Select e from user e where e.role='EMPLOYE' ",user.class).getResultList();
	
		return emp;
	}
	
	
	public void deleteEvaluationSimpleById(int idEvaluation) {EvaluationSimple e = em.find(EvaluationSimple.class,idEvaluation); em.remove(e); }
	
	public void updateEvaluationSimple(EvaluationSimple e) { em.merge(e); }
	
	
	public void updateUser(user e) { em.merge(e); }
	
	public user getUserbyLogin(String login) {
		TypedQuery<user> query = em
				.createQuery("select e from user e where e.login=:login", user.class);
		query.setParameter("login",login);
		
		user user = null;
		try {
			user = query.getSingleResult();
		} catch (Exception

		e) {
			System.out.println("Erreur : " + e);
		}

		return user;
	}


}



