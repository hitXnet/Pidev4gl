package tn.esprit.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ticket implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int flextime;
	private String tache;
	@Enumerated(EnumType.STRING)
	//@NotNull
	private Etat etat;
	public Ticket( int flextime, String tache, Etat etat) {
		
		this.flextime = flextime;
		this.tache = tache;
		this.etat = etat;
	}
	public int getId() {
		return id;
	}
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int id, int flextime, String tache, Etat etat) {
		super();
		this.id = id;
		this.flextime = flextime;
		this.tache = tache;
		this.etat = etat;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlextime() {
		return flextime;
	}
	public void setFlextime(int flextime) {
		this.flextime = flextime;
	}
	public String getTache() {
		return tache;
	}
	public void setTache(String tache) {
		this.tache = tache;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
}
