package com.example.demo.service.funcional;

import org.hibernate.internal.build.AllowSysOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.ProyectoU3CmApplication;

public class MainInterfacesFuncionales {

	private static final Logger log = LoggerFactory.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] ags) {

		ConsumoMetodosHighOrder metodosHO = new ConsumoMetodosHighOrder();

		// supplier----
		log.info("-----------------------------Supplier--------------------------------------" );
		// clases
		IPersonaSupplier<String> supplierEjemplo = new PersonaSupplierImpl();
		log.info("suplier Clase: " + supplierEjemplo.getUbicacion());
		
		// lambdas
		IPersonaSupplier<String> supplierLambda = () -> "Cayambe, Ecuador";
		log.info("Supplier Lambdas: " + supplierLambda.getUbicacion());

		// Metodos High Order
		String valorHO = metodosHO.consumirSupplier(() -> "Buscando Ubicacion");
		log.info("HO Supplier: " + valorHO );

		String valorHO1 = metodosHO.consumirSupplier2(() -> {
			String valorConsultado = "Guayaquil, Ecuador";
			return valorConsultado;
		});

		log.info("HO Supplier: " + valorHO1);
		
		// Consumer----
		log.info("-----------------------------Consumer--------------------------------------" );
		// clases
		IPersonaConsummer<String> consummerClase = new PersonaConsumerImpl();
		log.info("Consumer Clase: ");
		consummerClase.accept("Estudiante numero 1");

		// lambdas
		IPersonaConsummer<String> consumerLambda = cadena -> log.info(cadena);
		log.info("Consumer Lambda: ");
		consumerLambda.accept("Estudiante numero 2");

		// metodos High order
		log.info("HO Consumer : ");
		metodosHO.consumirConsumer(valor -> {log.info("El valor generado es: "+valor.toString());}, 100);

		// predicate---
		log.info("-----------------------------Predicate--------------------------------------" );
		
		String texto="El machine Learning es una rama de la inteligencia artificial encargada de ge"
				+ "nerar algoritmos que son capaces de aprender y no hay que programarlos de forma explícita. "
				+ "Estos algoritmos se alimentan de grandes cantidades de datos para mejorar "
				+ "su exactitud al momento de tomar una decisi ́on en relaci ́on a la informaci ́on historica.";
		
		// Clases
		IPersonaPredicate<String> predicateClase = new PersonaPredicateImpl();	
		boolean p=predicateClase.evaluar(texto);
		log.info("Predicate Clase: "+p);
		
		// Lambdas
		IPersonaPredicate<String> predicateLambda = cadena -> cadena.length()<50;
		String resultado = predicateLambda.evaluar(texto) + "";

		log.info("Predicate lambda: " + resultado);

		// metodos High order
		boolean respuesta = metodosHO.consumirPredicate(cadena -> cadena.contains("inteligencia artificial"), texto);
		log.info("HO Predicate : " + respuesta);
//
//		// Function
		log.info("-----------------------------Function--------------------------------------" );
//		// Clases
		IPersonaFunction<String,Integer> functionClase = new PersonaFuntionImpl();	
		String num=functionClase.aplicar(200);
		log.info("Predicate Clase: "+num);
//		// Lambda
		IPersonaFunction<Integer, String> functionLambda = cadena -> {
			Integer valor = Integer.parseInt(cadena);
			Integer valorFinal = valor - texto.length();
			return valorFinal;
		};

		log.info("Function lambda: " + functionLambda.aplicar("1000"));

		// High Order
		String valorFinalHO = metodosHO.consumirFunction(valor -> {
			String retorno = "el valor ingresado es: "+valor.toString();
			return retorno;
		}, 120);

		log.info("HO function: " + valorFinalHO);
//
		// UnaryOperator
		// Clases
		IPersonaFunctionUnaryOperator<String> unaryPersona=new PersonaUnaryOperatorImpl();
		String algo=unaryPersona.aplicar("algo");
		log.info(algo);
		// Lambda
		IPersonaUnaryOperator<String> unaryLambda = cadena -> {
			String valorFinal = cadena.concat(" sufijo");
			return valorFinal;
		};

		log.info("UnaryOperator lambda: " + unaryLambda.apply("Daniel"));

		
		
		
		
		
		
		
		
		
		
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
