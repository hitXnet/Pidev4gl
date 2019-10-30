package entites;

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
public class Message {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
int id_message;
@Temporal(TemporalType.TIMESTAMP)
Date date_message;
String contenu;
int employe_dest_id;
@ManyToOne
@JoinColumn(name="fk_emp_sender_id")
Employe employe_sender;
public int getId_message() {
	return id_message;
}
public void setId_message(int id_message) {
	this.id_message = id_message;
}
public Date getDate_message() {
	return date_message;
}
public void setDate_message(Date date_message) {
	this.date_message = date_message;
}
public String getContenu() {
	return contenu;
}
public void setContenu(String contenu) {
	this.contenu = contenu;
}
public Employe getEmploye_sender() {
	return employe_sender;
}
public void setEmploye_sender(Employe employe_sender) {
	this.employe_sender = employe_sender;
}


public int getEmploye_dest_id() {
	return employe_dest_id;
}
public void setEmploye_dest_id(int employe_dest_id) {
	this.employe_dest_id = employe_dest_id;
}




}
