package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.example.demo.repository.HotelRepositoryImpl;
import com.example.demo.repository.model.Hotel;

@SpringBootTest
@Rollback(true)
@Transactional
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class Ejemplo4 {

	@Autowired
	private HotelRepositoryImpl hotelRepositoryImpl;

	@Test
	public void testActualizarHotel() {

		Hotel hotel = new Hotel();

		hotel.setNombre("Tambo Real");
		hotel.setDireccion("Av. Patria");

		this.hotelRepositoryImpl.insertar(hotel);

		Hotel hotelActualizado = new Hotel();
		hotelActualizado.setNombre("Tambo Real 2");
		hotelActualizado.setDireccion("Av. Patria");
		hotelActualizado.setId(33);
		this.hotelRepositoryImpl.actualizar(hotelActualizado);

		Hotel hotel1 = this.hotelRepositoryImpl.buscarPorNombre("Tambo Real 2");

		assertThat(hotel1.getNombre()).isEqualTo(hotelActualizado.getNombre());

	}
}
