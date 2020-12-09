package com.clearminds.bhfs.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.bhfs.bdd.ConexionBDD;
import com.clearminds.bhfs.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion = null;

	public void abrirConexion() throws BDDException {
		conexion = ConexionBDD.obtenerConexion();
	}

	public void cerrarConexion() {
		try {
			if (conexion != null) {
				conexion.close();
				System.out.println("Conexión cerrada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al cerrar conexión");
		}
	}
}
