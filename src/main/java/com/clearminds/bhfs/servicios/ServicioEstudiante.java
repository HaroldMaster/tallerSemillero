package com.clearminds.bhfs.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

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

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando Estudiante: " + estudiante);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String sql = "insert into estudiantes(nombre,apellido,edad,fecha_modificacion) values('"
					+ estudiante.getNombre() + "','" + estudiante.getApellido() + "'," + estudiante.getEdad() + ",'"
					+ DateUtil.obtenerFecha(new Date()) + "')";
			System.out.println("Script: " + sql);
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Actualizando Estudiante: " + estudiante);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String sql = "UPDATE estudiantes SET edad= " + estudiante.getEdad() + ", nombre='" + estudiante.getNombre()
					+ "', apellido='" + estudiante.getApellido() + "', fecha_modificacion='"
					+ DateUtil.obtenerFecha(new Date()) + "'" + " WHERE id=" + estudiante.getId();
			System.out.println("Script: " + sql);
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}
}
