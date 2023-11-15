package com.mabsout.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mabsout.entities.Article;
import com.mabsout.entities.Categorie;

@Repository
public interface ArticleRepository extends JpaRepository<Article , Long>{
	List<Article> findByCategorie(Categorie categorie);
}
