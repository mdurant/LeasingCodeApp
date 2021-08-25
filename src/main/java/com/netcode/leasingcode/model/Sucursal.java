package com.netcode.leasingcode.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sucursal")
public class Sucursal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="idempresa", nullable = false)
	private Long idempresa;
	
	@Column(name="nombre", nullable = false)
	private String nombre;
	
	@Column(name="codigo", nullable = false, length = 10)
	private String codigo;
	
	@Column(name="direccion", nullable = false)
	private String direccion;
	
	@OneToOne
    @JoinColumn(name = "idregion", nullable = false, foreignKey = @ForeignKey(name="FK_region"))
	private Region region;
	
	//@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@OneToOne
	@JoinColumn(name = "idciudad", nullable = false, foreignKey = @ForeignKey(name="FK_ciudad"))
	private Ciudad ciudad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdempresa() {
		return idempresa;
	}

	public void setIdempresa(Long idempresa) {
		this.idempresa = idempresa;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
