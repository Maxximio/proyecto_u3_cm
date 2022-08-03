package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Habitacion;

@Repository
@Transactional
public class HabitacionRepositoryImpl implements IHabitacionRepository{

	@Autowired
	private EntityManager entityManager; 
	
	
	@Override
	public void insertar(Habitacion habitacion) {
		this.entityManager.persist(habitacion);
	}

}
