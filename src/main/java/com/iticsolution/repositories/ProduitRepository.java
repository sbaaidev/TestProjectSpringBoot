package com.iticsolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iticsolution.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
