package com.example.demo.service.funcional;

public class PersonaFuntionImpl implements IPersonaFunction<String, Integer>{

	@Override
	public String aplicar(Integer arg1) {
		
		String numero=arg1.toString();
		
		return numero;
	}

	

}
