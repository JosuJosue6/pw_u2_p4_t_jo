package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CelularReposiroty;
import com.example.demo.repository.modelo.Celular;

@Service
public class CelularServiceImpl implements CelularService {

	@Autowired
	private CelularReposiroty celularReposiroty;

	@Override
	public void agregar(Celular celular) {
		// TODO Auto-generated method stub
		this.celularReposiroty.insertar(celular);
	}

	@Override
	public void actualizar(Celular celular) {
		// TODO Auto-generated method stub
		this.celularReposiroty.actualizar(celular);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.celularReposiroty.eliminar(id);
	}

	@Override
	public Celular buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.celularReposiroty.seleccionarPorId(id);
	}

	@Override
	public Celular buscarCelularDinamico(BigDecimal precio, String modelo, String marca, Double peso, Double pesoMin, Double pesoMax) {
		// TODO Auto-generated method stub
		return this.celularReposiroty.seleccionarCelularDinamico(precio, modelo, marca, peso, pesoMin, pesoMax);
	}

	@Override
	public int actualizarPorModelo(String modelo, String marca) {
		// TODO Auto-generated method stub
		return this.celularReposiroty.actualizarPorModelo(modelo, marca);
	}

	@Override
	public int borrarPorPrecio(Double precio) {
		// TODO Auto-generated method stub
		return this.celularReposiroty.eliminarPorPrecio(precio);
	}

}
