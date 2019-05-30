package cat.almata.daw;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import cat.almata.daw.gestor.GestorRest;
import cat.almata.daw.models.Compra;
import cat.almata.daw.models.UsuariClient;

public class UserAction extends MyAction {
	
	private ArrayList<String> localitats;
	private UsuariClient client;
	
	private String correu;
	
	private String search;
	private String teatre;
	private String espectacle;
	private String dataActual;
	


	public String getCorreu() {
		return correu;
	}

	public void setCorreu(String correu) {
		this.correu = correu;
	}

	private String password;
	
	private ArrayList<Compra> compres;
		
	
	
	
	public ArrayList<String> getLocalitats() {
		return localitats;
	}

	public void setLocalitats(ArrayList<String> localitats) {
		this.localitats = localitats;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsuariClient getClient() {
		return client;
	}

	public void setClient(UsuariClient client) {
		this.client = client;
	}

	public ArrayList<Compra> getCompres() {
		return compres;
	}

	public void setCompres(ArrayList<Compra> compres) {
		this.compres = compres;
	}
	
	

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getTeatre() {
		return teatre;
	}

	public void setTeatre(String teatre) {
		this.teatre = teatre;
	}

	public String getEspectacle() {
		return espectacle;
	}

	public void setEspectacle(String espectacle) {
		this.espectacle = espectacle;
	}

	public String getDataActual() {
		return dataActual;
	}

	public void setDataActual(String dataActual) {
		this.dataActual = dataActual;
	}

	public String login() {
		UsuariClient c=gestor.login(correu, password);
		
		if(c==null) {
			addActionError(getText("fail.login"));
			return INPUT;
		}
		addActionMessage(getText("login.success"));
		
		this.session.put("login", c);
		return SUCCESS;
	}

	public String registrar() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date datatmp=new Date();
		dataActual=df.format(datatmp);
		if(client==null) {
			
		localitats= gestor.obtenirLocalitats();
		return LOGIN;
		}else {
		try {
		if(gestor.inserir(client)) {
			addActionMessage(getText("signup.success"));
			
			return SUCCESS;
		}else {
			localitats= gestor.obtenirLocalitats();
			addActionError("Error al registrar, Tingués en compte que tant l'email com el dni han de ser únics");
			return INPUT;
			
		}
		
		
		}catch (Exception e) {
			// TODO: handle exception
			localitats= gestor.obtenirLocalitats();
			addActionError("Error al Servidor, Tingués en compte que tant l'email com el dni han de ser únics");
			return INPUT;
		}
		}
		
	}
	
	public String logout(){
		
		
		session.clear();
		
		return SUCCESS;
	}
	
	public String obtenirCompres() {
		if(this.isUserLogged()==false) {
			return LOGIN;
		}
		try {
		
		if(search==null && espectacle==null && teatre==null) {
		
		UsuariClient c=(UsuariClient) session.get("login");
		compres = gestor.obtenirCompres(c.getNIF());
		}else {
			UsuariClient c=(UsuariClient) session.get("login");
			compres = gestor.obtenirCompresFiltrades(c.getNIF(),search,espectacle,teatre);	
		}
		
		return SUCCESS;
		}catch (Exception e) {
			// TODO: handle exception
			
			return SUCCESS;
		}
	}
	
	

}
