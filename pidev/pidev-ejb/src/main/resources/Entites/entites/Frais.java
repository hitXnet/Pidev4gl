package PiMission.entites;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Frais implements Serializable , IEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFrais;
	@ManyToOne
	private Employe employe;
	@ManyToOne
	private Mission mission;
	private boolean terminer;
	
	@OneToMany(fetch = FetchType.EAGER , mappedBy="frais")
	private Set<Notefrais> notesFrais;
	
	public Frais(Employe employe, Mission mission) {
		super();
		this.employe = employe;
		this.mission = mission;
		terminer = false;
	}

	public Frais(){
		this.notesFrais = new HashSet<>();
	}
	
	public int getIdFrais() {
		return idFrais;
	}
	public void setIdFrais(int idFrais) {
		this.idFrais = idFrais;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Mission getMission() {
		return mission;
	}
	public void setMission(Mission mission) {
		this.mission = mission;
	}
	public Set<Notefrais> getNotesFrais() {
		return notesFrais;
	}
	public void setNotesFrais(Set<Notefrais> notesFrais) {
		this.notesFrais = notesFrais;
	}

	public boolean isTerminer() {
		return terminer;
	}

	public void setTerminer(boolean terminer) {
		this.terminer = terminer;
	}
	
	 
	
	

}
