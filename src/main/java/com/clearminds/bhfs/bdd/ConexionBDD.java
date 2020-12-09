package com.clearminds.bhfs.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.bhfs.excepciones.BDDException;

public class ConexionBDD {
	public static String leerPropiedad(String propiedad) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileReader(
				"C:\\Users\\ASUS\\Documents\\0.Capacitacion\\CapacitacionCMC\\Repositorios\\tallerSemillero\\conexion.properties"));
		if (p.getProperty(propiedad) != null) {
			return p.getProperty(propiedad);
		} else {
			return null;
		}
	}

	public static Connection obtenerConexion() throws BDDException {
		String usuario;
		try {
			usuario = leerPropiedad("usuario");
			String password = leerPropiedad("password");
			String urlConexion = leerPropiedad("urlConexion");
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = null;
			con = DriverManager.getConnection(urlConexion, usuario, password);
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new BDDException("No se puedo conectar a la base de datos");
		}

	}
}
