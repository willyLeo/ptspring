package com.tesis.ptspring.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tesis.ptspring.dao.CronogramaDao;
import com.tesis.ptspring.modelEntities.Cronograma;

public class CronogramaDaoImpl implements CronogramaDao{
	
	private SessionFactory sessionFactory;
	
	public CronogramaDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Cronograma getCronogramaById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCronograma(Cronograma cronograma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCronograma(Cronograma cronograma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCronograma(String cronogramaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Cronograma> getCronogramas() {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Cronograma> cronogramas = session.createQuery("from Cronograma").list();
		
		return cronogramas;
	}

}
