package com.clearminds.bhfs.bdd.test;

import java.sql.Connection;

import com.clearminds.bhfs.bdd.ConexionBDD;
import com.clearminds.bhfs.excepciones.BDDException;

public class TestConexion {

	public static void main(String[] args) {
		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			if(conexion!=null){
				System.out.println("Conexion exitosa");
			}
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
