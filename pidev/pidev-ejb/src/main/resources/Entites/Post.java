package entites;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Post implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int post_id;
@Temporal(TemporalType.TIMESTAMP)
Date date;
String text, photo,video;
@ManyToOne
@JoinColumn(name="fk_emp_id")
Employe employe;
@ManyToOne
@JoinColumn(name="fk_forum_id")
Forum forum;
public int getPost_id() {
	return post_id;
}
public void setPost_id(int post_id) {
	this.post_id = post_id;
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
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getVideo() {
	return video;
}
public void setVideo(String video) {
	this.video = video;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public Forum getForum() {
	return forum;
}
public void setForum(Forum forum) {
	this.forum = forum;
}
public Set<LikePost> getLikePosts() {
	return likePosts;
}
public void setLikePosts(Set<LikePost> likePosts) {
	this.likePosts = likePosts;
}
@OneToMany(mappedBy="post")
private Set<LikePost> likePosts;



}
