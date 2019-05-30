package cat.almata.daw.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@XmlRootElement(name="Compra")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Compra implements Serializable{
	private int ID;
	private int funcioID;
	private String clientID;
	private int fila;
	private int columna;
	
	private Funcio funcio;
	private UsuariClient client;
	
	
	
	private SimpleDateFormat sdf=null;
	
	public Compra() {
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	}
	
	
	public Compra(int iD, int funcioID, String clientID, int fila, int columna, String nomTeatre,
			String titolEspectacle,Date data) {
		this();
		ID = iD;
		this.funcioID = funcioID;
		this.clientID = clientID;
		this.fila = fila;
		this.columna = columna;
		
	}
	public Compra(int iD, int funcioID, String clientID, int fila, int columna, Funcio funcio) {
		super();
		ID = iD;
		this.funcioID = funcioID;
		this.clientID = clientID;
		this.fila = fila;
		this.columna = columna;
		
		this.funcio = funcio;
	}
	
	
	
	
	
	
	public Compra(int iD, int funcioID, String clientID, int fila, int columna) {
		this();
		ID = iD;
		this.funcioID = funcioID;
		this.clientID = clientID;
		this.fila = fila;
		this.columna = columna;
	}
	@XmlElement(name="ID")
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@XmlElement(name="funcioID")
	public int getFuncioID() {
		return funcioID;
	}
	public void setFuncioID(int funcioID) {
		this.funcioID = funcioID;
	}
	@XmlElement(name="clientID")
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	@XmlElement(name="fila")
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	@XmlElement(name="columna")
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	


	public UsuariClient getClient() {
		return client;
	}


	public void setClient(UsuariClient client) {
		this.client = client;
	}


	public Funcio getFuncio() {
		return funcio;
	}


	public void setFuncio(Funcio funcio) {
		this.funcio = funcio;
	}
	
	

}
