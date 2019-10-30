package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Evaluation
 *
 */

@MappedSuperclass
public class Evaluation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6551044216295459348L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@OneToMany (mappedBy = "evaluation", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	//private List<Evaluation> Evaluations;
	


	//private static final long serialVersionUID = 1L;
	
	//private static final long serialVersionUID = 1L;
	private int idevaluation;
	
	private Date datedebut;
	private Date datefin;
	private int etat;
	
	
	
	

	




	

	public Evaluation(int idevaluation) {
		super();
		this.idevaluation = idevaluation;
		//this.datefin = datefin;
	}






	public Evaluation(Date datedebut, Date datefin) {
		super();
		this.datedebut = datedebut;
		this.datefin = datefin;
	}



















	public Evaluation(Date datedebut, Date datefin, int etat) {
		super();
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.etat = etat;
	}



















	public int getIdevaluation() {
		return idevaluation;
	}



















	public void setIdevaluation(int idevaluation) {
		this.idevaluation = idevaluation;
	}



















	public Date getDatedebut() {
		return datedebut;
	}



















	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}



















	public Date getDatefin() {
		return datefin;
	}



















	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}



















	public int getEtat() {
		return etat;
	}



















	public void setEtat(int etat) {
		this.etat = etat;
	}



















	public Evaluation() {
		super();
	}
   
}
