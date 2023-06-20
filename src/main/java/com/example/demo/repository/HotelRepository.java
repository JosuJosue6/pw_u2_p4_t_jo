package com.example.demo.repository;

import com.example.demo.repository.modelo.Hotel;

public interface HotelRepository {

	public void insertar(Hotel hotel);
	
	public void eliminarPorNombre(Integer id);
	
	public void actualizar(Hotel hotel);
	
	public Hotel buscarPorID(Integer id);
}
