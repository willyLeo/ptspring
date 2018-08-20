package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Periodo;

public interface PeriodoDao {
	
	public Periodo getPeriodoById(String id);
	
	public void savePeriodo(Periodo periodo);
	public void updatePeriodo(Periodo periodo);
	public void deletePeriodo(String periodoId);
	
	public List<Periodo> getPeriodos();

}
