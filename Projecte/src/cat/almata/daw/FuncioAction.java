package cat.almata.daw;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cat.almata.daw.gestor.GestorRest;
import cat.almata.daw.models.Funcio;

public class FuncioAction extends MyAction {
	
	
	private int id;
	private List<Funcio> funcions;
	private String cartell;
	private String titol;
	private List<List<Integer>> butaques;
	
	private Funcio func;
	
	
	
	

	public Funcio getFunc() {
		return func;
	}



	public void setFunc(Funcio func) {
		this.func = func;
	}







	public List<List<Integer>> getButaques() {
		return butaques;
	}



	public void setButaques(List<List<Integer>> butaques) {
		this.butaques = butaques;
	}



	public String getCartell() {
		return cartell;
	}



	public void setCartell(String cartell) {
		this.cartell = cartell;
	}



	public String getTitol() {
		return titol;
	}



	public void setTitol(String titol) {
		this.titol = titol;
	}



	public List<Funcio> getFuncions() {
		return funcions;
	}



	public void setFuncions(List<Funcio> funcions) {
		this.funcions = funcions;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	
	public String select() {
		this.isUserLogged();
		 func=gestor.obtenirFuncio(id);
		
		if(func!=null) {
			
			 butaques = new ArrayList<List<Integer>>();
			
			for(int i=1;i<=func.getTeatre().getFiles();i++) {
				
				List<Integer> columns=new ArrayList<Integer>();
				
				
				for(int j=1;j<=func.getTeatre().getColumnes();j++) {
					
					if(func.ocupada(i,j)) {
						
						columns.add(0);
						
					}else {
					
					columns.add(j);
					
					}
					
				}
				
				butaques.add(columns);
				
			}
			
			
		

	

		}
		return SUCCESS;
	}


	public String obtenirFuncions() {
		
		this.isUserLogged();
		funcions=gestor.obtenirFuncions(this.id);
		
		
		return SUCCESS;
	}
	
	
	public String getFuncionsperTeatre() {
		this.isUserLogged();
		
		funcions=gestor.obtenirFuncionsperTeatre(id);
		return SUCCESS;
	}
	
}
