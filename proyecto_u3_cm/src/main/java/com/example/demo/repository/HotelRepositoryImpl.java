package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Hotel;


@Transactional
@Repository
public class HotelRepositoryImpl implements IHotelRepository{

	@Autowired
	private EntityManager entityManager; 
	
	@Override
	public void insertar(Hotel hotel) {
		this.entityManager.persist(hotel);
	}
	
	
	/////////taller 30

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery(""
				+ "select h from Hotel h inner join h.habitacion ha "
				+ "where ha.tipo =: tipoDato", Hotel.class);
		//se puede poner inner join o solo join
		myQuery.setParameter("tipoDato", tipoHabitacion);
		
		///taller 30
		List<Hotel> hoteles=myQuery.getResultList();//solo hacemos esto para traer habitaciones
		for(Hotel h:hoteles) {//0bajo demanda
			h.getHabitaciones().size();
		}
		
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOuterJoinRight(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery(""
				+ "select h from Hotel h right join h.habitacion ha "
				+ "where ha.tipo =: tipoDato", Hotel.class);
		//se puede poner inner join o solo join
		myQuery.setParameter("tipoDato", tipoHabitacion);
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOuterJoinLeft(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery(""
				+ "select h from Hotel h left join h.habitacion ha "
				+ "where ha.tipo =: tipoDato", Hotel.class);
		//se puede poner inner join o solo join
		myQuery.setParameter("tipoDato", tipoHabitacion);
		return myQuery.getResultList();
	}


	@Override
	public List<Hotel> buscarHotelJoinWhere(String tipoHabitacion) {
		TypedQuery< Hotel> myQuery=this.entityManager.createQuery("select h from Hotel h, Habitacion ha where h =ha.hotel and ha.tipo=:tipoDato",Hotel.class);
		myQuery.setParameter("tipoDato", tipoHabitacion);
		return myQuery.getResultList();
	}


	@Override
	public List<Hotel> buscarHotelJoinFetch(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery(""
				+ "select h from Hotel h join fetch h.habitacion ha "
				+ "where ha.tipo =: tipoDato", Hotel.class);
		
		myQuery.setParameter("tipoDato", tipoHabitacion);
		
		
		return myQuery.getResultList();
	}


	@Override
	public List<Hotel> buscarHotelInnerJoin() {
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery(""
				+ "select h from Hotel h inner join h.habitacion ha", Hotel.class);
		return myQuery.getResultList();
	}


	@Override
	public List<Hotel> buscarHotelOuterJoinLeft() {
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery(""
				+ "select h from Hotel h left join h.habitacion ha", Hotel.class);
		return myQuery.getResultList();
	}

	

}
