package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.model.Hotel;

public interface IHotelRepository {

	public void insertar(Hotel hotel);
	
	//taller 30
	
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelOuterJoinRight(String tipoHabitacion);
	
	public List<Hotel> buscarHotelOuterJoinLeft(String tipoHabitacion);
	
	public List<Hotel> buscarHotelJoinWhere(String tipoHabitacion);
	
	public List<Hotel> buscarHotelJoinFetch(String tipoHabitacion);
	
	
	//sin argumentos
	public List<Hotel> buscarHotelInnerJoin();
	
	public List<Hotel> buscarHotelOuterJoinLeft();
}
