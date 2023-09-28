package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.entity.Producto;
import org.cibertec.edu.pe.interfaceServ.IProductoServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	private IProductoServ servicio; 
	
	//Metodo Listar
	
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Producto> lista = servicio.Listado();
		m.addAttribute("productos",lista);
		
		return "listar";
	}
	
	//metodo buscar
	
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable int id, Model m) {
		Optional<Producto> p = servicio.Buscar(id);
		m.addAttribute("producto",p);
		return "view";
	}
	
	//Metodo agregar
	
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("producto", new Producto());
		return "form";
	}
	
	//metodo para grabar
	@GetMapping("/salvar")
	public String salvar(@Validated Producto p, Model m) {
		servicio.Grabar(p);
		return "redirect:/listar";
	}
	
	
	
	
	
	
	
	
	

}
