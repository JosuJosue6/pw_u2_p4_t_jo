package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Celular;
import com.example.demo.service.CelularService;

@SpringBootApplication
public class PwU2P4TJoApplication implements CommandLineRunner {

	/*
	 * @Autowired private VehiculoService vehiculoService;
	 * 
	 * @Autowired private ClienteService clienteService;
	 * 
	 * @Autowired private CompraService compraService;
	 */
	@Autowired
	private CelularService celularService;

	public static void main(String[] args) {
		SpringApplication.run(PwU2P4TJoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Insertar clientes y vehiculos a la DB
		/*
		 * Cliente cliente1 = new Cliente(); cliente1.setApellido("Ocapana");
		 * cliente1.setNombre("Josue");
		 * 
		 * Cliente cliente2 = new Cliente(); cliente2.setApellido("Ocapana");
		 * cliente2.setNombre("Anderson");
		 * 
		 * Cliente cliente3 = new Cliente(); cliente3.setApellido("Busca");
		 * cliente3.setNombre("Busca");
		 * 
		 * this.clienteService.agregar(cliente1); this.clienteService.agregar(cliente2);
		 * this.clienteService.agregar(cliente3);
		 * 
		 * Vehiculo vehiculo = new Vehiculo(); vehiculo.setColor("negro");
		 * vehiculo.setMatricula("AAA"); vehiculo.setModelo("2023");
		 * 
		 * this.vehiculoService.agregar(vehiculo);
		 * 
		 * Vehiculo vehiculo1 = new Vehiculo(); vehiculo1.setColor("rojo");
		 * vehiculo1.setMatricula("12345AAA"); vehiculo1.setModelo("2020");
		 * 
		 * Vehiculo vehiculo2 = new Vehiculo(); vehiculo2.setColor("azul");
		 * vehiculo2.setMatricula("12345BBB"); vehiculo2.setModelo("2020");
		 * 
		 * Vehiculo vehiculo3 = new Vehiculo(); vehiculo3.setColor("rojo");
		 * vehiculo3.setMatricula("12345BBB"); vehiculo3.setModelo("2023");
		 * 
		 * this.vehiculoService.agregar(vehiculo1);
		 * this.vehiculoService.agregar(vehiculo2);
		 * this.vehiculoService.agregar(vehiculo3);
		 * 
		 * //insertar compras
		 * 
		 * Compra compra1 = new Compra(); //compra1.setCliente(cliente3);
		 * compra1.setCosto(new BigDecimal(10000));
		 * compra1.setFecha(LocalDateTime.now()); //compra1.setVehiculo(vehiculo1);
		 * 
		 * Compra compra2 = new Compra(); //compra2.setCliente(cliente1);
		 * compra2.setCosto(new BigDecimal(2000));
		 * compra2.setFecha(LocalDateTime.parse("2020-02-27T18:14:01.184"));
		 * //compra2.setVehiculo(vehiculo2);
		 * 
		 * Compra compra3 = new Compra(); //compra3.setCliente(cliente2);
		 * compra3.setCosto(new BigDecimal(3000));
		 * compra3.setFecha(LocalDateTime.now()); //compra3.setVehiculo(vehiculo3);
		 * 
		 * 
		 * this.compraService.agregar(compra1); this.compraService.agregar(compra2);
		 * this.compraService.agregar(compra3);
		 */

		// QUERYS

		/*
		 * System.out.println("\n QUERYS");
		 * System.out.println(this.vehiculoService.buscarPorMatricula("AAA"));
		 * 
		 * System.out.println("\nListas"); List<Vehiculo> vehiculos =
		 * this.vehiculoService.buscarListaPorMatricula("12345AAA"); for(Vehiculo com:
		 * vehiculos) { System.out.println(com); }
		 * 
		 * System.out.println("\nTyped QUERYS");
		 * System.out.println(this.vehiculoService.buscarPorColorTyped("negro"));
		 * 
		 * System.out.println("\nListas"); List<Vehiculo> vehiculos2 =
		 * this.vehiculoService.buscarListaPorColorTyped("azul"); for(Vehiculo com:
		 * vehiculos2) { System.out.println(com); }
		 */

		/*
		 * System.out.println("Consultas con Querys dinamicas (Criteria API Query)");
		 * Celular celular1 = new Celular(); celular1.setMarca("Samsung");
		 * celular1.setModelo("AAA"); celular1.setPeso(100.0); celular1.setPrecio(new
		 * BigDecimal(100)); celular1.setTamanio(200.0);
		 * 
		 * Celular celular2 = new Celular(); celular2.setMarca("Apple");
		 * celular2.setModelo("BBB"); celular2.setPeso(150.0); celular2.setPrecio(new
		 * BigDecimal(200)); celular2.setTamanio(100.0);
		 * 
		 * Celular celular3 = new Celular(); celular3.setMarca("Xiaomi");
		 * celular3.setModelo("CCC"); celular3.setPeso(50.0); celular3.setPrecio(new
		 * BigDecimal(100)); celular3.setTamanio(200.0);
		 * 
		 * this.celularService.actualizar(celular1);
		 * this.celularService.actualizar(celular2);
		 * this.celularService.actualizar(celular3);
		 */

		System.out.println("\nQuerys dinamicas");
			
		System.out
				.println(this.celularService.buscarCelularDinamico(new BigDecimal(100), "BBB", "Apple",150.0, 145.0, 155.0));

		System.out
		.println(this.celularService.buscarCelularDinamico(new BigDecimal(200), "BBB", "Apple",150.0, 145.0, 155.0));

	}
}