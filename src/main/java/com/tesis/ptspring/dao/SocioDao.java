package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Socio;

public interface SocioDao {
	
	public Socio getSocioById(String id);
	
	public void saveSocio(Socio socio);
	public void updateSocio(Socio socio);
	public void deleteSocio(String socioId);
	
	public List<Socio> getSocios();

}
