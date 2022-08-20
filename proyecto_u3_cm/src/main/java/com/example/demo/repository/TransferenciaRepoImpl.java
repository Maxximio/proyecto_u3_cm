package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Transferencia;

@Repository
@Transactional
public class TransferenciaRepoImpl implements ITransferenciaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void insertar(Transferencia transferencia) {
		this.entityManager.persist(transferencia);
		throw new RuntimeException();
	}

	
	
}
