package com.example.demo.service.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonaConsumerImpl implements IPersonaConsummer<String>{

	private static final Logger log = LoggerFactory.getLogger(MainInterfacesFuncionales.class);
	
	@Override
	public void accept(String arg1) {
		String otraCosa=" fue aceptado";
		log.info(arg1+otraCosa);
	}

}
