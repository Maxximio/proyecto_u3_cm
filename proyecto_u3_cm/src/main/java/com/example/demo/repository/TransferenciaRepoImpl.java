package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Transferencia;

@Repository
@Transactional
public class TransferenciaRepoImpl implements ITransferenciaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Transferencia transferencia) {
		this.entityManager.persist(transferencia);
	}

	
	
}
