package com.tesis.ptspring.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tesis.ptspring.dao.BusDao;
import com.tesis.ptspring.modelEntities.Bus;

public class BusDaoImpl implements BusDao{
	
	private SessionFactory sessionFactory;
	
	public BusDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	@Transactional(rollbackOn=Exception.class)
	public List<Bus> getBuses() {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Bus> buses = session.createQuery("from Bus").list();
		
		return buses;
	}

	
	@Override
	@Transactional
	public void saveBus(Bus bus) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(bus);
	}

	@Override
	@Transactional
	public Bus getBusById(String id) {
		Session session = this.sessionFactory.getCurrentSession();
		
		Bus bus = session.load(Bus.class, id);
		
		return bus;
	}

	@Override
	@Transactional
	public void updateBus(Bus bus) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(bus);
	}

	@Override
	public void deleteBus(String busId) {
		// TODO Auto-generated method stub
		
	}
	

}
