package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "compra")
@Entity
public class Compra {
	
	@Id
	@GeneratedValue(generator = "seq_compra", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_compra", sequenceName = "seq_compra", allocationSize = 1)
	@Column(name = "comp_id")
	private Integer id;
	
	@Column(name = "comp_fecha")
	private LocalDateTime fecha;
	
	@Column(name = "comp_costo")
	private BigDecimal costo;
	
	@ManyToOne(cascade = CascadeType.ALL) //SON LOS HIJOS
	@JoinColumn(name ="comp_id_cliente")
	private Cliente cliente;
	
	@ManyToOne(cascade = CascadeType.ALL) //SON LOS HIJOS
	@JoinColumn(name ="comp_id_vehiculo")
	private Vehiculo vehiculo;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", fecha=" + fecha + ", costo=" + costo + ", cliente=" + cliente + ", vehiculo="
				+ vehiculo + "]";
	}

}
