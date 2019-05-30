package cat.almata.daw.models;

import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@XmlRootElement(name="Funcio")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Funcio implements Serializable {
	
	private int ID;
	private int EspectacleID;
	private int teatreID;
	private SimpleDateFormat sdf = null;
	private Date data;
	private String HoraInici;
	private String HoraFi;
	private Teatre teatre;
	
	private Espectacle espectacle;
	private ArrayList<Integer> butaquesOcupades;
	private Compra compra;
	
	public Funcio() {
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	}
	
	public Funcio(Date data, Teatre teatre,Espectacle espectacle) {
		this();
		this.data=data;
		this.teatre=teatre;
		this.setEspectacle(espectacle);
		
	}
	
	public Funcio(int iD, int espectacleID, int teatreID, Date data, String horaInici, String horaFi) {
		this();
		ID = iD;
		EspectacleID = espectacleID;
		this.teatreID = teatreID;
		this.data = data;
		HoraInici = horaInici;
		HoraFi = horaFi;
	}
	
	
	@XmlElement(name="teatre")
	public Teatre getTeatre() {
		return teatre;
	}

	public void setTeatre(Teatre teatre) {
		this.teatre = teatre;
	}

	@XmlElement(name="ID")
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@XmlElement(name="espectacleID")
	public int getEspectacleID() {
		return EspectacleID;
	}
	public void setEspectacleID(int espectacleID) {
		EspectacleID = espectacleID;
	}
	@XmlElement(name="teatreID")
	public int getTeatreID() {
		return teatreID;
	}
	public void setTeatreID(int teatreID) {
		this.teatreID = teatreID;
	}
	
	/*@XmlElement(name="data")
	public String getData() {
		return sdf.format(this.data);
	}
	public void setData(String data) {
		try{
			this.data = sdf.parse(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	@XmlElement(name="data")
	 public String getDataS() { 
		  return sdf.format(this.data); } 
	  public void setDataNaixementS(String data) { 
		  try{
			  this.data = sdf.parse(data);
	  }catch(Exception e) { e.printStackTrace(); } }
	  
	  
	  public String getData() {
		  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		  String dateS=dateFormat.format(data);
		  return dateS;
	  }
	  
	  public void setData(Date data) {
		  this.data=data;
	  }
	
	@XmlElement(name="horaInici")
	public String getHoraInici() {
		return HoraInici;
	}
	

	public void setHoraInici(String horaInici) {
		HoraInici = horaInici;
	}
	@XmlElement(name="horaFi")
	public String getHoraFi() {
		return HoraFi;
	}
	public void setHoraFi(String horaFi) {
		HoraFi = horaFi;
	}
	@XmlElement(name="butaquesOcupades")
	public ArrayList<Integer> getButaquesOcupades() {
		return butaquesOcupades;
	}

	public void setButaquesOcupades(ArrayList<Integer> butaquesOcupades) {
		this.butaquesOcupades = butaquesOcupades;
	}

	public boolean ocupada(int fila, int columna) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(fila+ ""+columna);
		//int n=butaquesOcupades.get(a);
		
		
		return butaquesOcupades.contains(a);
	}

	public Espectacle getEspectacle() {
		return espectacle;
	}

	public void setEspectacle(Espectacle espectacle) {
		this.espectacle = espectacle;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	
	
	
	

}
