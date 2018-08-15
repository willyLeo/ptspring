package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Bus;

public interface BusDao {
	
	public Bus getBusById(String id);
	
	public void saveBus(Bus bus);
	public void updateBus(Bus bus);
	public void deleteBus(String busId);
	
	public List<Bus> getBuses();

}
