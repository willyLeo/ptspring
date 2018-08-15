package com.tesis.ptspring.modelEntities;
// Generated 12/08/2018 11:51:29 PM by Hibernate Tools 5.3.0.Beta2

import java.util.Date;

/**
 * Incidencia generated by hbm2java
 */
public class Incidencia implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String incidenciaId;
	private CategoriaIncidencia categoriaIncidencia;
	private SalidaBus salidaBus;
	private Date fechaIncidencia;
	private Date horaEstimada;
	private String anotaciones;

	public Incidencia() {
	}

	public Incidencia(String incidenciaId, CategoriaIncidencia categoriaIncidencia, SalidaBus salidaBus,
			Date fechaIncidencia, Date horaEstimada) {
		this.incidenciaId = incidenciaId;
		this.categoriaIncidencia = categoriaIncidencia;
		this.salidaBus = salidaBus;
		this.fechaIncidencia = fechaIncidencia;
		this.horaEstimada = horaEstimada;
	}

	public Incidencia(String incidenciaId, CategoriaIncidencia categoriaIncidencia, SalidaBus salidaBus,
			Date fechaIncidencia, Date horaEstimada, String anotaciones) {
		this.incidenciaId = incidenciaId;
		this.categoriaIncidencia = categoriaIncidencia;
		this.salidaBus = salidaBus;
		this.fechaIncidencia = fechaIncidencia;
		this.horaEstimada = horaEstimada;
		this.anotaciones = anotaciones;
	}

	public String getIncidenciaId() {
		return this.incidenciaId;
	}

	public void setIncidenciaId(String incidenciaId) {
		this.incidenciaId = incidenciaId;
	}

	public CategoriaIncidencia getCategoriaIncidencia() {
		return this.categoriaIncidencia;
	}

	public void setCategoriaIncidencia(CategoriaIncidencia categoriaIncidencia) {
		this.categoriaIncidencia = categoriaIncidencia;
	}

	public SalidaBus getSalidaBus() {
		return this.salidaBus;
	}

	public void setSalidaBus(SalidaBus salidaBus) {
		this.salidaBus = salidaBus;
	}

	public Date getFechaIncidencia() {
		return this.fechaIncidencia;
	}

	public void setFechaIncidencia(Date fechaIncidencia) {
		this.fechaIncidencia = fechaIncidencia;
	}

	public Date getHoraEstimada() {
		return this.horaEstimada;
	}

	public void setHoraEstimada(Date horaEstimada) {
		this.horaEstimada = horaEstimada;
	}

	public String getAnotaciones() {
		return this.anotaciones;
	}

	public void setAnotaciones(String anotaciones) {
		this.anotaciones = anotaciones;
	}

}
