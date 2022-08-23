package com.example.demo.service.funcional;

public class PersonaConsumerImpl implements IPersonaConsummer<String>{

	@Override
	public void accept(String arg1) {
		
		System.out.print(arg1);
	}

}
