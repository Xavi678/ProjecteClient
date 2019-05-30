package cat.almata.daw;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import cat.almata.daw.gestor.GestorRest;
import cat.almata.daw.models.UsuariClient;

public class MyAction extends ActionSupport implements SessionAware{
	
	protected GestorRest gestor= new GestorRest();

	protected Map<String, Object> session;
	
	protected String email;
	
	
	public Map<String, Object> getSession() {
        return session;
}

public void setSession(Map<String, Object> map) {
        this.session = map;
}
	
	public Boolean isUserLogged() {
		UsuariClient user=(UsuariClient) session.get("login");
		
		
		if(user==null) {
			return false;
		}
		email=user.getEmail();
		return true;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
