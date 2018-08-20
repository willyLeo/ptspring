package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Rol;

public interface RolDao {
	
	public Rol getRolById(String id);
	
	public void saveRol(Rol rol);
	public void updateRol(Rol rol);
	public void deleteRol(String rolId);
	
	public List<Rol> getRoles();

}
