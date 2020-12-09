package com.clearminds.bhfs.bdd.test;

import com.clearminds.bhfs.dtos.Estudiante;
import com.clearminds.bhfs.excepciones.BDDException;
import com.clearminds.bhfs.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Harold","Flores"));
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}

}
