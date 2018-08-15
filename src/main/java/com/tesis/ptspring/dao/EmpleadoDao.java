package com.tesis.ptspring.dao;

import java.util.List;

import com.tesis.ptspring.modelEntities.Empleado;

public interface EmpleadoDao {
	
	public Empleado getEmpleadoById(String id);
	
	public void saveEmpleado(Empleado empleado);
	public void updateEmpleado(Empleado empleado);
	public void deleteEmpleado(String empleadoId);
	
	public List<Empleado> getEmpleados();

}
