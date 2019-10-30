package PiMission.Service.utils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import PiMission.entites.IEntity;
@Stateless
@LocalBean
public class AbstractService<T extends IEntity> implements IService<T>{
	@PersistenceContext(unitName= "Mission-ejb")
	protected EntityManager em;


	@Override
	public void ajouterObject(T object) {
	em.persist(object);
	em.flush();
	}

	@Override
	public void modifierObject(T object) {
		System.out.println("object :"+object.toString());
		em.merge(object);
		em.flush();
	}

	@Override
	public void supprimerObject(T Object ,int Id) {
		em.remove(em.find(Object.getClass(),Id));
		em.flush();
	}
	@Override
	public List<T> fetchAll(Class<T> carriedInstance) {
		String query = "Select object from "+carriedInstance.getSimpleName()+" object";
		System.out.println("query : "+query);
		return  em.createQuery("Select o from "+carriedInstance.getSimpleName()+" o",carriedInstance).getResultList();		
	}

	
}
