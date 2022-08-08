package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.model.Factura;

public interface IFacturaRepo {

	public void insertar(Factura fact);
	
	//tarea 26
	
	public List<Factura> buscarInnerJoin(BigDecimal subtotal);
	
	public List<Factura> buscarOuterJoinRight(BigDecimal subtotal);
	
	public List<Factura> buscarOuterJoinLeft(BigDecimal subtotal);
	
	
	//tarea 27
	
	public List<Factura> buscarJoinWhere(BigDecimal subtotal);
	
	public List<Factura> buscarJoinFetch(BigDecimal subtotal);
	
}
