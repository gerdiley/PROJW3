package it.epicode.w3.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prestiti")
@Getter
@Setter
@NoArgsConstructor


@NamedQuery (name = "prestitoBytessera", query = "SELECT p FROM Prestito p where p.utente.numeroTessera = :nt")
@NamedQuery (name = "prestitiScaduti", query = "SELECT p FROM Prestito p WHERE (dataRestituzionePrev > CURRENT DATE AND dataRestituzioneEff IS NULL)")
public class Prestito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne 
	private Utente utente;
	
	@ManyToOne
	private ElementoLetterario elementoPrestato;
	
	private LocalDate dataInizioPrestito;
	
	private LocalDate dataRestituzionePrev;
	
	private LocalDate dataRestituzioneEff;

	
	
}
