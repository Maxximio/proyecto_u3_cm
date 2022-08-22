package com.example.demo.repository;

import com.example.demo.repository.model.Producto;

public interface IProductoRepo {

	public void insertar(Producto producto);
	
	public Producto buscar(int id);
	
	public void actualizar(Producto producto);
	
}
