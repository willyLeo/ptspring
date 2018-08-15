package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Cronograma;

public interface CronogramaDao {
	
	public Cronograma getCronogramaById(String id);
	
	public void saveCronograma(Cronograma cronograma);
	public void updateCronograma(Cronograma cronograma);
	public void deleteCronograma(String cronogramaId);
	
	public List<Cronograma> getCronogramas();

}
