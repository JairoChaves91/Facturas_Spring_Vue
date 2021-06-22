package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IdFactura")
	@SequenceGenerator(name = "IdFactura", sequenceName = "IdFacturaGenerator")
	@Column (name = "idFactura", length=50)
	private int idFactura;
	@Column (name = "numFactura", length=50)
	private int numFactura;
	@Column (name = "cifUsuario", length=15)
	private String cifUsuario;
	@Column (name = "importeFactura", length=15)
	private int importeFactura;
	@Column (name = "conceptoFactura", length=50)
	private String conceptoFactura;
	@Column (name = "fechaFactura", length=15)
	private Date fechaFactura;
	
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}
	public String getCifUsuario() {
		return cifUsuario;
	}
	public void setCifUsuario(String cifUsuario) {
		this.cifUsuario = cifUsuario;
	}
	public int getImporteFactura() {
		return importeFactura;
	}
	public void setImporteFactura(int importeFactura) {
		this.importeFactura = importeFactura;
	}
	public String getConceptoFactura() {
		return conceptoFactura;
	}
	public void setConceptoFactura(String conceptoFactura) {
		this.conceptoFactura = conceptoFactura;
	}
	public Date getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

}
