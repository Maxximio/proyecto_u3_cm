package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.model.Hotel;
import com.example.demo.service.IHotelService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class ProyectoU3CmApplication implements CommandLineRunner{
	
	private static final Logger log =LoggerFactory.getLogger(ProyectoU3CmApplication.class);
	
	@Autowired
	private IHotelService hotelService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU3CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//inner
		log.info("------inner----");
		List<Hotel> lista=this.hotelService.buscarHotelInnerJoinService("Familiar");
		for(Hotel h: lista) {
			log.info("imprimiendo----"+h);
		}
		
		//left
		log.info("------left----");
		List<Hotel> lista2=this.hotelService.buscarHotelOuterJoinLeftService("Familiar");
		for(Hotel h: lista2) {
			log.info("imprimiendo----"+h);
		}
		
		
		//right
		log.info("------right----");
		List<Hotel> lista3=this.hotelService.buscarHotelOuterJoinRightService("Familiar");
		for(Hotel h: lista3) {
			log.info("imprimiendo----"+h);
		}
		
		//inner sin argumentos
		log.info("------inner----");
		List<Hotel> lista4=this.hotelService.buscarHotelInnerJoinService();
		for(Hotel h: lista4) {
			log.info("imprimiendo----"+h);
		}
		
		//left sin argumentos
		log.info("------left----");
		List<Hotel> lista5=this.hotelService.buscarHotelOuterJoinLeftService();
		for(Hotel h: lista5) {
			log.info("imprimiendo----"+h);
		}
		
		
	}

}
