package com.mabsout.entities;

import java.io.Serializable;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	private String nom;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Categorie() {
		super();
	}
	
	@ManyToOne
	private Categorie categorieParent;
	@OneToMany(mappedBy = "categorieParent")
	private List<Categorie> categoriesParent;
	
	
	}
