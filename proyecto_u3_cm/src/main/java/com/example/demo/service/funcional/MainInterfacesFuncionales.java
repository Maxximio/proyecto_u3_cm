package com.example.demo.service.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.ProyectoU3CmApplication;

public class MainInterfacesFuncionales {

	private static final Logger log = LoggerFactory.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] ags) {

		ConsumoMetodosHighOrder metodosHO = new ConsumoMetodosHighOrder();
		
		// supplier----
		// clases
		IPersonaSupplier<String> supplier = new PersonaSupplierImpl();
		log.info("suplier Clase: " + supplier.getNombre());

		IPersonaSupplier<String> supplierTE = new PersonaTerceraEdadSupplierImpl();
		log.info("suplier Clase: " + supplierTE.getNombre());
		// lambdas
		IPersonaSupplier<String> supplierLambda = () -> "Edison2";
		log.info("Supplier Lambdas: " + supplierLambda.getNombre());

		IPersonaSupplier<String> supplierLambdaTE = () -> "Daniel TE2";
		log.info("Supplier Lambdas: " + supplierLambdaTE.getNombre());

		//Metodos High Order
		String valorHO=metodosHO.consumirSupplier(()->"Hola mundo");
		log.info("HO Supplier " + valorHO);
		
		String valorHO1 = metodosHO.consumirSupplier(()-> {
			String valorConsultado="12313454667";
			return valorConsultado;}
		);
		
		log.info("HO Supplier " + valorHO1);
		
		// Consumer----
		// clases
		IPersonaConsummer<String> consummerClase = new PersonaConsumerImpl();
		consummerClase.accept("Prueba del Consumer clase");

		// lambdas
		IPersonaConsummer<String> consumerLambda = cadena -> System.out.println(cadena);
		consumerLambda.accept("Prueba consumer Lambda");

		//metodos High order
		metodosHO.consumirConsumer(valor->System.out.println(valor), 2);
		
		
		// predicate---
		// Clases
		// Lambdas
		IPersonaPredicate<String> predicateLambda = cadena -> cadena.contains("z");
		String resultado = predicateLambda.evaluar("Edizon") + "";

		log.info("El predicate lambda resulto: " + resultado);

		//metodos High order
		boolean respuesta=metodosHO.consumirPredicate(cadena->cadena.contains("z"), "Edizon");
		log.info("El predicate high order resulto: " + respuesta);
		
		
		// Function
		// Clases
		// Lambda
		IPersonaFunction<Integer, String> functionLambda = cadena -> {
			Integer valor = Integer.parseInt(cadena);
			Integer valorFinal = valor - 2;
			return valorFinal;
		};

		log.info("El function lambda resulto: " + functionLambda.aplicar("7"));
		
		//High Order
		String valorFinalHO=metodosHO.consumirFunction(valor -> {
			String retorno=valor.toString()+"A";
			return retorno;
		}, 1);
		
		log.info("HO function "+valorFinalHO);
		
		// UnaryOperator
		// Clases
		// Lambda
		IPersonaUnaryOperator<String> unaryLambda= cadena ->{
			String valorFinal=cadena.concat(" sufijo");
			return valorFinal;
		};
		
		log.info("El UnaryOperator lambda resulto: " + unaryLambda.apply("Daniel"));
		
	}

	

}
