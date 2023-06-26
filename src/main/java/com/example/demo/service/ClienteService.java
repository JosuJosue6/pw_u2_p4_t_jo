package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Cliente;

public interface ClienteService {

	public void agregar(Cliente cliente);

	public void actualizar(Cliente cliente);

	public void borrar(Integer id);

	public Cliente buscarPorId(Integer id);
	
	public Cliente buscarPorApellido(String apellido);
	
	public List<Cliente> buscarListaPorApellido(String apellido);
		
	public Cliente buscarPorApellidoTyped(String apellido);
	
	public List<Cliente> buscarListaPorApellidoTyped(String apellido);
}
