package com.netcode.leasingcode.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="provincia")
public class Provincia implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="codigo", nullable = false)
	private Integer codigo;
	
	@Column(name="nombre", nullable = false)
	private String nombre;
	
	@ManyToOne
    @JoinColumn(name = "idregion", nullable = false, foreignKey = @ForeignKey(name="FK_region"))
	private Region region;
	
}
