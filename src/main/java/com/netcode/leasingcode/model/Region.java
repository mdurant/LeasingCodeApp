package com.netcode.leasingcode.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="region")
public class Region implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="nombre", nullable = false)
	private String nombre;
	
	@Column(name="codigo", nullable = false)
	private String codigo;
	
	@Column(name="simbolo", nullable = false, length = 5)
	private String simbolo;
	
	@Column(name="ISO", nullable = false)
	private String ISO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getISO_3166_2_CL() {
		return ISO;
	}

	public void setISO_3166_2_CL(String ISO) {
		ISO = ISO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
