package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.modelo.Compra;



public interface CompraRepository {
	
	public void insertar(Compra compra);

	public void actualizar(Compra compra);

	public void eliminar(Integer id);

	public Compra seleccionarPorId(Integer id);
	
	public Compra seleccionarPorFecha(String fecha);
	
	public List<Compra> seleccionarListaPorFecha(String fecha);
		
	public Compra seleccionarPorFechaTyped(String fecha);
	
	public List<Compra> seleccionarListaPorFechaTyped(String fecha);
}
