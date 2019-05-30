package cat.almata.daw;

import java.util.ArrayList;
import java.util.Date;

import cat.almata.daw.models.Espectacle;
import cat.almata.daw.models.Teatre;

public class CercarAction extends MyAction {
	
	private String search;
	private ArrayList<Espectacle> espectacles;
	private ArrayList<Teatre> teatres;
	private String data;
	private String dataFi;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
	public ArrayList<Teatre> getTeatres() {
		return teatres;
	}

	public void setTeatres(ArrayList<Teatre> teatres) {
		this.teatres = teatres;
	}

	public ArrayList<Espectacle> getEspectacles() {
		return espectacles;
	}

	public void setEspectacles(ArrayList<Espectacle> espectacles) {
		this.espectacles = espectacles;
	}

	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDataFi() {
		return dataFi;
	}

	public void setDataFi(String dataFi) {
		this.dataFi = dataFi;
	}

	public String search() {
		isUserLogged();
		
		
		
		espectacles=gestor.filtrarEspectacles(search,data,dataFi);
		teatres=gestor.filtrarTeatres(search,data,dataFi);
		return SUCCESS;
	}

}
