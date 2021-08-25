package com.netcode.leasingcode.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresa_seguros")
public class EmpresaSeguros implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="rut", nullable = false, length = 15)
	private String rut;
	
	@Column(name="empresa", nullable = false, length = 150)
	private String empresa;
	
	public enum Estado {
		ACTIVO,
		INACTIVO
	}
	
	@Column(name ="estado", nullable = false, length = 8)
	@Enumerated(EnumType.STRING)
	private Estado estado;

	public Integer getIdEmpresaSeguros() {
		return id;
	}

	public void setIdEmpresaSeguros(Integer id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
