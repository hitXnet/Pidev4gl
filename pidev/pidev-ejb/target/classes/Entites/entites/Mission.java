package PiMission.entites;

import java.io.Serializable;
import java.util.Date;
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
public class Mission implements Serializable, IEntity  {

private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMission;
	private String NomMission;
	private String LieuMission;
	private Date DatedepartMission;
	private Date DateretourMission;
	
	
	
	@OneToMany(mappedBy="mission",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Fraisprevu> fraisprevu;
	
	@OneToMany(mappedBy="mission",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Frais> frais;

	public Mission() {
		super();
	}

	public Mission(int idMission, String nomMission, String lieuMission, Date datedepartMission,
			Date dateretourMission) {
		super();
		this.idMission = idMission;
		NomMission = nomMission;
		LieuMission = lieuMission;
		DatedepartMission = datedepartMission;
		DateretourMission = dateretourMission;
	}

	public Mission(String nomMission, String lieuMission, Date datedepartMission, Date dateretourMission) {
		super();
		NomMission = nomMission;
		LieuMission = lieuMission;
		DatedepartMission = datedepartMission;
		DateretourMission = dateretourMission;
	}

	public Mission(int idMission, String nomMission, String lieuMission, Date datedepartMission, Date dateretourMission,
			 Set<Fraisprevu> fraisprevu, Set<Frais> frais) {
		super();
		this.idMission = idMission;
		NomMission = nomMission;
		LieuMission = lieuMission;
		DatedepartMission = datedepartMission;
		DateretourMission = dateretourMission;
		this.fraisprevu = fraisprevu;
		this.frais = frais ;
	
	}

	public int getIdMission() {
		return idMission;
	}

	public void setIdMission(int idMission) {
		this.idMission = idMission;
	}

	public String getNomMission() {
		return NomMission;
	}

	public void setNomMission(String nomMission) {
		NomMission = nomMission;
	}

	public String getLieuMission() {
		return LieuMission;
	}

	public void setLieuMission(String lieuMission) {
		LieuMission = lieuMission;
	}

	public Date getDatedepartMission() {
		return DatedepartMission;
	}

	public void setDatedepartMission(Date datedepartMission) {
		DatedepartMission = datedepartMission;
	}

	public Date getDateretourMission() {
		return DateretourMission;
	}

	public void setDateretourMission(Date dateretourMission) {
		DateretourMission = dateretourMission;
	}



	public Set<Fraisprevu> getFraisprevu() {
		return fraisprevu;
	}

	public void setFraisprevu(Set<Fraisprevu> fraisprevu) {
		this.fraisprevu = fraisprevu;
	}

	public Set<Frais> getFrais() {
		return frais;
	}

	public void setFrais(Set<Frais> frais) {
		this.frais = frais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return ""+idMission;
	}
	
	
	
	
	
	
	
}
