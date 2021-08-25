package com.netcode.leasingcode.service;

import java.util.List;

import com.netcode.leasingcode.model.Moneda;

public interface MonedaService {

	public List<Moneda> getAll();
	
	public Moneda save(Moneda moneda);	
	
	
}
