package com.tesis.ptspring.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tesis.ptspring.dao.IncidenciaDao;
import com.tesis.ptspring.modelEntities.Incidencia;

public class IncidenciaDaoImpl implements IncidenciaDao{
	
	private SessionFactory sessionFactory;
	
	public IncidenciaDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Incidencia getIncidenciaById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveIncidencia(Incidencia incidencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateIncidencia(Incidencia incidencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteIncidencia(String incidenciaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Incidencia> getIncidencias() {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Incidencia> incidencias = session.createQuery("from Incidencia").list();
		
		return incidencias;
	}

}
