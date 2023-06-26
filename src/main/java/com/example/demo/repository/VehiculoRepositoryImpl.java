package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub

		this.entityManager.merge(vehiculo);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.seleccionar(id);
		this.entityManager.remove(vehiculo);
	}

	@Override
	public Vehiculo seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vehiculo.class, id);
	}

	@Override
	public Vehiculo seleccionarPorMatricula(String matricula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v WHERE v.matricula = :datoMatricula");
		myQuery.setParameter("datoMatricula", matricula);
		return (Vehiculo)myQuery.getSingleResult();
	}

	@Override
	public List<Vehiculo> seleccionarListaPorMatricula(String matricula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v WHERE v.matricula = :datoMatricula");
		myQuery.setParameter("datoMatricula", matricula);
		return myQuery.getResultList();
	}

	@Override
	public Vehiculo seleccionarPorColorTyped(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Vehiculo> myQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v WHERE v.color = :datoColor",Vehiculo.class);
		myQuery.setParameter("datoColor", color);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Vehiculo> seleccionarListaPorColorTyped(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Vehiculo> myQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v WHERE v.color = :datoColor", Vehiculo.class);
		myQuery.setParameter("datoColor", color);
		return myQuery.getResultList();
	}
	
	
}
