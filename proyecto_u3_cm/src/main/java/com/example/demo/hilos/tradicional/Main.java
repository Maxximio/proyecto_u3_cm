package com.example.demo.hilos.tradicional;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long tiempoInicial=System.currentTimeMillis();
		
		Cajero cajero1=new Cajero("Carlos",Arrays.asList("Pepito"
				,"Juan","Daniela","Pedro"));
		
		Cajero cajero2=new Cajero("Luis",Arrays.asList("Pepito2"
				,"Juan2","Daniela2","Pedro2"));
		
		Cajero cajero3=new Cajero("Paul",Arrays.asList("Pepito3"
				,"Juan3","Daniela3","Pedro3"));
		
		
		GestorCajero gestorAtencion=new GestorCajero();
			gestorAtencion.procesar(cajero1);
			gestorAtencion.procesar(cajero2);
			gestorAtencion.procesar(cajero3);
			
			long tiempoFinal=System.currentTimeMillis();
			long tiempoTranscurrido=(tiempoFinal-tiempoInicial)/1000;
			
			System.out.println("El tiempo transcurrido ha sido "+tiempoTranscurrido);
	}

}
