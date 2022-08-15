package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.model.CuentaBancaria;
import com.example.demo.repository.model.Habitacion;
import com.example.demo.repository.model.Hotel;
import com.example.demo.service.IHotelService;
import com.example.demo.service.ITransferenciaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class ProyectoU3CmApplication implements CommandLineRunner{
	
	private static final Logger log =LoggerFactory.getLogger(ProyectoU3CmApplication.class);
	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private ITransferenciaService transferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU3CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/////////////////taller 31
		
		//cuentas creadas: cu1->300 "123"
		//cu2->100 "321"
		
		//this.transferenciaService.realizarTransferenciaFachada("123", "321", new BigDecimal(5.25));
		
//		log.info("------fetch----");
//		List<Hotel> lista3=this.hotelService.buscarHotelJoinFetchService("Familiar");
//		for(Hotel h: lista3) {
//			log.info("hotel---- "+h.getNombre()+" "+h.getDireccion());
//			for(Habitacion ha:h.getHabitaciones()) {
//				log.info("habitacion---- "+ha);
//			}
//		}
		
		
		/////////////////tarea 27
		
//		log.info("------where----");
//		List<Factura> lista=this.facturaService.buscarJoinWhereService(new BigDecimal(150));
//		for(Factura fact: lista) {
//			log.info("imprimiendo where----"+fact);
//		}
//		
//		log.info("------fetch----");
//		List<Factura> lista2=this.facturaService.buscarJoinFetchService(new BigDecimal(150));
//		for(Factura fact: lista2) {
//			log.info("imprimiendo fetch----"+fact);
//		}
		
		/////////////////tarea 26
		
//		log.info("------inner----");
//		List<Factura> lista=this.facturaService.buscarInnerJoinService(new BigDecimal(150));
//		for(Factura fact: lista) {
//			log.info("imprimiendo----"+fact);
//		}
//		
//		log.info("------right----");
//		List<Factura> lista2=this.facturaService.buscarOuterJoinRightService(new BigDecimal(150));
//		for(Factura fact: lista2) {
//			log.info("imprimiendo----"+fact);
//		}
//		
//		log.info("------left----");
//		List<Factura> lista3=this.facturaService.buscarOuterJoinLeftService(new BigDecimal(150));
//		for(Factura fact: lista3) {
//			log.info("imprimiendo----"+fact);
//		}
		
		/////////////////taller 30
		
//		log.info("------Where----");
//		List<Hotel> lista=this.hotelService.buscarHotelJoinWhereService("Familiar");
//		for(Hotel h: lista) {
//			log.info("imprimiendo---- "+h.getNombre()+" "+h.getDireccion());
//		}
//		
//		log.info("------inner eager/lazy----");
//		List<Hotel> lista2=this.hotelService.buscarHotelInnerJoinService("Familiar");
//		for(Hotel h: lista2) {
//			log.info("hotel---- "+h.getNombre()+" "+h.getDireccion());
//			//log.info("habitaciones----"+h.getHabitaciones());
//			for(Habitacion ha:h.getHabitaciones()) {
//				log.info("habitacion---- "+ha);
//			}
//		}
//		
//		log.info("------fetch----");
//		List<Hotel> lista3=this.hotelService.buscarHotelJoinFetchService("Familiar");
//		for(Hotel h: lista3) {
//			log.info("hotel---- "+h.getNombre()+" "+h.getDireccion());
//			for(Habitacion ha:h.getHabitaciones()) {
//				log.info("habitacion---- "+ha);
//			}
//		}
		
		/////////////////taller 29
		//inner
//		log.info("------inner----");
//		List<Hotel> lista=this.hotelService.buscarHotelInnerJoinService("Familiar");
//		for(Hotel h: lista) {
//			log.info("imprimiendo----"+h);
//		}
//		
//		//left
//		log.info("------left----");
//		List<Hotel> lista2=this.hotelService.buscarHotelOuterJoinLeftService("Familiar");
//		for(Hotel h: lista2) {
//			log.info("imprimiendo----"+h);
//		}
//		
//		
//		//right
//		log.info("------right----");
//		List<Hotel> lista3=this.hotelService.buscarHotelOuterJoinRightService("Familiar");
//		for(Hotel h: lista3) {
//			log.info("imprimiendo----"+h);
//		}
//		
//		//inner sin argumentos
//		log.info("------inner----");
//		List<Hotel> lista4=this.hotelService.buscarHotelInnerJoinService();
//		for(Hotel h: lista4) {
//			log.info("imprimiendo----"+h);
//		}
//		
//		//left sin argumentos
//		log.info("------left----");
//		List<Hotel> lista5=this.hotelService.buscarHotelOuterJoinLeftService();
//		for(Hotel h: lista5) {
//			log.info("imprimiendo----"+h);
//		}
		
		
	}

}
