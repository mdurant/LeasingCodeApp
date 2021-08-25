package com.netcode.leasingcode.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "empresa")
public class Empresa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "rut", nullable = false)
	private String rut;
	
	@Column(name = "razonSocial", nullable = false, length = 200)
	private String razonSocial;
	
	@Column(name="giro", nullable = false)
	private String giroEmpresa;
	
	@Column(name="descripcion", nullable = true)
	private String descripcion;
	
	@Column(name ="domicilio", nullable = false)
	private String domicilio;
	
	@Column(name="representante", nullable = false)
	private String representante;
	
	@Column(name ="email", nullable = false)
	private String email;
	
	@Column(name="emailDte", nullable = false)
	private String emailDte;
	
	@Column(name="emailNotificacion")
	private String emailNotificacion;
	
	@Column(name="idregion")
	//@OneToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinColumn(name="idRegion", nullable = false,  foreignKey = @ForeignKey(name="FK_region"))
	private Integer idregion;
	
	@Column(name="idciudad")
	//@OneToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinColumn(name="idCiudad", nullable = false,  foreignKey = @ForeignKey(name="FK_ciudad"))
	private Integer idciudad;
	
	@Column(name="idpais")
	//@OneToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinColumn(name="idPais", nullable = false,  foreignKey = @ForeignKey(name="FK_pais"))
	private Integer idpais;
	
	public enum estadoEmpresa {
	    Activo, Inactivo;
	}
	
	@Column(name = "estado", length = 10, nullable = false)
	@Enumerated(EnumType.STRING)
    private estadoEmpresa estado;
	
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "idempresa")
    private List<Sucursal> sucursales;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getGiroEmpresa() {
		return giroEmpresa;
	}


	public void setGiroEmpresa(String giroEmpresa) {
		this.giroEmpresa = giroEmpresa;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getRepresentante() {
		return representante;
	}


	public void setRepresentante(String representante) {
		this.representante = representante;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmailDte() {
		return emailDte;
	}


	public void setEmailDte(String emailDte) {
		this.emailDte = emailDte;
	}


	public String getEmailNotificacion() {
		return emailNotificacion;
	}


	public void setEmailNotificacion(String emailNotificacion) {
		this.emailNotificacion = emailNotificacion;
	}


	public Integer getId_region() {
		return idregion;
	}


	public void setId_region(Integer id_region) {
		this.idregion = id_region;
	}


	public Integer getId_ciudad() {
		return idciudad;
	}


	public void setId_ciudad(Integer id_ciudad) {
		this.idciudad = id_ciudad;
	}


	public Integer getId_pais() {
		return idpais;
	}


	public void setId_pais(Integer id_pais) {
		this.idpais = id_pais;
	}


	public estadoEmpresa getEstado() {
		return estado;
	}


	public void setEstado(estadoEmpresa estado) {
		this.estado = estado;
	}


	public List<Sucursal> getSucursales() {
		return sucursales;
	}


	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
	
	
}
