package tn.esprit.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Project implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	public Project(int id, String projectName, Etat etat) {
		this.id = id;
		this.projectName = projectName;
		this.etat = etat;
	}
	private String projectName;
	@Enumerated(EnumType.STRING)
	private Etat etat;
	
	public Project(String projectName, Etat etat) {
		this.projectName = projectName;
		this.etat = etat;
	}
	public Project() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
