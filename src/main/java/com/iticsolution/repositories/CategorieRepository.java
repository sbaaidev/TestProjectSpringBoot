package com.iticsolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iticsolution.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
