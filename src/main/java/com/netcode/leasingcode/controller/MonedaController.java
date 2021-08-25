package com.netcode.leasingcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netcode.leasingcode.model.Moneda;
import com.netcode.leasingcode.service.MonedaService;

@RestController   // Exponer a Internet
public class MonedaController {
	
	@Autowired
	private MonedaService monedaService;
	
	@GetMapping("/moneda")
	public @ResponseBody List<Moneda> getAll() {
		return monedaService.getAll();
	}
	
	@PostMapping("/moneda")
	public @ResponseBody Moneda save(@RequestBody Moneda moneda) {
		return monedaService.save(moneda);
	}

}
