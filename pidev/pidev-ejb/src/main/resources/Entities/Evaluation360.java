package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Evaluation360
 *
 */
@Entity

public class Evaluation360 extends Evaluation implements Serializable {
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@OneToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "id"))
	private user Employe_id;
	
	@ManyToMany(mappedBy="ListeEvaluation360", cascade = CascadeType.ALL)
	private List <user> ListeEmployes;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "id"))
	private user Manager;
	
	private int TravailEquipe;
	private int RespectDelai;
	private int organisation;
	private int communication;
	private int leadership;
	private int interaction;
	private String commentaire;
	

	

	public Evaluation360(Date datedebut, Date datefin, user employe_id, List<user> listeEmployes) {
		super(datedebut, datefin);
		Employe_id = employe_id;
		ListeEmployes = listeEmployes;
	}

	public Evaluation360(Date dateDebut, Date dateFin, int etat, user employe_id,
			List<user> listeEmployes, user manager, int travailEquipe, int respectDelai, int organisation,
			int communication, int leadership, int interaction, String commentaire) {
		super(dateDebut, dateFin, etat);
		Employe_id = employe_id;
		ListeEmployes = listeEmployes;
		Manager = manager;
		TravailEquipe = travailEquipe;
		RespectDelai = respectDelai;
		this.organisation = organisation;
		this.communication = communication;
		this.leadership = leadership;
		this.interaction = interaction;
		this.commentaire = commentaire;
	}

	public user getEmploye_id() {
		return Employe_id;
	}

	public void setEmploye_id(user employe_id) {
		Employe_id = employe_id;
	}

	public List<user> getListeEmployes() {
		return ListeEmployes;
	}

	public void setListeEmployes(List<user> listeEmployes) {
		ListeEmployes = listeEmployes;
	}

	public user getManager() {
		return Manager;
	}

	public void setManager(user manager) {
		Manager = manager;
	}

	public int getTravailEquipe() {
		return TravailEquipe;
	}

	public void setTravailEquipe(int travailEquipe) {
		TravailEquipe = travailEquipe;
	}

	public int getRespectDelai() {
		return RespectDelai;
	}

	public void setRespectDelai(int respectDelai) {
		RespectDelai = respectDelai;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	public Evaluation360() {
		super();
	}

	public Evaluation360(user employe_id, List<user> listeEmployes) {
		
		Employe_id = employe_id;
		ListeEmployes = listeEmployes;
	}

	

}
