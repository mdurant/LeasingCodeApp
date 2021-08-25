package com.netcode.leasingcode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcode.leasingcode.model.Empresa;
import com.netcode.leasingcode.repo.EmpresaRepoInterface;
import com.netcode.leasingcode.service.EmpresaService;

@Service
public class EmpresaServiceImp implements EmpresaService {

	@Autowired
	private EmpresaRepoInterface repoInterfaceEmpresa;

	@Override
	public List<Empresa> getAll() {
		return repoInterfaceEmpresa.findAll();
	}

	@Override
	public Empresa save(Empresa empresa) {
		return repoInterfaceEmpresa.save(empresa);
	}
	
}
