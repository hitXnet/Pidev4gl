package PiMission.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Notefrais implements Serializable, IEntity {
	
private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idfrais;
	private Nature naturefrais;
	private String description;
	private float montantfrais;
	private String facture;
	private Etat etat;
	
	
	@ManyToOne
	private Frais frais;

	public Notefrais() {
		super();
	}

	public Notefrais(Nature naturefrais, String description, float montantfrais, String facture, Etat etat) {
		super();
		this.naturefrais = naturefrais;
		this.description = description;
		this.montantfrais = montantfrais;
		this.facture = facture;
		this.etat = etat;
	}

	public Notefrais(int idfrais, Nature naturefrais, String description, float montantfrais, String facture,
			Etat etat) {
		super();
		this.idfrais = idfrais;
		this.naturefrais = naturefrais;
		this.description = description;
		this.montantfrais = montantfrais;
		this.facture = facture;
		this.etat = etat;
	}

	

	public Notefrais(int idfrais, Nature naturefrais, String description, float montantfrais, String facture, Etat etat,
			Frais frais) {
		super();
		this.idfrais = idfrais;
		this.naturefrais = naturefrais;
		this.description = description;
		this.montantfrais = montantfrais;
		this.facture = facture;
		this.etat = etat;
		this.frais = frais;
	}

	public Frais getFrais() {
		return frais;
	}

	public void setFrais(Frais frais) {
		this.frais = frais;
	}

	public int getIdfrais() {
		return idfrais;
	}

	public void setIdfrais(int idfrais) {
		this.idfrais = idfrais;
	}

	public Nature getNaturefrais() {
		return naturefrais;
	}

	public void setNaturefrais(Nature naturefrais) {
		this.naturefrais = naturefrais;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getMontantfrais() {
		return montantfrais;
	}

	public void setMontantfrais(float montantfrais) {
		this.montantfrais = montantfrais;
	}

	public String getFacture() {
		return facture;
	}

	public void setFacture(String facture) {
		this.facture = facture;
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
