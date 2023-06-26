package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements VehiculoService{

	@Autowired
	private VehiculoRepository repository;
	
	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.repository.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.repository.actualizar(vehiculo);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.repository.eliminar(id);
	}

	@Override
	public Vehiculo buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.repository.seleccionar(id);
	}

	@Override
	public Vehiculo buscarPorMatricula(String matricula) {
		// TODO Auto-generated method stub
		return this.repository.seleccionarPorMatricula(matricula);
	}

	@Override
	public List<Vehiculo> buscarListaPorMatricula(String matricula) {
		// TODO Auto-generated method stub
		return this.repository.seleccionarListaPorMatricula(matricula);
	}

	@Override
	public Vehiculo buscarPorColorTyped(String color) {
		// TODO Auto-generated method stub
		return this.repository.seleccionarPorColorTyped(color);
	}

	@Override
	public List<Vehiculo> buscarListaPorColorTyped(String color) {
		// TODO Auto-generated method stub
		return this.repository.seleccionarListaPorColorTyped(color);
	}

}
