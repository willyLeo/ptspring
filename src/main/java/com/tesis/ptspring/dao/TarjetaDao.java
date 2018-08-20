package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Tarjeta;

public interface TarjetaDao {
	
	public Tarjeta getTarjetaById(String id);
	
	public void saveTarjeta(Tarjeta tarjeta);
	public void updateTarjeta(Tarjeta tarjeta);
	public void deleteTarjeta(String tarjetaId);
	
	public List<Tarjeta> getTarjetas();

}
