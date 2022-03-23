/**
 * 
 */
package com.devlaros.projecto_jsf.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devlaros.projecto_jsf.entity.EmpleadoEntity;
import com.devlaros.projecto_jsf.service.EmpleadoService;

/**
 * @author DevLar
 *
 */
@ManagedBean
@ViewScoped
public class EmpleadoController {

	private List<EmpleadoEntity> employes;
	private EmpleadoService employesServices = new EmpleadoService();
	
	
	public void cargar() {
	this.employes=	this.employesServices.llenarEmpleados();
	}
	
	@PostConstruct
	public void init() {
		this.cargar();
	}

	/**
	 * @return the employes
	 */
	public List<EmpleadoEntity> getEmployes() {
		return employes;
	}

	/**
	 * @param employes the employes to set
	 */
	public void setEmployes(List<EmpleadoEntity> employes) {
		this.employes = employes;
	}
	
	
	//geters and setters
	
	
	
	
}
