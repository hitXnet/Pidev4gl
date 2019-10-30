package PiMission.Service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import PiMission.entites.Fraisprevu;



@Stateless
@LocalBean
public class FraisprevuService implements FraisprevuServiceRemote {
	
	@PersistenceContext(unitName= "Mission-ejb")
	EntityManager em;
	
	public void ajouterFraisprevu(Fraisprevu fraisprevu)
	{
		em.persist(fraisprevu);
	}
	
	public List<Fraisprevu> getAllFraisprevu()
	{
		List<Fraisprevu> fraisprev = em.createQuery("Select f from Fraisprevu f", Fraisprevu.class).getResultList();
		return fraisprev;
	}
	
	public void modifierFraisprevu(Fraisprevu fraisprevu)
	{
		em.merge(fraisprevu);
	}
	
	public void supprimerfraisprevu(int idFraisprev)
	{
		Fraisprevu f = em.find(Fraisprevu.class,idFraisprev); em.remove(f);
	}
	public Fraisprevu getfraisprevuByidFraisprev(int idFraisprevu )
	{
		TypedQuery<Fraisprevu> query = em.createQuery("select f from Fraisprevu f where f.idFraisprevu=:idFraisprevu", Fraisprevu.class);
		query.setParameter("idFraisprevu", idFraisprevu);
		Fraisprevu fraisprevu  = null;
		try {
			fraisprevu = query.getSingleResult();
		} catch (Exception

		e) {
			System.out.println("Erreur : " + e);
		}

		return fraisprevu;
	}


	

}
