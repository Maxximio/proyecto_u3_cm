package com.example.demo.repository;

import com.example.demo.repository.model.Cliente;

public interface IClienteRepo {

	public void insertar(Cliente cliente);
	
	public Cliente buscarCedula(String cedula);
	
}
