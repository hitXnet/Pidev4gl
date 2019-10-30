package entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commentaire implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int com_id;
	@Temporal(TemporalType.TIMESTAMP)
	Date date;
	String text;
	@ManyToOne
	@JoinColumn(name="fk_emp_id")
	Employe employe;
	@ManyToOne
	@JoinColumn(name="fk_post_id")
	Post post;
	public int getCom_id() {
		return com_id;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public void setCom_id(int com_id) {
		this.com_id = com_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}

	

}
