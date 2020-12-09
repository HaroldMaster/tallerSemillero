package com.clearminds.bhfs.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {
	public static String leerPropiedad(String propiedad) throws FileNotFoundException, IOException{
		Properties p = new Properties();
		p.load(new FileReader("C:\\Users\\ASUS\\Documents\\0.Capacitacion\\CapacitacionCMC\\Repositorios\\tallerSemillero\\conexion.properties"));
		if(p.getProperty(propiedad)!=null){
			return p.getProperty(propiedad);
		}
		else{
			return null;
		}
	}
}