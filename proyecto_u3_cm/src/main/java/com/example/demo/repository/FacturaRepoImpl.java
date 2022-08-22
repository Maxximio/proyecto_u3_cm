package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Factura;

@Transactional
@Repository
public class FacturaRepoImpl implements IFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Factura buscar(int id) {
		return this.entityManager.find(Factura.class, id);
	}

	@Override
	public void insertar(Factura factura) {
		this.entityManager.persist(factura);
	}
	
	

}
