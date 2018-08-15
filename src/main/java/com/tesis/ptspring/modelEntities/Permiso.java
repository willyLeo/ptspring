package com.tesis.ptspring.modelEntities;
// Generated 12/08/2018 11:51:29 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Permiso generated by hbm2java
 */
public class Permiso implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String permisoId;
	private String permiso;
	private Set permisoRols = new HashSet(0);

	public Permiso() {
	}

	public Permiso(String permisoId, String permiso) {
		this.permisoId = permisoId;
		this.permiso = permiso;
	}

	public Permiso(String permisoId, String permiso, Set permisoRols) {
		this.permisoId = permisoId;
		this.permiso = permiso;
		this.permisoRols = permisoRols;
	}

	public String getPermisoId() {
		return this.permisoId;
	}

	public void setPermisoId(String permisoId) {
		this.permisoId = permisoId;
	}

	public String getPermiso() {
		return this.permiso;
	}

	public void setPermiso(String permiso) {
		this.permiso = permiso;
	}

	public Set getPermisoRols() {
		return this.permisoRols;
	}

	public void setPermisoRols(Set permisoRols) {
		this.permisoRols = permisoRols;
	}

}