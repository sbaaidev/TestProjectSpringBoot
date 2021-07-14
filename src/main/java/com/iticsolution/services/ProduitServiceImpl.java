package com.iticsolution.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iticsolution.entities.Produit;
import com.iticsolution.repositories.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
	
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public Produit addProduct(Produit p) {
		//Produit p2 = 
		return produitRepository.save(p);
	}

	@Override
	public Produit getOneProductById(Long id) {
	
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProducts() {
		
		return produitRepository.findAll();
	}

	@Override
	public void deleteProduct(Long id) {
		
		produitRepository.deleteById(id);	
	}

	@Override
	public void updateProduct(Produit p) {
		produitRepository.save(p);
		
	}

}
