package com.example.demo.hilos.tradicional;

import java.util.concurrent.TimeUnit;

public class GestorCajero {

	public void procesar(Cajero cajero) {
		System.out.println("Procesando cajero: "+cajero);
		for(String cliente: cajero.getClientes()) {
			atenderCliente(cliente);
		}
		
	}
	
	private void atenderCliente(String cliente){
		System.out.println("Atendiendo a: "+cliente);
		try {
			TimeUnit.SECONDS.sleep(10);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
