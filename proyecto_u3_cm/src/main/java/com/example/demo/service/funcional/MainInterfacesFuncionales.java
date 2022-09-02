package com.example.demo.service.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainInterfacesFuncionales {
	
	public static boolean prueba(Integer numero) {
		return numero >=3;
	}
	
	public static void imprimir(String i) {
		log.info("Imprimiendo "+i);
	}
	

	private static final Logger log = LoggerFactory.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] ags) {

		ConsumoMetodosHighOrder metodosHO = new ConsumoMetodosHighOrder();

		//Tarea 34
		
		List<String> lista = new ArrayList<>();
		lista.add("Carlos");
		lista.add("Raul");
		lista.add("Camila");
		lista.add("Roberto");
		lista.add("Laura");
		
		//Supplier
		log.info("-------> JAVA Supplier: ");
		
		Stream<String> test=Stream.generate(()->"Se ha generado el estudiante: "+lista.get(3)).limit(1);
		test.forEach(cadena -> log.info(cadena));
		
		//Consumer
		log.info("-------> JAVA Consumer: ");
		lista.forEach(cadena->log.info("Estudiante:" +cadena));
		
		//Predicate
		log.info("-------> JAVA Predicate: ");
		Stream<String> nuevaLista= lista.stream().filter(cadena->cadena.contains("a"));
		nuevaLista.forEach(cadena->log.info("Estudiantes con a: "+cadena));//numero->(numero>=3)
		
		//Function
		log.info("-------> JAVA Function: ");
		Stream<Integer> listaCambiada=lista.stream().map(longitud->{
			Integer valor=0;
				String algo=longitud;
				valor=valor+algo.length();
			return valor;
			});
		listaCambiada.forEach(cadena->log.info("numero de char: "+cadena.toString()));	
		
		//Supplier
//		log.info("JAVA Supplier: ");
//		Stream<String> test=Stream.generate(()->"Edison 3").limit(2);
//		test.forEach(cadena -> log.info(cadena));//esta parte es consumer
		
		//Consumer
//		log.info("JAVA Consumer: ");
//		List<Integer>listaNumeros=Arrays.asList(1,2,3,4,5);
//		listaNumeros.forEach(numero->log.info(numero.toString()));
		
		//Predicate
//		log.info("JAVA Predicate: ");
//		Stream<Integer> nuevaLista= listaNumeros.stream().filter(numero->prueba(numero));
//		nuevaLista.forEach(cadena->log.info(cadena.toString()));//numero->(numero>=3)
		
		//Function
//		log.info("JAVA Function: ");
//		Stream<String> listaCambiada=listaNumeros.stream().map(numeroLista->{
//			Integer valor=numeroLista+1;
//			String cadena="num: " +valor.toString();
//			return cadena;
//			});
		
		//Declarativa: ideas/item
//		listaCambiada.forEach(cadena->imprimir(cadena));
		//Imperativa: paso a paso
//		log.info("JAVA UnaryOperator: ");
//		for(String valor: ) {
//			imprimir(valor);
//		}
		
		//Unary
		
		
		
		//////////////////tarea 33
//		// supplier----
//		log.info("-----------------------------Supplier--------------------------------------" );
//		// clases
//		IPersonaSupplier<String> supplierEjemplo = new PersonaSupplierImpl();
//		log.info("suplier Clase: " + supplierEjemplo.getUbicacion());
//		
//		// lambdas
//		IPersonaSupplier<String> supplierLambda = () -> "Cayambe, Ecuador";
//		log.info("Supplier Lambdas: " + supplierLambda.getUbicacion());
//
//		// Metodos High Order
//		String valorHO = metodosHO.consumirSupplier(() -> "Buscando Ubicacion");
//		log.info("HO Supplier: " + valorHO );
//
//		String valorHO1 = metodosHO.consumirSupplier2(() -> {
//			String valorConsultado = "Guayaquil, Ecuador";
//			return valorConsultado;
//		});
//
//		log.info("HO Supplier: " + valorHO1);
//		
//		// Consumer----
//		log.info("-----------------------------Consumer--------------------------------------" );
//		// clases
//		IPersonaConsummer<String> consummerClase = new PersonaConsumerImpl();
//		log.info("Consumer Clase: ");
//		consummerClase.accept("Estudiante numero 1");
//
//		// lambdas
//		IPersonaConsummer<String> consumerLambda = cadena -> log.info(cadena);
//		log.info("Consumer Lambda: ");
//		consumerLambda.accept("Estudiante numero 2");
//
//		// metodos High order
//		log.info("HO Consumer : ");
//		metodosHO.consumirConsumer(valor -> {log.info("El valor generado es: "+valor.toString());}, 100);
//
//		// predicate---
//		log.info("-----------------------------Predicate--------------------------------------" );
//		
//		String texto="El machine Learning es una rama de la inteligencia artificial encargada de ge"
//				+ "nerar algoritmos que son capaces de aprender y no hay que programarlos de forma explícita. "
//				+ "Estos algoritmos se alimentan de grandes cantidades de datos para mejorar "
//				+ "su exactitud al momento de tomar una decisi ́on en relaci ́on a la informaci ́on historica.";
//		
//		// Clases
//		IPersonaPredicate<String> predicateClase = new PersonaPredicateImpl();	
//		boolean p=predicateClase.evaluar(texto);
//		log.info("Predicate Clase: "+p);
//		
//		// Lambdas
//		IPersonaPredicate<String> predicateLambda = cadena -> cadena.length()<50;
//		String resultado = predicateLambda.evaluar(texto) + "";
//
//		log.info("Predicate lambda: " + resultado);
//
//		// metodos High order
//		boolean respuesta = metodosHO.consumirPredicate(cadena -> cadena.contains("inteligencia artificial"), texto);
//		log.info("HO Predicate : " + respuesta);
////
////		// Function
//		log.info("-----------------------------Function--------------------------------------" );
////		// Clases
//		IPersonaFunction<String,Integer> functionClase = new PersonaFuntionImpl();	
//		String num=functionClase.aplicar(200);
//		log.info("Predicate Clase: "+num);
////		// Lambda
//		IPersonaFunction<Integer, String> functionLambda = cadena -> {
//			Integer valor = Integer.parseInt(cadena);
//			Integer valorFinal = valor - texto.length();
//			return valorFinal;
//		};
//
//		log.info("Function lambda: " + functionLambda.aplicar("1000"));
//
//		// High Order
//		String valorFinalHO = metodosHO.consumirFunction(valor -> {
//			String retorno = "el valor ingresado es: "+valor.toString();
//			return retorno;
//		}, 120);
//
//		log.info("HO function: " + valorFinalHO);
////
//		// UnaryOperator
//		// Clases
//		IPersonaFunctionUnaryOperator<String> unaryPersona=new PersonaUnaryOperatorImpl();
//		String algo=unaryPersona.aplicar("algo");
//		log.info(algo);
//		// Lambda
//		IPersonaUnaryOperator<String> unaryLambda = cadena -> {
//			String valorFinal = cadena.concat(" sufijo");
//			return valorFinal;
//		};
//
//		log.info("UnaryOperator lambda: " + unaryLambda.apply("Daniel"));

		
		
		
		
		
		
		
		
		
		
//		// supplier----
//		// clases
//		IPersonaSupplier<String> supplier = new PersonaSupplierImpl();
//		log.info("suplier Clase: " + supplier.getNombre());
//
//		IPersonaSupplier<String> supplierTE = new PersonaTerceraEdadSupplierImpl();
//		log.info("suplier Clase: " + supplierTE.getNombre());
//		// lambdas
//		IPersonaSupplier<String> supplierLambda = () -> "Edison2";
//		log.info("Supplier Lambdas: " + supplierLambda.getNombre());
//
//		IPersonaSupplier<String> supplierLambdaTE = () -> "Daniel TE2";
//		log.info("Supplier Lambdas: " + supplierLambdaTE.getNombre());
//
//		//Metodos High Order
//		String valorHO=metodosHO.consumirSupplier(()->"Hola mundo");
//		log.info("HO Supplier " + valorHO);
//		
//		String valorHO1 = metodosHO.consumirSupplier(()-> {
//			String valorConsultado="12313454667";
//			return valorConsultado;}
//		);
//		
//		log.info("HO Supplier " + valorHO1);
//		
//		// Consumer----
//		// clases
//		IPersonaConsummer<String> consummerClase = new PersonaConsumerImpl();
//		consummerClase.accept("Prueba del Consumer clase");
//
//		// lambdas
//		IPersonaConsummer<String> consumerLambda = cadena -> System.out.println(cadena);
//		consumerLambda.accept("Prueba consumer Lambda");
//
//		//metodos High order
//		metodosHO.consumirConsumer(valor->System.out.println(valor), 2);
//		
//		
//		// predicate---
//		// Clases
//		// Lambdas
//		IPersonaPredicate<String> predicateLambda = cadena -> cadena.contains("z");
//		String resultado = predicateLambda.evaluar("Edizon") + "";
//
//		log.info("El predicate lambda resulto: " + resultado);
//
//		//metodos High order
//		boolean respuesta=metodosHO.consumirPredicate(cadena->cadena.contains("z"), "Edizon");
//		log.info("El predicate high order resulto: " + respuesta);
//		
//		
//		// Function
//		// Clases
//		// Lambda
//		IPersonaFunction<Integer, String> functionLambda = cadena -> {
//			Integer valor = Integer.parseInt(cadena);
//			Integer valorFinal = valor - 2;
//			return valorFinal;
//		};
//
//		log.info("El function lambda resulto: " + functionLambda.aplicar("7"));
//		
//		//High Order
//		String valorFinalHO=metodosHO.consumirFunction(valor -> {
//			String retorno=valor.toString()+"A";
//			return retorno;
//		}, 1);
//		
//		log.info("HO function "+valorFinalHO);
//		
//		// UnaryOperator
//		// Clases
//		// Lambda
//		IPersonaUnaryOperator<String> unaryLambda= cadena ->{
//			String valorFinal=cadena.concat(" sufijo");
//			return valorFinal;
//		};
//		
//		log.info("El UnaryOperator lambda resulto: " + unaryLambda.apply("Daniel"));

	}

}
