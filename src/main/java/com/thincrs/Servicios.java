package com.thincrs;

public class Servicios {
	public String nombre;
	public int codigo;
	public String descripcion;
	public String ciudad;
	public String categoria;
	public String colonia;
	
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	protected String getDescripcion() {
		return descripcion;
	}
	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	protected String getCiudad() {
		return ciudad;
	}
	protected void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	protected String getCategoria() {
		return categoria;
	}
	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	protected String getColonia() {
		return colonia;
	}
	protected void setColonia(String colonia) {
		this.colonia = colonia;
	}

}