package com.iticsolution.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iticsolution.entities.Produit;
import com.iticsolution.services.ProduitService;

@RestController
public class ProduitController {
	@Autowired
	ProduitService produitService;
	
	@RequestMapping(value = "/products",method = RequestMethod.GET)
	public List<Produit> getAllproducts() {
		return produitService.getAllProducts();
	}
	
	@RequestMapping(value = "/products",method = RequestMethod.POST)
	public Produit addProduct(@RequestBody Produit p) {
		return produitService.addProduct(p);
	}
	
	@RequestMapping(value = "/products/{id}",method = RequestMethod.DELETE)
	public void  deleteProduct(@PathVariable Long id) {
	     produitService.deleteProduct(id);
	}

}
