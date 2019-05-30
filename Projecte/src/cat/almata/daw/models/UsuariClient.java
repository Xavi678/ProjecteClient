package cat.almata.daw.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement(name="Client")
@JsonIgnoreProperties(ignoreUnknown=true)
public class UsuariClient implements Serializable {

	public UsuariClient(String nIF, String nom, int edat, String email, String password) {
		super();
		NIF = nIF;
		this.nom = nom;
		this.edat = edat;
		this.email = email;
		this.password = password;
	}
	private String NIF;
	private String nom;
	private int edat;
	private String email;
	private String password;
	private Date dataNaixement;
	private int telefon;
	private String cognoms;
	private String localitat;
	private SimpleDateFormat sdf = null;

	
	public UsuariClient() {
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	}
	
	

	public UsuariClient(String nIF, String nom, int edat, String email, String password, int telefon, String cognoms,String localitat) {
		super();
		NIF = nIF;
		this.nom = nom;
		this.edat = edat;
		this.email = email;
		this.password = password;
		this.telefon = telefon;
		this.cognoms = cognoms;
		this.localitat=localitat;
	}



	@XmlElement(name="cognoms")
	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	
	  @XmlElement(name="dataNaixement") 
	  public String getDataNaixementS() { 
		  return sdf.format(this.dataNaixement); } 
	  public void setDataNaixementS(String dataNaixement) { 
		  try{
			  this.dataNaixement = sdf.parse(dataNaixement);
	  }catch(Exception e) { e.printStackTrace(); } }
	
	
	  @JsonIgnore
	public Date getDataNaixement() {
		return this.dataNaixement;
	}
	public void setDataNaixement(Date dataNaixement) {
		
			this.dataNaixement = dataNaixement;
		
	}
	
	
	
	@XmlElement(name="telefon")
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	
	@XmlElement(name="NIF")
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	@XmlElement(name="nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@XmlElement(name="edat")
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	
	@XmlElement(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@XmlElement(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@XmlElement(name="localitat")
	public String getAdreca() {
		return localitat;
	}



	public void setAdreca(String localitat) {
		this.localitat = localitat;
	}
	
	
	
	
}
