package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Usuario;

public interface UsuarioDao {
	
	public Usuario getUsuarioById(String id);
	
	public void saveUsuario(Usuario usuario);
	public void updateUsuario(Usuario usuario);
	public void deleteUsuario(String usuarioId);
	
	public List<Usuario> getUsuario();

}
