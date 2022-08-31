package com.example.demo.hilos.paralelo;

import java.util.Arrays;

import com.example.demo.hilos.tradicional.Cajero;
import com.example.demo.hilos.tradicional.GestorCajero;

public class MainParalelo {

	public static void main(String[] args) {
		
		long tiempoInicial = System.currentTimeMillis();
		
		System.out.println("Nombre de hilo: " + Thread.currentThread().getName());
		CajeroParalelo cajero1 = new CajeroParalelo("Carlos", Arrays.asList("Pepito"));
		CajeroParalelo cajero2 = new CajeroParalelo("Luis", Arrays.asList("Daniela"));
		CajeroParalelo cajero3 = new CajeroParalelo("Paul", Arrays.asList("Pedro"));

		CajeroParalelo cajero4 = new CajeroParalelo("Carlos", Arrays.asList("Miguel"));
		CajeroParalelo cajero5 = new CajeroParalelo("Luis", Arrays.asList("Juan"));
		CajeroParalelo cajero6 = new CajeroParalelo("Paul", Arrays.asList("Carla"));

		
		PCCajeroParalelo gestorAtencion1 = new PCCajeroParalelo(cajero1);
		gestorAtencion1.start();
		PCCajeroParalelo gestorAtencion2 = new PCCajeroParalelo(cajero2);
		gestorAtencion2.start();
		PCCajeroParalelo gestorAtencion3 = new PCCajeroParalelo(cajero3);
		gestorAtencion3.start();
		
		PCCajeroParalelo gestorAtencion4 = new PCCajeroParalelo(cajero4);
		gestorAtencion4.start();
		PCCajeroParalelo gestorAtencion5 = new PCCajeroParalelo(cajero5);
		gestorAtencion5.start();
		PCCajeroParalelo gestorAtencion6 = new PCCajeroParalelo(cajero6);
		gestorAtencion6.start();
		
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;

		System.out.println("El tiempo transcurrido ha sido " + tiempoTranscurrido);

	}

}
