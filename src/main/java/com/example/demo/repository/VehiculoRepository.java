package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoRepository {
	
	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(Integer id);

	public Vehiculo seleccionar(Integer id);
	
	public Vehiculo seleccionarPorMatricula(String matricula);
	
	public List<Vehiculo> seleccionarListaPorMatricula(String matricula);
	
	public Vehiculo seleccionarPorColorTyped(String color);
	
	public List<Vehiculo> seleccionarListaPorColorTyped(String color);
}
