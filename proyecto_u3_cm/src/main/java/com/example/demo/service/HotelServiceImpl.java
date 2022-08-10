package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.ProyectoU3CmApplication;
import com.example.demo.repository.IHotelRepository;
import com.example.demo.repository.model.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{

	private static final Logger log =LoggerFactory.getLogger(HotelServiceImpl.class);
	
	@Autowired
	private IHotelRepository hotelRepository;
	
	@Override
	public void insertarService(Hotel hotel) {
		this.hotelRepository.insertar(hotel);
	}

	@Override
	public List<Hotel> buscarHotelInnerJoinService(String tipoHabitacion) {
		return this.hotelRepository.buscarHotelInnerJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterJoinRightService(String tipoHabitacion) {
		return this.hotelRepository.buscarHotelOuterJoinRight(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterJoinLeftService(String tipoHabitacion) {
		return this.hotelRepository.buscarHotelOuterJoinLeft(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelJoinWhereService(String tipoHabitacion) {
		return this.hotelRepository.buscarHotelJoinWhere(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelJoinFetchService(String tipoHabitacion) {
		log.info("Transaccion activa Service: "+ TransactionSynchronizationManager.isActualTransactionActive());
		return this.hotelRepository.buscarHotelJoinFetch(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelInnerJoinService() {
		return this.hotelRepository.buscarHotelInnerJoin();
	}

	@Override
	public List<Hotel> buscarHotelOuterJoinLeftService() {
		return this.hotelRepository.buscarHotelOuterJoinLeft();
	}

}
