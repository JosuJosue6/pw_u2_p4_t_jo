package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRepositoryImpl implements ClienteRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Cliente cliente= this.seleccionar(id);
		this.entityManager.remove(cliente);
	}

	@Override
	public Cliente seleccionar(Integer id) {
		// TODO Auto-generated method stub
		
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public Cliente seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Cliente)myQuery.getSingleResult();
	}

	@Override
	public List<Cliente> seleccionarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public Cliente seleccionarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> myQuery = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.apellido = :datoApellido",Cliente.class);
		myQuery.setParameter("datoColor", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Cliente> seleccionarListaPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> myQuery = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.apellido = :datoApellido",Cliente.class);
		myQuery.setParameter("datoColor", apellido);
		return myQuery.getResultList();
	}

}
