package com.clearminds.bhfs.bdd.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.clearminds.bhfs.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String valor = ConexionBDD.leerPropiedad("usuario");
			System.out.println(valor);
			valor = ConexionBDD.leerPropiedad("xx");
			System.out.println(valor);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
