package com.example.demo.hilos.paralelo;

import java.util.Arrays;

import com.example.demo.hilos.tradicional.Cajero;
import com.example.demo.hilos.tradicional.GestorCajero;

public class MainParalelo {

	public static void main(String[] args) {
		
		long tiempoInicial = System.currentTimeMillis();
		
		int random1 = (int) (Math.random()*(5-1)) + 1;
		int random2 = (int) (Math.random()*(5-1)) + 1;
		int random3 = (int) (Math.random()*(5-1)) + 1;
		int random4 = (int) (Math.random()*(5-1)) + 1;
		int random5 = (int) (Math.random()*(5-1)) + 1;
		
		CajeroParalelo cajero1 = new CajeroParalelo("Carlos", Arrays.asList("Pepito","Juanito"));
		CajeroParalelo cajero2 = new CajeroParalelo("Luis", Arrays.asList("Daniela","Laura"));
		CajeroParalelo cajero3 = new CajeroParalelo("Paul", Arrays.asList("Pedro","Vicente"));
		CajeroParalelo cajero4 = new CajeroParalelo("Carla", Arrays.asList("Miguel","Mariana"));
		CajeroParalelo cajero5 = new CajeroParalelo("Esteban", Arrays.asList("Juan","Sonia"));

		
		PCCajeroParalelo gestorAtencion1 = new PCCajeroParalelo(cajero1, random1);
		gestorAtencion1.start();
		PCCajeroParalelo gestorAtencion2 = new PCCajeroParalelo(cajero2, random2);
		gestorAtencion2.start();
		PCCajeroParalelo gestorAtencion3 = new PCCajeroParalelo(cajero3, random3);
		gestorAtencion3.start();
		PCCajeroParalelo gestorAtencion4 = new PCCajeroParalelo(cajero4, random4);
		gestorAtencion4.start();
		PCCajeroParalelo gestorAtencion5 = new PCCajeroParalelo(cajero5, random5);
		gestorAtencion5.start();
		
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;

		System.out.println("El tiempo transcurrido ha sido " + tiempoTranscurrido);

	}

}
