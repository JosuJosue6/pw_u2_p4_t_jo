package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CompraRepository;
import com.example.demo.repository.modelo.Compra;

@Service
public class CompraServiceImpl implements CompraService{

	@Autowired
	private CompraRepository compraRepository;
	
	@Override
	public void agregar(Compra compra) {
		// TODO Auto-generated method stub
		this.compraRepository.insertar(compra);
	}

	@Override
	public void actualizar(Compra compra) {
		// TODO Auto-generated method stub
		this.compraRepository.actualizar(compra);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.compraRepository.eliminar(id);
	}

	@Override
	public Compra buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.compraRepository.seleccionarPorId(id);
	}

	@Override
	public Compra buscarPorFecha(String fecha) {
		// TODO Auto-generated method stub
		return this.compraRepository.seleccionarPorFecha(fecha);
	}

	@Override
	public List<Compra> buscarListaPorFecha(String fecha) {
		// TODO Auto-generated method stub
		return this.compraRepository.seleccionarListaPorFecha(fecha);
	}

	@Override
	public Compra buscarPorFechaTyped(String fecha) {
		// TODO Auto-generated method stub
		return this.compraRepository.seleccionarPorFechaTyped(fecha);
	}

	@Override
	public List<Compra> buscarListaPorFechaTyped(String fecha) {
		// TODO Auto-generated method stub
		return this.compraRepository.seleccionarListaPorFechaTyped(fecha);
	}

}
