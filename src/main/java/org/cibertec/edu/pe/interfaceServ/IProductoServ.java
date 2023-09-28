package org.cibertec.edu.pe.interfaceServ;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.entity.Producto;

public interface IProductoServ {
	
	public List<Producto> Listado();
	public Optional<Producto> Buscar(int id);
	public int Grabar(Producto ObjP);

}
