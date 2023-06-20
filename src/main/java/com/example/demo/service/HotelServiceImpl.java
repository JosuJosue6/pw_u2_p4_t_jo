package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HotelRepository;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public void agregar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.insertar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(hotel);
	}

	@Override
	public void borrarHotel(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepository.eliminarPorNombre(id);
	}

	@Override
	public Hotel buscarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarPorID(id);
	}
	
	

}
