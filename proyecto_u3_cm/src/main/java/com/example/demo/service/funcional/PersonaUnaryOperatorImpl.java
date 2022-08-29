package com.example.demo.service.funcional;

public class PersonaUnaryOperatorImpl implements IPersonaFunctionUnaryOperator<String>{

	@Override
	public String aplicar(String arg1) {
		arg1=arg1+" se repite "+arg1;
		return arg1;
	}

}
