package tn.esprit.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
@Entity
public class timeSheet implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int NbrH;
	private Date date;
	public timeSheet( int nbrH, Date date) {
		this.NbrH = nbrH;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public timeSheet() {
		super();
	}
	public timeSheet(int id, int nbrH, Date date) {
		this.id = id;
		this.NbrH = nbrH;
		this.date = date;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNbrH() {
		return NbrH;
	}
	public void setNbrH(int nbrH) {
		NbrH = nbrH;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date =date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	
	
	
	

}
