/**
 * 
 */
package com.devlaros.projecto_jsf.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author DevLar
 *
 */
@ManagedBean	
public class LoginController {
	private String name;
	private String password;



//	public String redireccionar() {
//
//	}

//	getters and setters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	//metods

		public void validar() {
			if (name.equals("devlaros") && password.equals("12345")) {
				FacesContext.getCurrentInstance().addMessage("frmLogin:txtUser",
						new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Correcto", ""));
				System.out.println("nombre: " + name);
				try {
					this.redireccionar("principal.xhtml");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					FacesContext.getCurrentInstance().addMessage("frmLogin:txtPassword",
							new FacesMessage(FacesMessage.SEVERITY_FATAL, "No se encuentra la pagina", ""));
					System.out.println("incorrecto " + name);
				}
			} else {
				FacesContext.getCurrentInstance().addMessage("frmLogin:txtPassword",
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Password &/o usuairo incorrecto", ""));
				System.out.println("incorrecto " + name);
			}

		}
		
		public void redireccionar (String pagina) throws IOException {
			
			ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
			ec.redirect(pagina);
		}
		

}
