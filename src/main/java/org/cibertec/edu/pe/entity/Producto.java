package org.cibertec.edu.pe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="producto")
public class Producto {
	
	//Atributos
	
	@Id
	 int IdProducto;
	 String Descripcion;
	 double PrecioUnidad;
	 double Stock;
	 int Estado;
	 
	 //Constructores
	 
	public Producto() {
	}



	public Producto(int idProducto, String descripcion, double precioUnidad, double stock, int estado) {
		IdProducto = idProducto;
		Descripcion = descripcion;
		PrecioUnidad = precioUnidad;
		Stock = stock;
		Estado = estado;
	}
	
	//Setters and Getters


	public int getIdProducto() {
		return IdProducto;
	}



	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}



	public String getDescripcion() {
		return Descripcion;
	}



	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}



	public double getPrecioUnidad() {
		return PrecioUnidad;
	}



	public void setPrecioUnidad(double precioUnidad) {
		PrecioUnidad = precioUnidad;
	}



	public double getStock() {
		return Stock;
	}



	public void setStock(double stock) {
		Stock = stock;
	}



	public int getEstado() {
		return Estado;
	}



	public void setEstado(int estado) {
		Estado = estado;
	}
	
	
	
			 
	 

}
