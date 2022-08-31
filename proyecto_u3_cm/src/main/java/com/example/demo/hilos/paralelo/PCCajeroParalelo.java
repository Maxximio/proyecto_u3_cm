package com.example.demo.hilos.paralelo;

import java.util.concurrent.TimeUnit;

import com.example.demo.hilos.tradicional.Cajero;

public class PCCajeroParalelo extends Thread{

	private CajeroParalelo cajero;
	
	public PCCajeroParalelo(CajeroParalelo cajero) {
		this.cajero=cajero;
	}
	
	//disparar el metodo a paralelisar
	@Override
	public void run() {
		this.procesar(this.cajero);
	}
	
	public void procesar(CajeroParalelo cajero) {
		long tiempoInicial = System.currentTimeMillis();
		System.out.println("Nombre de hilo: " + Thread.currentThread().getName());
		System.out.println("Procesando cajero: "+cajero);
		for(String cliente: cajero.getClientes()) {
			atenderCliente(cliente);
		}
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
		
		System.out.println("termino: "+cajero.getNombre()+" en " + tiempoTranscurrido+" segundos");
	}
	
	private void atenderCliente(String cliente){
		System.out.println("Atendiendo a: "+cliente);
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
