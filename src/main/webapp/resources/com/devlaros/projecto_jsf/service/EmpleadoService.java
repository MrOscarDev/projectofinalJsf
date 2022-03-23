/**
 * 
 */
package com.devlaros.projecto_jsf.service;

import java.util.ArrayList;
import java.util.List;

import com.devlaros.projecto_jsf.entity.EmpleadoEntity;

/**
 * @author DevLar
 *
 */
public class EmpleadoService {
	
	
	
	public List<EmpleadoEntity> llenarEmpleados (){
		
	 List<EmpleadoEntity> empleados = new ArrayList<>() ;
	 
	 EmpleadoEntity telcel = new EmpleadoEntity();
	 telcel.setNombreEmpleado("Oscar");
	 telcel.setPrimerApellidoEmpleado("Lara");
	 telcel.setSegundoApellidoEmpleado("Patricio");
	 
	 EmpleadoEntity unefon = new EmpleadoEntity();
	 unefon.setNombreEmpleado("jaque");
	 unefon.setPrimerApellidoEmpleado("Lara");
	 unefon.setSegundoApellidoEmpleado("Patricio");
	 
	 empleados.add(telcel);
	 empleados.add(unefon);
	 
	 
	 
		
		return empleados;
	}

}
