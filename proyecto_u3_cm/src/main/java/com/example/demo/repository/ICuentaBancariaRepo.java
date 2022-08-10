package com.example.demo.repository;

import com.example.demo.repository.model.CuentaBancaria;

public interface ICuentaBancariaRepo {

	public void insertar(CuentaBancaria cuentaBancaria);
	
	public void actualizar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscarPorNumero(String numeroCuenta);
	
}
