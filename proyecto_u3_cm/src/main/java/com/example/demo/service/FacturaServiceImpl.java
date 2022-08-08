package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IFacturaRepo;
import com.example.demo.repository.model.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo facturaRepo;
	
	@Override
	public void insertarService(Factura fact) {
		this.facturaRepo.insertar(fact);
	}

	@Override
	public List<Factura> buscarInnerJoinService(BigDecimal subtotal) {
		return this.facturaRepo.buscarInnerJoin(subtotal);
	}

	@Override
	public List<Factura> buscarOuterJoinRightService(BigDecimal subtotal) {
		return this.facturaRepo.buscarOuterJoinRight(subtotal);
	}

	@Override
	public List<Factura> buscarOuterJoinLeftService(BigDecimal subtotal) {
		// TODO Auto-generated method stub
		return this.facturaRepo.buscarOuterJoinLeft(subtotal);
	}

}
