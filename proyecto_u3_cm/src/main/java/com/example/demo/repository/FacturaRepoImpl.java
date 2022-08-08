package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Factura;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Factura fact) {
		this.entityManager.persist(fact);
	}

	@Override
	public List<Factura> buscarInnerJoin(BigDecimal subtotal) {
		TypedQuery<Factura> myQuery=this.entityManager.createQuery(""
				+ "select f from Factura f inner join f.detalles d "
				+ "where d.subtotal >=: tipoSubtotal", Factura.class);
		myQuery.setParameter("tipoSubtotal", subtotal);

		List<Factura> hoteles=myQuery.getResultList();
		for(Factura h:hoteles) {
			h.getDetalles().size();
		}
		
		return myQuery.getResultList();
	}

	@Override
	public List<Factura> buscarOuterJoinRight(BigDecimal subtotal) {
		TypedQuery<Factura> myQuery=this.entityManager.createQuery(""
				+ "select f from Factura f right join f.detalles d "
				+ "where d.subtotal >=: tipoSubtotal", Factura.class);
		myQuery.setParameter("tipoSubtotal", subtotal);
		
		List<Factura> hoteles=myQuery.getResultList();
		for(Factura h:hoteles) {
			h.getDetalles().size();
		}
		
		return myQuery.getResultList();
	}

	@Override
	public List<Factura> buscarOuterJoinLeft(BigDecimal subtotal) {
		TypedQuery<Factura> myQuery=this.entityManager.createQuery(""
				+ "select f from Factura f left join f.detalles d "
				+ "where d.subtotal >=: tipoSubtotal", Factura.class);
		myQuery.setParameter("tipoSubtotal", subtotal);
		
		List<Factura> hoteles=myQuery.getResultList();
		for(Factura h:hoteles) {
			h.getDetalles().size();
		}
		
		return myQuery.getResultList();
	}
	
	
}
