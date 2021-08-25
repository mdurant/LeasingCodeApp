package com.netcode.leasingcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netcode.leasingcode.model.Empresa;
import com.netcode.leasingcode.service.EmpresaService;

@RestController   // Exponer a Internet
public class EmpresaController {
	
	@Autowired
	private EmpresaService EmpresaService;
	
	@GetMapping("/empresa")
	public @ResponseBody List<Empresa> getAll() {
		return EmpresaService.getAll();
	}
	
	@PostMapping("/empresa")
	public @ResponseBody Empresa save(@RequestBody Empresa Empresa) {
		return EmpresaService.save(Empresa);
	}
}
