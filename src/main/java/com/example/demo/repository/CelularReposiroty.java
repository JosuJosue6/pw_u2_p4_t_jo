package com.example.demo.repository;

import java.math.BigDecimal;

import com.example.demo.repository.modelo.Celular;

public interface CelularReposiroty {

	public void insertar(Celular celular);

	public void actualizar(Celular celular);

	public void eliminar(Integer id);

	public Celular seleccionarPorId(Integer id);

	public Celular seleccionarCelularDinamico(BigDecimal precio, String modelo, String marca, Double peso,
			Double pesoMin, Double pesoMax);
	
	public int actualizarPorModelo(String modelo, String marca);
	
	public int eliminarPorPrecio(Double precio);
	

}
