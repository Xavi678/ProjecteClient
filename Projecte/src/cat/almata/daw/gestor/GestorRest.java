package cat.almata.daw.gestor;

import java.io.InputStream;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;
import javax.servlet.descriptor.JspConfigDescriptor;
import javax.ws.rs.core.MediaType;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import cat.almata.daw.models.Compra;
import cat.almata.daw.models.Espectacle;
import cat.almata.daw.models.Funcio;
import cat.almata.daw.models.Teatre;
import cat.almata.daw.models.UsuariClient;



public class GestorRest {
	private String host;
	
	
	public GestorRest() {
		
		this.host="192.168.2.203:8080";
	}
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	

	 
	 public UsuariClient login(String email, String password) {
		 try {
		 ClientConfig clientConfig = new DefaultClientConfig();
	        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
	        Client client = Client.create(clientConfig);

	        // GET request to findBook resource with a query parameter
	        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/Autenticar";
	        UsuariClient c = client.resource(url).queryParam("email", email).queryParam("password", password).accept(MediaType.APPLICATION_JSON).get(UsuariClient.class);
			
	        return c;
		 }catch (Exception e) {
			return null;
		}
	
	 }
	 
	 public List<Espectacle> obtenirEspectacles() {
			// TODO Auto-generated method stub
		 ClientConfig clientConfig = new DefaultClientConfig();
	        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
	        Client client = Client.create(clientConfig);

	        // GET request to findBook resource with a query parameter
	        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/getEspectacles";
	        List<Espectacle> c = client.resource(url).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Espectacle>>(){});
			
	        
	        return c;
	        
		}
	public List<Funcio> obtenirFuncions(int id) {
		// TODO Auto-generated method stub
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);

        // GET request to findBook resource with a query parameter
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/getFuncions";
        List<Funcio> c = client.resource(url).queryParam("id",Integer.toString( id)).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Funcio>>(){});
		
        
        return c;
		
		
	}
	public Boolean inserir(UsuariClient user) {
		// TODO Auto-generated method stub
		
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/addUser";
        
       Boolean c = client.resource(url).type(MediaType.APPLICATION_JSON).post(Boolean.class,user);
		
       
       return c;
	}
	public Funcio obtenirFuncio(int id) {
		// TODO Auto-generated method stub
		
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/getFuncio";
        
        Funcio c = client.resource(url).queryParam("id",Integer.toString( id)).accept(MediaType.APPLICATION_JSON).get(Funcio.class);
		
        return c;
	}
	public void comprar(String clientID, ArrayList<Integer> llistaids, int funcioID) {
		// TODO Auto-generated method stub
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/comprar";
        
        client.resource(url).queryParam("clientID", clientID).queryParam("funcioID",String.valueOf(funcioID)).type(MediaType.APPLICATION_JSON).post(llistaids);
	}
	public ArrayList<Compra> obtenirCompres(String nif) {
		// TODO Auto-generated method stub
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/obtenirCompres";
		
        ArrayList<Compra> c = client.resource(url).queryParam("clientID", nif).accept(MediaType.APPLICATION_JSON).get(new GenericType<ArrayList<Compra>>(){});
        
        return c;
	}
	
	
	public ArrayList<Compra> obtenirCompresFiltrades(String nif, String search, String espectacle, String teatre) {
		// TODO Auto-generated method stub
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/obtenirCompresFiltrades";
		
        ArrayList<Compra> c = client.resource(url).queryParam("clientID", nif).queryParam("data", search).queryParam("espectacle", espectacle).queryParam("teatre", teatre).accept(MediaType.APPLICATION_JSON).get(new GenericType<ArrayList<Compra>>(){});
        
        return c;
	}
	
	
	
	public ArrayList<String> obtenirLocalitats() {
		// TODO Auto-generated method stub

		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/obtenirLocalitats";
        
        ArrayList<String> c = client.resource(url).accept(MediaType.APPLICATION_JSON).get(new GenericType<ArrayList<String>>(){});
		
        return c;
	}
	public ArrayList<Espectacle> filtrarEspectacles(String search, String data, String dataFi) {
		// TODO Auto-generated method stub
		
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/searchEspectacles";
		
       ArrayList<Espectacle> espectacles= client.resource(url).queryParam("search", search).queryParam("data", data).queryParam("datafi", dataFi).accept(MediaType.APPLICATION_JSON).get(new GenericType<ArrayList<Espectacle>>(){});
	
       return espectacles;
	
	
	}
	 
	public ArrayList<Teatre> filtrarTeatres(String search, String data, String dataFi) {
		// TODO Auto-generated method stub
		
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/searchTeatres";
		
       ArrayList<Teatre> espectacles= client.resource(url).queryParam("search", search).queryParam("data", data).queryParam("datafi", dataFi).accept(MediaType.APPLICATION_JSON).get(new GenericType<ArrayList<Teatre>>(){});
	
       return espectacles;
	
	
	}
	public List<Funcio> obtenirFuncionsperTeatre(int id) {
		// TODO Auto-generated method stub
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);

        // GET request to findBook resource with a query parameter
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/getFuncionsbyTeatre";
        List<Funcio> c = client.resource(url).queryParam("id",Integer.toString( id)).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Funcio>>(){});
		
        
        return c;
		
	}
	public ArrayList<Teatre> obtenirTeatres() {
		// TODO Auto-generated method stub
		ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        String url = "http://"+host+"/ServeiRestTeatres/api/Servei/getTeatres";
		
       ArrayList<Teatre> espectacles= client.resource(url).accept(MediaType.APPLICATION_JSON).get(new GenericType<ArrayList<Teatre>>(){});
	
       return espectacles;
	}
	
	 
	 
	 
	 
	 
	 
	

}
