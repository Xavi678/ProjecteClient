package cat.almata.daw.models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="adreca")
public class Adreca implements Serializable {
	
	private int ID;
	private String Comarca;
	private String Localitat;
	private int Codipostal;
	
	public Adreca() {
		
	}
	
	
	public Adreca(int iD, String comarca, String localitat, int codipostal) {
		super();
		ID = iD;
		Comarca = comarca;
		Localitat = localitat;
		Codipostal = codipostal;
	}
	@XmlElement(name="ID")
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@XmlElement(name="comarca")
	public String getComarca() {
		return Comarca;
	}
	public void setComarca(String comarca) {
		Comarca = comarca;
	}
	@XmlElement(name="localitat")
	public String getLocalitat() {
		return Localitat;
	}
	public void setLocalitat(String localitat) {
		Localitat = localitat;
	}
	@XmlElement(name="codipostal")
	public int getCodipostal() {
		return Codipostal;
	}
	public void setCodipostal(int codipostal) {
		Codipostal = codipostal;
	}
	
	

}
