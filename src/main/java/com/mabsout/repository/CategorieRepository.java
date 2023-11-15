package com.mabsout.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mabsout.entities.Article;
import com.mabsout.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie , Long> {
}
