package org.cibertec.edu.pe.services;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.entity.Producto;
import org.cibertec.edu.pe.interfaceServ.IProductoServ;
import org.cibertec.edu.pe.interfaces.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoService implements IProductoServ{
	
	@Autowired
	private IProducto data;

	@Override
	public List<Producto> Listado() {
		
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> Buscar(int id) {
		
		return data.findById(id);
	}

	@Override
	public int Grabar(Producto ObjP) {
		int rpta =0;
		Producto p = data.save(ObjP);
		if(!p.equals(null))rpta=1;
		return rpta;
	}

}
