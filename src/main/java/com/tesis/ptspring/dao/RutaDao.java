package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Ruta;

public interface RutaDao {
	
	public Ruta getRutaById(String id);
	
	public void saveRuta(Ruta ruta);
	public void updateRuta(Ruta ruta);
	public void deleteRuta(String rutaId);
	
	public List<Ruta> getRutas();

}
