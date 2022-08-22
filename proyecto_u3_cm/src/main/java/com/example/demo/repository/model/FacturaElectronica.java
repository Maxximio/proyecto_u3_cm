package com.example.demo.repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "factura_electronica")
public class FacturaElectronica {

	@Id
	@Column(name = "fael_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "fael_id_seq")
	@SequenceGenerator(name = "fael_id_seq",sequenceName = "fael_id_seq",allocationSize = 1)
	private Integer id; 
	
	@Column(name = "fael_numero_fact")
	private String numeroFactura; 
	
	@Column(name = "fael_fecha")
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fael_monto")
	private BigDecimal monto;
	
	@Column(name = "fael_numero_deta")
	private int numeroItemDetalle;

	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public int getNumeroDetalle() {
		return numeroItemDetalle;
	}

	public void setNumeroDetalle(int numeroDetalle) {
		this.numeroItemDetalle = numeroDetalle;
	}
	
}
