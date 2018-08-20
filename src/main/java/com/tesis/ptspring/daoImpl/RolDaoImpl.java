package com.tesis.ptspring.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.tesis.ptspring.dao.RolDao;
import com.tesis.ptspring.modelEntities.Rol;

public class RolDaoImpl implements RolDao{
	
	private SessionFactory sessionFactory;
	
	public RolDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Rol getRolById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRol(Rol rol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRol(Rol rol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRol(String rolId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Rol> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

}
