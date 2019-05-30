package cat.almata.daw.models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="teatre")
public class Teatre implements Serializable {
	private int ID;
	private String nom;
	private int files;
	private int columnes;
	private int AdrecaID;
	private Adreca adreca;
	
	public Teatre() {
		
	}
	
	
	public Teatre(int iD, String nom, int files, int columnes, int adrecaID) {
		super();
		ID = iD;
		this.nom = nom;
		this.files = files;
		this.columnes = columnes;
		AdrecaID = adrecaID;
	}
	
	public Teatre(int iD, String nom, int files, int columnes, int adrecaID,Adreca adr) {
		super();
		ID = iD;
		this.nom = nom;
		this.files = files;
		this.columnes = columnes;
		AdrecaID = adrecaID;
		this.adreca=adr;
	}
	@XmlElement(name="ID")
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@XmlElement(name="nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@XmlElement(name="files")
	public int getFiles() {
		return files;
	}
	public void setFiles(int files) {
		this.files = files;
	}
	
	@XmlElement(name="columnes")
	public int getColumnes() {
		return columnes;
	}
	public void setColumnes(int columnes) {
		this.columnes = columnes;
	}
	@XmlElement(name="adrecaID")
	public int getAdrecaID() {
		return AdrecaID;
	}
	public void setAdrecaID(int adrecaID) {
		AdrecaID = adrecaID;
	}

	@XmlElement(name="adreca")
	public Adreca getAdreca() {
		return adreca;
	}


	public void setAdreca(Adreca adreca) {
		this.adreca = adreca;
	}
	
	
	
	
}
