package com.netcode.leasingcode.service;

import java.util.List;

import com.netcode.leasingcode.model.Empresa;

public interface EmpresaService {

	public List<Empresa> getAll();
	
	public Empresa save(Empresa empresa);
	
}
