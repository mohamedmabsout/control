package com.mabsout.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



	@Entity
	public class Article implements Serializable {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;
		private String nom;
		@Temporal(TemporalType.DATE)
		private Date date;
		@ManyToOne
		private Categorie categorie;

		    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

			private String code;

			public Article() {
				super();
			}

			public Article(String code) {
				super();
				this.code = code;
			}
		    
		    
		    
		

}

