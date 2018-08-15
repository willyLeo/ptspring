package com.tesis.ptspring.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tesis.ptspring.dao.BusDao;
import com.tesis.ptspring.modelEntities.Bus;

public class BusDaoImpl implements BusDao{
	
	private SessionFactory sessionfactory;
	
	public BusDaoImpl(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Bus> getBuses() {
		Session session = this.sessionfactory.getCurrentSession();
		List<Bus> buses = (List<Bus>) session.createQuery("select from Bus").list();
		
		return buses;
	}

	@Override
	public void saveBus(Bus bus) {
		Session session = this.sessionfactory.getCurrentSession();
		session.save(bus);
	}

	@Override
	public Bus getBusById(String id) {
		Session session = this.sessionfactory.getCurrentSession();
		
		Bus bus = session.load(Bus.class, id);
		
		return bus;
	}

	@Override
	public void updateBus(Bus bus) {
		Session session = this.sessionfactory.getCurrentSession();
		session.update(bus);
	}

	@Override
	public void deleteBus(String busId) {
		// TODO Auto-generated method stub
		
	}

}
