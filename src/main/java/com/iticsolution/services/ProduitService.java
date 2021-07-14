package com.iticsolution.services;

import java.util.List;

import com.iticsolution.entities.Produit;

public interface ProduitService {
public Produit addProduct(Produit p);
public Produit getOneProductById(Long id);
public List<Produit> getAllProducts();
public void deleteProduct(Long id);
public void updateProduct(Produit p);
}
