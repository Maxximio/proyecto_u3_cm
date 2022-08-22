package com.example.demo.repository;

import com.example.demo.repository.model.DetalleFactura;

public interface IDetalleFacturaRepo {

	public void insertar(DetalleFactura detalleFactura);
	
	public DetalleFactura buscar(int id);
}
