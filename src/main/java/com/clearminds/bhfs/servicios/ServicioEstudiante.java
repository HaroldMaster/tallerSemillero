package com.clearminds.bhfs.servicios;

import com.clearminds.bhfs.dtos.Estudiante;
import com.clearminds.bhfs.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	@Override
	public void abrirConexion() throws BDDException {
		// TODO Auto-generated method stub
		super.abrirConexion();
	}

	@Override
	public void cerrarConexion() {
		// TODO Auto-generated method stub
		super.cerrarConexion();
	}
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("Insertando Estudiante: " +estudiante);
		cerrarConexion();
	}
}
