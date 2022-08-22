package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.DetalleFactura;

@Transactional
@Repository
public class DetalleFacturaRepoImpl implements IDetalleFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(DetalleFactura detalleFactura) {
		this.entityManager.persist(detalleFactura);
	}

	@Override
	public DetalleFactura buscar(int id) {
		return this.entityManager.find(DetalleFactura.class, id);
	}

}
