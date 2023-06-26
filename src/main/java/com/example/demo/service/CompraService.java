package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.modelo.Compra;


public interface CompraService {
	
	public void agregar(Compra compra);

	public void actualizar(Compra compra);

	public void borrarPorId(Integer id);

	public Compra buscarPorId(Integer id);
	
	public Compra buscarPorFecha(String fecha);
	
	public List<Compra> buscarListaPorFecha(String fecha);
		
	public Compra buscarPorFechaTyped(String fecha);
	
	public List<Compra> buscarListaPorFechaTyped(String fecha);
}
