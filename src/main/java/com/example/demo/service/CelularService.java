package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repository.modelo.Celular;

public interface CelularService {

	public void agregar(Celular celular);

	public void actualizar(Celular celular);

	public void borrar(Integer id);

	public Celular buscarPorId(Integer id);

	public Celular buscarCelularDinamico(BigDecimal precio, String modelo, String marca, Double peso, Double pesoMin,
			Double pesoMax);
}
