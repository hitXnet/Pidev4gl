package entites;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employe implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
int emp_id;
String photo,cv,bio,login,password,email,name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Employe(int emp_id, String bio, String login, String password, String email) {
	super();
	this.emp_id = emp_id;
	this.bio = bio;
	this.login = login;
	this.password = password;
	this.email = email;
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
public Employe( String login, String password) {
	super();
	
	this.login = login;
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
public Date getDate_embauche() {
	return date_embauche;
}
public void setDate_embauche(Date date_embauche) {
	this.date_embauche = date_embauche;
}

@Temporal(TemporalType.DATE)
Date date_embauche;

public Employe() {}
}
