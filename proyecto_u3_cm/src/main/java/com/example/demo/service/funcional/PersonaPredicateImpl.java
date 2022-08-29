package com.example.demo.service.funcional;

public class PersonaPredicateImpl implements IPersonaPredicate<String>{

	@Override
	public boolean evaluar(String arg1) {
		boolean evaluando=arg1.isEmpty();
		return evaluando;
	}

}
