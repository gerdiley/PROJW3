package it.epicode.w3.entities;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name="utenti")
@Setter
@Getter
@NoArgsConstructor

public class Utente {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String cognome;
	@Column (name = "data_nascita")
	private String dataNascita;
	@Column (name = "numero_tessera")
	private String numeroTessera;
	
	
}
