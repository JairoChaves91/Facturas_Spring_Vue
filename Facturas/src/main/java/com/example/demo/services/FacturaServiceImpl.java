package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Factura;
import com.example.demo.repo.IFacturasRepo;

@Service
public abstract class FacturaServiceImpl implements IFacturaService {
	
	@Autowired
	private IFacturasRepo repo;
		
		@Override
		public Factura createFactura(Factura facturaEntrada) {
		Factura facturaSalida = new Factura();
		facturaSalida.setCifUsuario(facturaEntrada.getCifUsuario());
		facturaSalida.setConceptoFactura(facturaEntrada.getConceptoFactura());
		facturaSalida.setIdFactura(facturaEntrada.getIdFactura());
		facturaSalida.setImporteFactura(facturaEntrada.getImporteFactura());
		facturaSalida.setNumFactura(facturaEntrada.getNumFactura());

		repo.save(facturaSalida);
		return facturaSalida;
		
	}

}
