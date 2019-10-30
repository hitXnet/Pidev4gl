package entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Conversation {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id_conv;
@Temporal(TemporalType.TIMESTAMP)
Date seen_date;
int id_emp1;
int id_emp2;
public int getId_conv() {
	return id_conv;
}
public void setId_conv(int id_conv) {
	this.id_conv = id_conv;
}
public Date getSeen_date() {
	return seen_date;
}
public void setSeen_date(Date seen_date) {
	this.seen_date = seen_date;
}
public int getId_emp1() {
	return id_emp1;
}
public void setId_emp1(int id_emp1) {
	this.id_emp1 = id_emp1;
}
public int getId_emp2() {
	return id_emp2;
}
public void setId_emp2(int id_emp2) {
	this.id_emp2 = id_emp2;
}
}
