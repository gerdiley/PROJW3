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
@Table (name = "riviste")
@Getter
@Setter
@NoArgsConstructor
//@DiscriminatorValue("Rivista")

public class Rivista extends ElementoLetterario{
	private Periodicita periodicita;

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", id=" + id + ", titolo=" + titolo + ", isbn=" + isbn
				+ ", anno=" + anno + ", numeroPagine=" + numeroPagine + "]";
	}
	
	
	
}
