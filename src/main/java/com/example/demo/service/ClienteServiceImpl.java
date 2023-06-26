package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.modelo.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepository.insertar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepository.actualizar(cliente);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepository.eliminar(id);
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepository.seleccionar(id);
	}

	@Override
	public Cliente buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.clienteRepository.seleccionarPorApellido(apellido);
	}

	@Override
	public List<Cliente> buscarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.clienteRepository.seleccionarListaPorApellido(apellido);
	}

	@Override
	public Cliente buscarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.clienteRepository.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public List<Cliente> buscarListaPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.clienteRepository.seleccionarListaPorApellidoTyped(apellido);
	}

}
