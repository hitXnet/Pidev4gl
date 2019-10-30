package PiMission.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fraisprevu implements Serializable , IEntity{
	
private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFraisprev;
	private Nature natureprev;
	private float montantprev;
	
	@ManyToOne
	private Mission mission;

	public Fraisprevu() {
		super();
	}

	public Fraisprevu(Nature natureprév, float montantprév) {
		super();
		this.natureprev = natureprév;
		this.montantprev = montantprév;
	}

	public Fraisprevu(int idFraisprev, Nature natureprév, float montantprév) {
		super();
		this.idFraisprev = idFraisprev;
		this.natureprev = natureprév;
		this.montantprev = montantprév;
	}

	public Fraisprevu( Nature natureprév, float montantprév, Mission mission) {
		super();
    	this.natureprev = natureprév;
		this.montantprev = montantprév;
		this.mission = mission;
	}

	public int getIdFraisprev() {
		return idFraisprev;
	}

	public void setIdFraisprev(int idFraisprev) {
		this.idFraisprev = idFraisprev;
	}

	public Nature getNatureprev() {
		return natureprev;
	}

	public void setNatureprev(Nature natureprév) {
		this.natureprev = natureprév;
	}

	public float getMontantprev() {
		return montantprev;
	}

	public void setMontantprev(float montantprév) {
		this.montantprev = montantprév;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
