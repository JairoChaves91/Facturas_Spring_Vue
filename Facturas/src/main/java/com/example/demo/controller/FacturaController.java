package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Factura;
import com.example.demo.repo.IFacturasRepo;

@Controller
public class FacturaController {
	
	@Autowired
private IFacturasRepo repo;

@GetMapping("/facturas")
public String facturas(@RequestParam(name="conceptoFactura", required=false, defaultValue = "world") String name, Model model) {
	Factura p = new Factura();
	p.setIdFactura(10);
	p.setConceptoFactura("Que te importa 1000");
	p.setCifUsuario("B7654321");
	p.setImporteFactura(10598);
	p.setNumFactura(20000);
	repo.save(p);
	model.addAttribute("conceptoFactura", name);
	
	return "facturas";
	}
	
}
