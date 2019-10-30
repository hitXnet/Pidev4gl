package PiMission.Service;

import java.util.List;

import javax.ejb.Remote;

import PiMission.entites.Fraisprevu;


@Remote
public interface FraisprevuServiceRemote {
	public void ajouterFraisprevu(Fraisprevu fraisprevu);
	public List<Fraisprevu> getAllFraisprevu();
	public void modifierFraisprevu(Fraisprevu fraisprevu);
	public void supprimerfraisprevu(int idFraisprevu);
	public Fraisprevu getfraisprevuByidFraisprev(int idFraisprev );

}
