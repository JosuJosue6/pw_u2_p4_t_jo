package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "celular")
public class Celular {

	@Id
	@GeneratedValue(generator = "seq_celular", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_celular", sequenceName = "seq_celular", allocationSize = 1)
	@Column(name = "celu_id")
	private Integer id;
	
	@Column(name = "celu_modelo")
	private String modelo;
	
	@Column(name = "celu_marca")
	private String marca;
	
	@Column(name = "celu_precio")
	private BigDecimal precio;
	
	@Column(name = "celu_peso")
	private Double peso;
	
	@Column(name = "celu_tamanio")
	private Double tamanio;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getTamanio() {
		return tamanio;
	}

	public void setTamanio(Double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Celular [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", peso=" + peso
				+ ", tamanio=" + tamanio + "]";
	}
	
	
}
