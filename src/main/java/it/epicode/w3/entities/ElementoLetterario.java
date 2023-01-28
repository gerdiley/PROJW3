package it.epicode.w3.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
//@DiscriminatorColumn(name = "elemento_type", discriminatorType = DiscriminatorType.STRING)


@NamedQuery(name = "removeByIsbn", query = "DELETE Libro l WHERE l.isbn = :n")
@NamedQuery(name = "getByIsbn", query = "SELECT el FROM ElementoLetterario el WHERE el.isbn = :n")
@NamedQuery(name = "getByAutore", query = "SELECT l FROM Libro l WHERE l.autore = :a")
@NamedQuery(name = "getByTitolo", query = "SELECT el FROM ElementoLetterario el WHERE el.titolo LIKE :a")
@NamedQuery(name = "getByAnno", query = "SELECT el FROM ElementoLetterario el WHERE el.anno= :n")

public abstract class ElementoLetterario {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	protected int id;
	
	protected String titolo;
	protected String isbn;
	protected int anno;
	@Column (name = "numero_pagine")
	protected int numeroPagine;
	
	public ElementoLetterario(String titolo, String isbn, int anno, int numeroPagine) {

		this.titolo = titolo;
		this.isbn = isbn;
		this.anno = anno;
		this.numeroPagine = numeroPagine;
	}
	
	
}
