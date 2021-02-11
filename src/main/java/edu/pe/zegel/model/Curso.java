package edu.pe.zegel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Curso")
public class Curso implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "IdCurso", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idcurso;
	@Column(name = "NomCurso", nullable = false)
	private String nomcurso;
	@Column(name = "CredCurso", nullable = false)
	private int credcurso;

	public Curso() {
		
	}
	public Curso(long idcurso, String nomcurso, int credcurso) {
		super();
		this.idcurso = idcurso;
		this.nomcurso = nomcurso;
		this.credcurso = credcurso;
	}
	public long getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(long idcurso) {
		this.idcurso = idcurso;
	}
	public String getNomcurso() {
		return nomcurso;
	}
	public void setNomcurso(String nomcurso) {
		this.nomcurso = nomcurso;
	}
	public int getCredcurso() {
		return credcurso;
	}
	public void setCredcurso(int credcurso) {
		this.credcurso = credcurso;
	}	
	 @Override
	 public String toString() {
	        return "Curso [idcurso=" + idcurso 
	        		+ ", nomcurso=" + nomcurso 
	        		+ ", credito=" + credcurso + "]";
	    }
}
