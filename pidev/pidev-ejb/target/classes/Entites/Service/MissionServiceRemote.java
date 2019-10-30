package PiMission.Service;



import java.util.List;

import javax.ejb.Remote;

import PiMission.entites.Mission;

@Remote
public interface MissionServiceRemote {
	
	public Mission getMissionBynomMission(String NomMission);
	

}
