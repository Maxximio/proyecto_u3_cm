package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.model.Hotel;
import com.example.demo.service.IHotelService;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@TestMethodOrder(OrderAnnotation.class)
public class Ejemplo2 {

	private static final Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	private IHotelService hotelService;

	@Test
	@Order(1)
	public void testBuscarHotelInnerJoin() {

		String tipo = "Familiar";
		List<Hotel> Hoteles = this.hotelService.buscarHotelInnerJoinService(tipo);

		for (Hotel h : Hoteles) {
			LOG.info(Hoteles);
		}

		assertEquals(1, Hoteles.size());
		// assertThat(Hoteles).size().isGreaterThan(0);
	}

}
