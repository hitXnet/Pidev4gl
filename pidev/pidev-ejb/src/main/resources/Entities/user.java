package Entities;
import Entities.Evaluation360;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

//import myentities.Role;

/**
 * Entity implementation class for Entity: user
 *
 */

@Entity

public class user implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToMany
	private List <Evaluation360> ListeEvaluation360;
	
	@OneToMany
	private List<EvaluationSimple> ListeEvaluation;
	

	public user() {
		super();// TODO Auto-generated constructor stub
	}
	
	
	
	private String login;
	
	private String password;
	private String email;
	private Boolean isActif; 
	@Enumerated(EnumType.STRING)
	//@NotNull
	private Role role;

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsActif() {
		return isActif;
	}

	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	

	
	public List<Evaluation360> getListeEvaluation360() {
		return ListeEvaluation360;
	}

	public void setListeEvaluation360(List<Evaluation360> listeEvaluation360) {
		ListeEvaluation360 = listeEvaluation360;
	}

	public List<EvaluationSimple> getListeEvaluation() {
		return ListeEvaluation;
	}

	public void setListeEvaluation(List<EvaluationSimple> listeEvaluation) {
		ListeEvaluation = listeEvaluation;
	}

	public user(int id, List<Evaluation360> listeEvaluation360, List<EvaluationSimple> listeEvaluation, String login,
			String password, String email, Boolean isActif, Role role) {
		super();
		this.id = id;
		ListeEvaluation360 = listeEvaluation360;
		ListeEvaluation = listeEvaluation;
		this.login = login;
		this.password = password;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
	}

	
	
	
}
