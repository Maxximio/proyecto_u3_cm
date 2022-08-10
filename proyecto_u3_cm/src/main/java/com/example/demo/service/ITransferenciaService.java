package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repository.model.CuentaBancaria;

public interface ITransferenciaService {

	public void insertarCuenta(CuentaBancaria bancaria); 
	
	public void realizarTransferencia(String CtaOrigen,String CtaDestino,BigDecimal monto);

	public void realizarTransferenciaFachada(String CtaOrigen, String CtaDestino, BigDecimal monto);
}
