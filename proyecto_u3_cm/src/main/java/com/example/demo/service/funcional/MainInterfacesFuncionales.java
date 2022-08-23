package com.example.demo.service.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.ProyectoU3CmApplication;

public class MainInterfacesFuncionales {

	private static final Logger log =LoggerFactory.getLogger(MainInterfacesFuncionales.class);
	
	public static void main(String[]ags ) {
		
		//supplier----
		//clases
		IPersonaSupplier<String> supplier=new PersonaSupplierImpl();
		log.info("suplier Clase: "+supplier.getNombre());
		
		IPersonaSupplier<String> supplierTE=new PersonaTerceraEdadSupplierImpl();
		log.info("suplier Clase: "+supplierTE.getNombre());
		//lambdas
		IPersonaSupplier<String> supplierLambda=() ->"Edison2";
		log.info("Supplier Lambdas: "+supplierLambda.getNombre());
		
		IPersonaSupplier<String> supplierLambdaTE=() ->"Daniel TE2";
		log.info("Supplier Lambdas: "+supplierLambdaTE.getNombre());
		
		
		//Consumer----
		//clases
		IPersonaConsummer<String> consummerClase=new PersonaConsumerImpl();
		consummerClase.accept("Prueba del Consumer clase");
		
		//lambdas
		IPersonaConsummer<String> consumerLambda = cadena -> System.out.println();
		consumerLambda.accept("Prueba consumer Lambda");
		
		//predicate---
		
		//
		
	}
	
}
