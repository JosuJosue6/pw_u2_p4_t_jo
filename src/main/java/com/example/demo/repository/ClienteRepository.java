package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Cliente;


public interface ClienteRepository {
	
	public void insertar(Cliente cliente);

	public void actualizar(Cliente cliente);

	public void eliminar(Integer id);

	public Cliente seleccionar(Integer id);
	
	public Cliente seleccionarPorApellido(String apellido);
	
	public List<Cliente> seleccionarListaPorApellido(String apellido);
		
	public Cliente seleccionarPorApellidoTyped(String apellido);
	
	public List<Cliente> seleccionarListaPorApellidoTyped(String apellido);

}
