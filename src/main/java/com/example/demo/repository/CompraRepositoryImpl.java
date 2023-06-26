package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Cliente;
import com.example.demo.repository.modelo.Compra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CompraRepositoryImpl implements CompraRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Compra compra) {
		// TODO Auto-generated method stub
		this.entityManager.persist(compra);
	}

	@Override
	public void actualizar(Compra compra) {
		// TODO Auto-generated method stub
		this.entityManager.merge(compra);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Compra compraEncontrada = this.seleccionarPorId(id);
		this.entityManager.remove(compraEncontrada);
	}

	@Override
	public Compra seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Compra.class, id);
	}

	@Override
	public Compra seleccionarPorFecha(String fecha) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT c FROM Compra c WHERE c.fecha = :datoFecha");
		myQuery.setParameter("datoFecha", fecha);
		return (Compra)myQuery.getSingleResult();
	}

	@Override
	public List<Compra> seleccionarListaPorFecha(String fecha) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT c FROM Compra c WHERE c.fecha = :datoFecha");
		myQuery.setParameter("datoFecha", fecha);
		return myQuery.getResultList();
	}

	@Override
	public Compra seleccionarPorFechaTyped(String fecha) {
		// TODO Auto-generated method stub
		TypedQuery<Compra> myQuery = this.entityManager.createQuery("SELECT c FROM Compra c WHERE c.fecha = :datoFecha", Compra.class);
		myQuery.setParameter("datoFecha", fecha);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Compra> seleccionarListaPorFechaTyped(String fecha) {
		// TODO Auto-generated method stub
		TypedQuery<Compra> myQuery = this.entityManager.createQuery("SELECT c FROM Compra c WHERE c.fecha = :datoFecha", Compra.class);
		myQuery.setParameter("datoFecha", fecha);
		return myQuery.getResultList();
	}

}
