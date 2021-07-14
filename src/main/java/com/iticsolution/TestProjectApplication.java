package com.iticsolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iticsolution.entities.Categorie;
import com.iticsolution.entities.Produit;
import com.iticsolution.repositories.CategorieRepository;
import com.iticsolution.repositories.ProduitRepository;
import com.iticsolution.services.ProduitService;

@SpringBootApplication
public class TestProjectApplication implements CommandLineRunner{
	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	CategorieRepository categorieRepository;
	
	@Autowired
	ProduitService produitService;

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}
	
	

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * //Categories Categorie cat1=new Categorie("cat1"); Categorie catrecived1
		 * =categorieRepository.save(cat1); Categorie cat2=new Categorie("cat2");
		 * Categorie catrecived2 =categorieRepository.save(cat2); Categorie cat3=new
		 * Categorie("cat3"); Categorie catrecived3=categorieRepository.save(cat3);
		 * //produit
		 * 
		 * Produit p1=new Produit("Ordinateur HP", 9000); p1.setCategorie(catrecived1);
		 * produitRepository.save(p1); Produit p2=new Produit("Imprimante", 6000);
		 * p2.setCategorie(catrecived2); produitRepository.save(p2); Produit p3=new
		 * Produit("Ecran Dell ", 1500); p3.setCategorie(catrecived2);
		 * produitRepository.save(p3);
		 */
		
		//Categories
		Categorie cat1=new Categorie("cat1");
		Categorie catrecived1 =categorieRepository.save(cat1);
		Categorie cat2=new Categorie("cat2");
		Categorie catrecived2 =categorieRepository.save(cat2);
		Categorie cat3=new Categorie("cat3");
		Categorie catrecived3=categorieRepository.save(cat3);
		//produit
		
		Produit p1=new Produit("Ordinateur HP", 9000);
		p1.setCategorie(catrecived1);
		produitService.addProduct(p1);
		Produit p2=new Produit("Imprimante", 6000);
		p2.setCategorie(catrecived2);
		produitService.addProduct(p2);
		Produit p3=new Produit("Ecran Dell ", 1500);
		p3.setCategorie(catrecived2);
		produitService.addProduct(p3);
		
		
	}

}
