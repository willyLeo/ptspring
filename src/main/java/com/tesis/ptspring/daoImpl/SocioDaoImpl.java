package com.tesis.ptspring.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.tesis.ptspring.dao.SocioDao;
import com.tesis.ptspring.modelEntities.Socio;

public class SocioDaoImpl implements SocioDao{
	
	private SessionFactory sessionFactory;
	
	public SocioDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Socio getSocioById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSocio(Socio socio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSocio(Socio socio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSocio(String socioId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Socio> getSocios() {
		// TODO Auto-generated method stub
		return null;
	}

}
