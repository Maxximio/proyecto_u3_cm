package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Cliente;

@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cliente cliente) {
		this.entityManager.persist(cliente);
	}

	@Override
	public Cliente buscarCedula(String cedula) {
		Query jpqlQuery=this.entityManager
				.createQuery("select c from Cliente c Where c.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		
		return (Cliente) jpqlQuery.getSingleResult();
	}
	
}
