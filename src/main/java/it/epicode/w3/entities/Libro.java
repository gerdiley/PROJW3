package it.epicode.w3.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "libri")
@Getter
@Setter
@NoArgsConstructor
//@DiscriminatorValue("Libro")


public class Libro extends ElementoLetterario{
	
	
	
	private String autore;
	private String genere;
	
	
	
	public Libro(String titolo, String isbn, int anno, int numeroPagine, String autore, String genere) {
		super(titolo, isbn, anno, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}



	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + ", id=" + id + ", titolo=" + titolo + ", isbn=" + isbn
				+ ", anno=" + anno + ", numeroPagine=" + numeroPagine + "]";
	}
	
	
	
	
	
}
