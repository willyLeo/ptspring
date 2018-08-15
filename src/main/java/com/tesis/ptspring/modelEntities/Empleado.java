package com.tesis.ptspring.modelEntities;
// Generated 12/08/2018 11:51:29 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String empleadoId;
	private Locacion locacion;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String dni;
	private String telefono;
	private String movil;
	private String direccion;
	private Set usuarios = new HashSet(0);

	public Empleado() {
	}

	public Empleado(String empleadoId, Locacion locacion, String nombres, String apellidoPaterno,
			String apellidoMaterno, String dni) {
		this.empleadoId = empleadoId;
		this.locacion = locacion;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.dni = dni;
	}

	public Empleado(String empleadoId, Locacion locacion, String nombres, String apellidoPaterno,
			String apellidoMaterno, String dni, String telefono, String movil, String direccion, Set usuarios) {
		this.empleadoId = empleadoId;
		this.locacion = locacion;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.dni = dni;
		this.telefono = telefono;
		this.movil = movil;
		this.direccion = direccion;
		this.usuarios = usuarios;
	}

	public String getEmpleadoId() {
		return this.empleadoId;
	}

	public void setEmpleadoId(String empleadoId) {
		this.empleadoId = empleadoId;
	}

	public Locacion getLocacion() {
		return this.locacion;
	}

	public void setLocacion(Locacion locacion) {
		this.locacion = locacion;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMovil() {
		return this.movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

}