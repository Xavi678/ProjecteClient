package cat.almata.daw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


import cat.almata.daw.gestor.GestorRest;
import cat.almata.daw.models.Espectacle;
import cat.almata.daw.models.Teatre;
import cat.almata.daw.models.UsuariClient;

public class LlistarAction extends MyAction  {
	
	
	private List<Espectacle> espectacles;
	private ArrayList<Teatre> teatres;
	
	
	
	
	
public List<Espectacle> getEspectacles() {
		return espectacles;
	}



	public void setEspectacles(List<Espectacle> espectacles) {
		this.espectacles = espectacles;
	}
	
	



public ArrayList<Teatre> getTeatres() {
		return teatres;
	}



	public void setTeatres(ArrayList<Teatre> teatres) {
		this.teatres = teatres;
	}



public String llistarEspectacles() {

	this.isUserLogged();
	//GestorRest gestor= new GestorRest();
	 espectacles=gestor.obtenirEspectacles();
	teatres=gestor.obtenirTeatres();
	
	return SUCCESS;
}
}
