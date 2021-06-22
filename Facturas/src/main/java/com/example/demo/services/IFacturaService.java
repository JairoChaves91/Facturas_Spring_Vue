package com.example.demo.services;

import java.util.Optional;

import com.example.demo.model.Factura;

public interface IFacturaService {
	
	public Factura createFactura(Factura facturaEntrada);
	
	public Optional<Factura> recuperaFactura(Integer idFacturaEntrada);

}

