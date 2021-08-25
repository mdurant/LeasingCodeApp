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
@Table(name="ciudad")
public class Ciudad implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre", nullable = false)
	private String nombreciudad;
	
	@Column(name="codigo", nullable = false)
	private String codciudad;
	
	@ManyToOne
    @JoinColumn(name = "idprovincia", nullable = false, foreignKey = @ForeignKey(name="FK_provincia"))
	private Provincia provincia;
	
}
