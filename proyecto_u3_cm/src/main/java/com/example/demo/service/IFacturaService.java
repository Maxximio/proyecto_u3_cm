package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.model.Factura;

public interface IFacturaService {

	public void insertarService(Factura fact);
	
	//tarea 26
	
	public List<Factura> buscarInnerJoinService(BigDecimal subtotal);
	
	public List<Factura> buscarOuterJoinRightService(BigDecimal subtotal);
	
	public List<Factura> buscarOuterJoinLeftService(BigDecimal subtotal);
	
	//tarea 27
	
	public List<Factura> buscarJoinWhereService(BigDecimal subtotal);
		
	public List<Factura> buscarJoinFetchService(BigDecimal subtotal);
	
}
