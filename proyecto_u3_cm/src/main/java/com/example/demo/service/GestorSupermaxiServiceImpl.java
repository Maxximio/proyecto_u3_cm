package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IClienteRepo;
import com.example.demo.repository.IDetalleFacturaRepo;
import com.example.demo.repository.IFacturaElectronicaRepo;
import com.example.demo.repository.IProductoRepo;
import com.example.demo.repository.model.Cliente;
import com.example.demo.repository.model.DetalleFactura;
import com.example.demo.repository.model.Factura;
import com.example.demo.repository.model.FacturaElectronica;
import com.example.demo.repository.model.Producto;

@Service
public class GestorSupermaxiServiceImpl implements IGestorSupermaxiService{

	private static final Logger log =LoggerFactory.getLogger(GestorSupermaxiServiceImpl.class);
	
	@Autowired
	private IFacturaElectronicaRepo facturaElectronicaRepo;
	
	@Autowired
	private IClienteRepo clienteRepo;
	
	@Autowired
	private IProductoRepo productoRepo;
	
	@Autowired
	private IDetalleFacturaRepo detalleFacturaRepo;
	
	public void crearFacturaYDetalles(String cedula,String numeroFactura,List<String> listaCodBarras) {
		Cliente clie=this.clienteRepo.buscarCedula(cedula);
		
		Factura fac=new Factura();
		fac.setCliente(clie);
		fac.setNumero(numeroFactura);
		fac.setFecha(LocalDateTime.now());
		
//		for (String prod : listaCodBarras) {
//			Producto pro=this.productoRepo.buscar(0);
//			
//			suma.add(prod.);
//			log.info("Los Productos ingresados han sido----" + prod);
//		}
		
	}
	
	public void actualizarStock(int idProducto,int cantidad) {
		Producto producto=null;
		
		//verificamos si existe
		if(idProducto!=0) {
			producto=this.productoRepo.buscar(idProducto);
			log.info("Error"+" se returna");
			throw new RuntimeException();
		}
		producto=this.productoRepo.buscar(idProducto);
		producto.setStock(cantidad);
		
		this.productoRepo.actualizar(producto);
	}
	
	public void insertarFacturaElectronicaSRI(String numFactura,int idDetalle) {
		
		FacturaElectronica facturaEle=new FacturaElectronica();
		DetalleFactura detalle=this.detalleFacturaRepo.buscar(idDetalle);
		
		facturaEle.setFechaCreacion(LocalDateTime.now());
		facturaEle.setMonto(facturaEle.getMonto());
		facturaEle.setNumeroDetalle(detalle.getCantidad());
		facturaEle.setNumeroFactura(numFactura);
		
		this.facturaElectronicaRepo.insertar(facturaEle);
	}
}
