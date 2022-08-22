package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.FacturaElectronica;

@Transactional
@Repository
public class FacturaElectronicaRepoImpl implements IFacturaElectronicaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(FacturaElectronica facturaElectronica) {
		this.entityManager.persist(facturaElectronica);
	}

}
