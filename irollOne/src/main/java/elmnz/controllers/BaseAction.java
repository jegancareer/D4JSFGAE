package elmnz.controllers;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class BaseAction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8985397336645618080L;

	public void redirectTo(String pageUrl) throws IOException {
	    ExternalContext    externalContext = FacesContext.getCurrentInstance().getExternalContext();
	    HttpServletRequest request         = (HttpServletRequest) externalContext.getRequest();
	    FacesContext.getCurrentInstance().getExternalContext().redirect(request.getContextPath()+pageUrl+"?faces-redirect=true");
	}
	
	public void addMessage(String message) {
	    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message));
	}
}
