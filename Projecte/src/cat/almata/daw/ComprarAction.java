package cat.almata.daw;

import java.util.ArrayList;

import cat.almata.daw.models.UsuariClient;

public class ComprarAction extends MyAction {

	private ArrayList<Integer> llistaids;
	private int FuncioID;
	
	
	
	
	
	
	




	public int getFuncioID() {
		return FuncioID;
	}









	public void setFuncioID(int funcioID) {
		FuncioID = funcioID;
	}









	public ArrayList<Integer> getLlistaids() {
		return llistaids;
	}









	public void setLlistaids(ArrayList<Integer> llistaids) {
		this.llistaids = llistaids;
	}









	public String comprar() {
		if(!isUserLogged()) {
			addActionError(getText("fail.auth"));
			return INPUT;
		}
		
		
		UsuariClient c=(UsuariClient)session.get("login");
		
		gestor.comprar(c.getNIF(),llistaids,FuncioID);
		addActionMessage(getText("compra.success"));
		return SUCCESS;
	}
}
