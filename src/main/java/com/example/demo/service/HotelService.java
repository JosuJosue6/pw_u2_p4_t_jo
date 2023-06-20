package com.example.demo.service;

import com.example.demo.repository.modelo.Hotel;

public interface HotelService {
	
	public void agregar(Hotel hotel);
	
	public void actualizar(Hotel hotel);
	
	public void borrarHotel(Integer id);
	
	public Hotel buscarPorID(Integer idHotel);
	
}
