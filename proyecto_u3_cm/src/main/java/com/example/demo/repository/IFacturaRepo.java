package com.example.demo.repository;

import com.example.demo.repository.model.Factura;

public interface IFacturaRepo {

	public void insertar (Factura factura);
	
	public Factura buscar(int id);
	
}
