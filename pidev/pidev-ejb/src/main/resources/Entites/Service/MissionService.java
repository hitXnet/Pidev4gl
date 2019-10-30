package PiMission.Service;

import java.util.List;
import java.util.Set;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import PiMission.Service.utils.AbstractService;
import PiMission.entites.Mission;

@Stateless
@LocalBean
public class MissionService extends  AbstractService<Mission> implements MissionServiceRemote {
	
	
	@Override
	public Mission getMissionBynomMission(String NomMission)

	{
		TypedQuery<Mission> query = em.createQuery("select m from Mission e where m.NomMission=:NomMission", Mission.class);
		query.setParameter("NomMission", NomMission);
		Mission mission = null;
		try {
			mission = query.getSingleResult();
		} catch (Exception

		e) {
			System.out.println("Erreur : " + e);
		}

		return mission;
	}

	
	


	


}
