package Services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entities.Evaluation360;
import Entities.EvaluationSimple;
import Entities.user;

public class Evaluation360Service {
	@PersistenceContext(unitName = "imputation-ejb")
	EntityManager em;

	public void ajouterEvaluation360(Evaluation360 e) {

		em.persist(e);

	}
	
	
	
	public List<Evaluation360> getAllEvaluation360() {
		List<Evaluation360> emp = em.createQuery("Select e from Evaluation360 e", Evaluation360.class).getResultList();
		return emp;
	}
	
	public List<user> getAllUsers() {
		List<user> emp = em.createQuery("Select e from user e",user.class).getResultList();
		return emp;
	}
	
	
	public void deleteEvaluation360ById(int idEvaluation) {Evaluation360 e = em.find(Evaluation360.class,idEvaluation); em.remove(e); }
	
	public void updateEvaluation360(Evaluation360 e) { em.merge(e); }
	

}
