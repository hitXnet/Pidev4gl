package entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LikeCom implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int likeC_id;
	@ManyToOne
	@JoinColumn(name="fk_emp_id")
	Employe employe;
	@ManyToOne
	@JoinColumn(name="fk_com_id")
	Commentaire com;
	public int getLikeC_id() {
		return likeC_id;
	}
	public void setLikeC_id(int likeC_id) {
		this.likeC_id = likeC_id;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Commentaire getCom() {
		return com;
	}
	public void setCom(Commentaire com) {
		this.com = com;
	}
}
