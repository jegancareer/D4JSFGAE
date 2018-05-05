package elmnz.controllers;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
 
@ManagedBean(name="rollAuthAction")
@ViewScoped
public class RollAuthAction extends BaseAction{
	 
	private String pwd;
	private String uname; 

	public void submit() throws IOException {
		 if("test".equals(pwd) && "test".equals(uname)) {
			 //success
			 //"/pages/setup.xhtml"
			 redirectTo("/pages/roll.xhtml");
		 } else {
			 addMessage("invlalid login");
		 }
	}
	
	 
	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	@Override
	public String toString() {
		return super.toString();
	}
 
}
