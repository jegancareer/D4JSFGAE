package elmnz.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
 
@ManagedBean(name="apiAIAction")
@SessionScoped
public class APIAIAction {
	private int prgressCount;
	private int totalFetchCount;
	private int totalPplCount;
	private String dataLocation;
	private int rollId=0;
	
	public int getRollId() {
		return rollId;
	}


	public void setRollId(int rollId) {
		this.rollId = rollId;
	}


	public void submit() throws IOException {
		//var prgrCount=200, totalFetchCount=50, totalPplCount=100, initPrgrCount=0, dataJsonObj='../d4/data/ustrade_2000-2015.csv';
		if(rollId==0) {
			setPrgressCount(200);
			setTotalFetchCount(50);
			setTotalPplCount(100);
			setDataLocation("../d4/data/ustrade_2000-2015.csv");
		} else {
			setPrgressCount(100);
			setTotalFetchCount(10);
			setTotalPplCount(10);
			setDataLocation("../d4/data/ustrade_2000-2014.csv");
		}
	    ExternalContext    externalContext = FacesContext.getCurrentInstance().getExternalContext();
	    HttpServletRequest request         = (HttpServletRequest) externalContext.getRequest();
	    FacesContext.getCurrentInstance().getExternalContext().redirect(request.getContextPath()+"/pages/setup.xhtml?faces-redirect=true");
	
	    images = new ArrayList<String>();
        for (int i = 1; i <= 4; i++) {
            images.add("nature" + i + ".jpg");
        }
	}
	
	
	public int getPrgressCount() {
		return prgressCount;
	}

	public void setPrgressCount(int prgressCount) {
		this.prgressCount = prgressCount;
	}

	public int getTotalFetchCount() {
		return totalFetchCount;
	}

	public void setTotalFetchCount(int totalFetchCount) {
		this.totalFetchCount = totalFetchCount;
	}

	public int getTotalPplCount() {
		return totalPplCount;
	}

	public void setTotalPplCount(int totalPplCount) {
		this.totalPplCount = totalPplCount;
	}

	public String getDataLocation() {
		return dataLocation;
	}

	public void setDataLocation(String dataLocation) {
		this.dataLocation = dataLocation;
	}

	private String message="";
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	 private List<String> images;
     
    public List<String> getImages() {
        return images;
    }
	
	@Override
	public String toString() {
		return super.toString();
	}
 
}
