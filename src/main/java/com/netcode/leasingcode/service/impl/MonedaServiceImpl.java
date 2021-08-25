package com.netcode.leasingcode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcode.leasingcode.model.Moneda;
import com.netcode.leasingcode.repo.MonedaRepoInterface;
import com.netcode.leasingcode.service.MonedaService;

@Service   //informamos a sprint que es un servicio
public class MonedaServiceImpl implements MonedaService {

	@Autowired
	private MonedaRepoInterface repoInterfaceMoneda;

	@Override
	public List<Moneda> getAll() {
		return repoInterfaceMoneda.findAll();
	}

	@Override
	public Moneda save(Moneda moneda) {
		return repoInterfaceMoneda.save(moneda);
	}
	
	
}
