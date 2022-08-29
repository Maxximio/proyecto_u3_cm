package com.example.demo.service.funcional;

import java.util.Random;

public class ConsumoMetodosHighOrder {

	public String consumirSupplier(IPersonaSupplier<String> funcion) {
		//public Integer consumirSupplier
		//String valor=funcion.getNombre();
		//Integer numero=Integer.parseInt(valor);
		
		return funcion.getUbicacion()+" cargando";
	}
	
	public String consumirSupplier2(IPersonaSupplier<String> funcion) {
		//public Integer consumirSupplier
		//String valor=funcion.getNombre();
		//Integer numero=Integer.parseInt(valor);
		
		return funcion.getUbicacion()+" se ha encontrado";
	}
	
	public void consumirConsumer(IPersonaConsummer<Integer> funcion,Integer valor) {
		
		int randomico = (int) Math.floor(Math.random()*(100-0+1)+0);
		
		funcion.accept(valor+randomico);
	}
	
	public boolean consumirPredicate(IPersonaPredicate<String> funcion,String valor) {
		return funcion.evaluar(valor);
		
	}
	
	public String consumirFunction(IPersonaFunction<String, Integer>funcion,Integer valor) {
		return funcion.aplicar(valor);
		
	}
}
