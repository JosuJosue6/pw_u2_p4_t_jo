package com.example.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Celular;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CelularReposirotyImpl implements CelularReposiroty{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Celular celular) {
		// TODO Auto-generated method stub
		this.entityManager.persist(celular);
	}

	@Override
	public void actualizar(Celular celular) {
		// TODO Auto-generated method stub
		this.entityManager.merge(celular);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Celular celular = this.seleccionarPorId(id);
		this.entityManager.remove(celular);
	}
	
	@Override
	public Celular seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Celular.class, id);
	}

	@Override
	public Celular seleccionarCelularDinamico(BigDecimal precio, String modelo, String marca, Double peso,
			Double pesoMin, Double pesoMax) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Celular> myCriteriaQuery = myBuilder.createQuery(Celular.class);
		Root<Celular> miTablaFrom = myCriteriaQuery.from(Celular.class);
		Predicate pModelo = myBuilder.equal(miTablaFrom.get("modelo"), modelo);
		Predicate pMarca = myBuilder.equal(miTablaFrom.get("marca"), marca);
		Predicate pPeso = myBuilder.equal(miTablaFrom.get("peso"), peso);//
		Predicate pPesoMin = myBuilder.equal(miTablaFrom.get("peso"), pesoMin);
		Predicate pPesoMax = myBuilder.equal(miTablaFrom.get("peso"), pesoMax);
		Predicate predicadoFinal = null;
		if(precio.compareTo(new BigDecimal(150))<=0) {
			//predicadoFinal = myBuilder.between(pPeso,pPesoMin,pPesoMax);
			predicadoFinal = myBuilder.or(pMarca, pModelo);
		}else {
			predicadoFinal = myBuilder.and(pMarca, pModelo);
		}
		myCriteriaQuery.select(miTablaFrom).where(predicadoFinal);
		TypedQuery<Celular> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery); 
		return myQueryFinal.getSingleResult();
	}

	@Override
	public int actualizarPorModelo(String modelo, String marca) {
		// TODO Auto-generated method stub
		Query myQuery =this.entityManager.createQuery("UPDATE Celular e SET e.marca =:datoMarca WHERE e.modelo = :datoModelo");
		myQuery.setParameter("datoModelo", modelo);
		myQuery.setParameter("datoMarca", marca);
		
		return myQuery.executeUpdate();
	}

	@Override
	public int eliminarPorPrecio(Double precio) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("DELETE from Celular e WHERE e.precio = :datoPrecio");
		myQuery.setParameter("datoPrecio", precio);
		return myQuery.executeUpdate();
	}



}
