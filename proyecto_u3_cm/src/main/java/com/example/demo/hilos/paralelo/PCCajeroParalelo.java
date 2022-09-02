package com.example.demo.hilos.paralelo;

import java.util.concurrent.TimeUnit;

import com.example.demo.hilos.tradicional.Cajero;

public class PCCajeroParalelo extends Thread{

	private CajeroParalelo cajero;
	private int r;
	
	public PCCajeroParalelo(CajeroParalelo cajero,int r) {
		this.cajero=cajero;
		this.r=r;
	}
	
	//disparar el metodo a paralelisar
	@Override
	public void run() {
		this.procesar2(this.cajero, this.r);
	}
	
//	public void procesar(CajeroParalelo cajero) {
//		long tiempoInicial = System.currentTimeMillis();
//		System.out.println("Nombre de hilo: " + Thread.currentThread().getName());
//		System.out.println("Procesando cajero: "+cajero);
//		for(String cliente: cajero.getClientes()) {
//			atenderCliente(cliente);
//		}
//		long tiempoFinal = System.currentTimeMillis();
//		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
//		
//		System.out.println("termino: "+cajero.getNombre()+" en " + tiempoTranscurrido+" segundos");
//	}
//	
//	private void atenderCliente(String cliente){
//		System.out.println("Atendiendo a: "+cliente);
//		try {
//			TimeUnit.SECONDS.sleep(5);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	public void procesar2(CajeroParalelo cajero,int ran) {
		long tiempoInicial = System.currentTimeMillis();
		
		
		System.out.println("Nombre de hilo: " + Thread.currentThread().getName());
		System.out.println("Procesando cajero: "+cajero);
		
		
		for(String cliente: cajero.getClientes()) {
			atenderCliente2(cliente,ran);
		}
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
		
		System.out.println("termino: "+cajero.getNombre()+" en " + tiempoTranscurrido+" segundos");
	}
	
	private void atenderCliente2(String cliente,int r){
		System.out.println("Saludando a: "+cliente);
		try {
			TimeUnit.SECONDS.sleep(r);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Pidiendo credenciales a: "+cliente);
		try {
			TimeUnit.SECONDS.sleep(r);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Solicitando servicio a: "+cliente);
		try {
			TimeUnit.SECONDS.sleep(r);
		}catch (Exception e) {
			e.printStackTrace();
		}
		int valor=r*100;
		System.out.println(cliente+ " Despachado, con su saldo de :"+valor);
	}
	
}
