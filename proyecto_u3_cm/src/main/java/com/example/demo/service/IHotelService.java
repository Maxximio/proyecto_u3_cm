package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.model.Hotel;

public interface IHotelService {

	public void insertarService(Hotel hotel);
	
	//taller 30
	
	public List<Hotel> buscarHotelInnerJoinService(String tipoHabitacion);
	
	public List<Hotel> buscarHotelOuterJoinRightService(String tipoHabitacion);
	
	public List<Hotel> buscarHotelOuterJoinLeftService(String tipoHabitacion);
	
	public List<Hotel> buscarHotelJoinWhereService(String tipoHabitacion);
	
	public List<Hotel> buscarHotelJoinFetchService(String tipoHabitacion);
	
	
	//sin argumentos
	public List<Hotel> buscarHotelInnerJoinService();
	
	public List<Hotel> buscarHotelOuterJoinLeftService();
}
