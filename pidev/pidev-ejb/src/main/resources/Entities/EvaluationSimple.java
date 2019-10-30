package Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EvaluationSimple
 *
 */
@Entity

public class EvaluationSimple extends Evaluation implements Serializable {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@OneToOne
	private user employe;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "id"))
	private user manager;
	public user getEmploye() {
		return employe;
	}



	public EvaluationSimple(int idevaluation) {
		super(idevaluation);
	}



	public EvaluationSimple(Date datedebut, Date datefin, int etat, user employe, user manager, int travailequipe,
			int respectdelai, int organisation, int communication, int leadership, int interaction,
			String commentaire) {
		super(datedebut, datefin, etat);
		this.employe = employe;
		this.manager = manager;
		this.travailequipe = travailequipe;
		this.respectdelai = respectdelai;
		this.organisation = organisation;
		this.communication = communication;
		this.leadership = leadership;
		this.interaction = interaction;
		this.commentaire = commentaire;
	}
	

	public EvaluationSimple(Date datedebut, Date datefin, int etat, int travailequipe, int respectdelai,
			int organisation, int communication, int leadership, int interaction, String commentaire) {
		super(datedebut, datefin);
		this.travailequipe = travailequipe;
		this.respectdelai = respectdelai;
		this.organisation = organisation;
		this.communication = communication;
		this.leadership = leadership;
		this.interaction = interaction;
		this.commentaire = commentaire;
	}
	
	public EvaluationSimple(user employe) {
		
		this.employe = employe;
	}

	public void setEmploye(user employe) {
		this.employe = employe;
	}

	public user getManager() {
		return manager;
	}

	public void setManager(user manager) {
		this.manager = manager;
	}

	public int getTravailequipe() {
		return travailequipe;
	}

	public void setTravailequipe(int travailequipe) {
		this.travailequipe = travailequipe;
	}

	public int getRespectdelai() {
		return respectdelai;
	}

	public void setRespectdelai(int respectdelai) {
		this.respectdelai = respectdelai;
	}

	public int getOrganisation() {
		return organisation;
	}

	public void setOrganisation(int organisation) {
		this.organisation = organisation;
	}

	public int getCommunication() {
		return communication;
	}

	public void setCommunication(int communication) {
		this.communication = communication;
	}

	public int getLeadership() {
		return leadership;
	}

	public void setLeadership(int leadership) {
		this.leadership = leadership;
	}

	public int getInteraction() {
		return interaction;
	}

	public void setInteraction(int interaction) {
		this.interaction = interaction;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	private int travailequipe;
	private int respectdelai;
	private int organisation;
	private int communication;
	private int leadership;
	private int interaction;
	private String commentaire;
	
	
	
	
	
	

	

	private static final long serialVersionUID = 1L;

	public EvaluationSimple() {
		super();
	}



	public EvaluationSimple(int idevaluation, int travailequipe, int respectdelai, int organisation, int communication,
			int leadership, int interaction, String commentaire) {
		
		this.travailequipe = travailequipe;
		this.respectdelai = respectdelai;
		this.organisation = organisation;
		this.communication = communication;
		this.leadership = leadership;
		this.interaction = interaction;
		this.commentaire = commentaire;
	}



	public EvaluationSimple(int idevaluation, user employe, int travailequipe, int respectdelai, int organisation,
			int communication, int leadership, int interaction, String commentaire) {
		super(idevaluation);
		this.employe = employe;
		this.travailequipe = travailequipe;
		this.respectdelai = respectdelai;
		this.organisation = organisation;
		this.communication = communication;
		this.leadership = leadership;
		this.interaction = interaction;
		this.commentaire = commentaire;
	}



	



	
}
