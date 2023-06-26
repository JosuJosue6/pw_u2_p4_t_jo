package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "vehiculo")
@Entity
public class Vehiculo {
	
	@Id
	@GeneratedValue(generator = "seq_vehiculo",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_vehiculo", sequenceName = "seq_vehiculo", allocationSize = 1)
	@Column(name = "vehi_id")
	private Integer id;
	
	@Column(name = "vehi_matricula")
	private String matricula;
	
	@Column(name = "vehi_modelo")
	private String modelo;
	
	@Column(name = "vehi_color")
	private String color;
	
	@OneToMany(mappedBy = "vehiculo")
	private List<Compra> compras;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Compra> getVentas() {
		return compras;
	}

	public void setVentas(List<Compra> ventas) {
		this.compras = ventas;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", matricula=" + matricula + ", modelo=" + modelo + ", color=" + color
				+ "]";
	}
}
