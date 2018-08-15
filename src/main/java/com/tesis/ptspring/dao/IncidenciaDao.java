package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Incidencia;

public interface IncidenciaDao {
	
	public Incidencia getIncidenciaById(String id);
	
	public void saveIncidencia(Incidencia incidencia);
	public void updateIncidencia(Incidencia incidencia);
	public void deleteIncidencia(String incidenciaId);
	
	public List<Incidencia> getIncidencias();

}
