package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;

@SpringBootApplication
public class PwU2P4TJoApplication implements CommandLineRunner{

	@Autowired
	private CiudadanoService ciudadanoService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(PwU2P4TJoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//agregar
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setApellido("Ocapana");
		ciudadano.setNombre("Josue");
		ciudadano.setCedula("1720525516");
		
		Ciudadano ciudadano1 = new Ciudadano();
		ciudadano1.setApellido("Borrar.");
		ciudadano1.setNombre("Borrar");
		ciudadano1.setCedula("Borrar");
		
		Empleado empleado = new Empleado();
		empleado.setCargo("Admin");
		empleado.setSueldo(new BigDecimal(1000));
		empleado.setCiudadano(ciudadano);
		
		
		Empleado empleado1 = new Empleado();
		empleado1.setCargo("RH");
		empleado1.setSueldo(new BigDecimal(500));
		empleado1.setCiudadano(ciudadano1);
		
		
		//Insertar
		this.ciudadanoService.agregar(ciudadano);
		this.ciudadanoService.agregar(ciudadano1);
		this.empleadoService.agregar(empleado);
		this.empleadoService.agregar(empleado1);
		
		//Buscar
		System.out.println("\nBuscar ANTES de la Actualizacion");
		System.out.println(this.ciudadanoService.buscarPorId(1));
		System.out.println(this.ciudadanoService.buscarPorId(2));
		System.out.println(this.empleadoService.buscarPorId(1));
		System.out.println(this.empleadoService.buscarPorId(2));
		
		
		//actualizar
		ciudadano.setNombre("Anderson Josue");
		this.ciudadanoService.actualizar(ciudadano);
		empleado.setCargo("Gerente");
		this.empleadoService.actualizar(empleado);
		
		System.out.println("\nBuscar DESPUES de la Actualizacion");
		System.out.println(this.ciudadanoService.buscarPorId(1));
		System.out.println(this.empleadoService.buscarPorId(1));

		
		//borrar
		this.ciudadanoService.borrar(ciudadano1.getId());
		
		

	}

}
