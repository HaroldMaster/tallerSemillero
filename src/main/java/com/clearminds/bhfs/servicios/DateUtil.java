package com.clearminds.bhfs.servicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String FORMATO_COMPLETO = "yyyy-MM-dd HH:mm:ss";
	public static String obtenerFecha(Date date){
		SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_COMPLETO);
		String fechaFormateada = formateador.format(date);
		return fechaFormateada;
		
	}
}
