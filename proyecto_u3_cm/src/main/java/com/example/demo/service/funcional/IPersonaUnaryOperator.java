package com.example.demo.service.funcional;

@FunctionalInterface
public interface IPersonaUnaryOperator<T> {

	T apply(T arg1);
	
}
