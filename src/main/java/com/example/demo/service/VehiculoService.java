package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {

	public void agregar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public void borrar(Integer id);

	public Vehiculo buscarPorId(Integer id);
	
	public Vehiculo buscarPorMatricula(String matricula);
	
	public List<Vehiculo> buscarListaPorMatricula(String matricula);
		
	public Vehiculo buscarPorColorTyped(String color);
	
	public List<Vehiculo> buscarListaPorColorTyped(String color);
}
