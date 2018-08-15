package com.tesis.ptspring.modelEntities;
// Generated 12/08/2018 11:51:29 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String usuarioId;
	private Empleado empleado;
	private Rol rol;
	private Socio socio;
	private String username;
	private String password;

	public Usuario() {
	}

	public Usuario(String usuarioId, Empleado empleado, Rol rol, Socio socio, String username, String password) {
		this.usuarioId = usuarioId;
		this.empleado = empleado;
		this.rol = rol;
		this.socio = socio;
		this.username = username;
		this.password = password;
	}

	public String getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Socio getSocio() {
		return this.socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}