package PiMission.entites;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employe implements Serializable , IEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int emp_id;
	private String nom ;
	private String prenom ;
	private String photo;
	private String cv;
	private String bio;
	
	@OneToMany(mappedBy="employe",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Frais> frais;

	public Employe() {
		super();
	}

	public Employe(String nom,String prenom, String photo, String cv, String bio, Set<Frais> frais) {
		super();
		this.photo = photo;
		this.cv = cv;
		this.bio = bio;
		this.frais = frais;
		this.nom = nom;
		this.prenom = prenom;
	}
	



	


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}


	public Set<Frais> getFrais() {
		return frais;
	}

	public void setFrais(Set<Frais> frais) {
		this.frais = frais;
	}


	
	
	

}
