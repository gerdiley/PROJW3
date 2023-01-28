package it.epicode.w3.app;

import java.time.LocalDate;

import it.epicode.w3.dao.ElementoLetterarioDAO;
import it.epicode.w3.dao.PrestitoDAO;
import it.epicode.w3.dao.UtenteDAO;
import it.epicode.w3.entities.ElementoLetterario;
import it.epicode.w3.entities.Libro;
import it.epicode.w3.entities.Periodicita;
import it.epicode.w3.entities.Prestito;
import it.epicode.w3.entities.Rivista;
import it.epicode.w3.entities.Utente;
import it.epicode.w3.utils.JpaUtils;

public class Catalogo {

	public static void main(String[] args) {
		
		// -------------------AGGIUNTA LIBRO--------------------		
		
		Libro l1 = new Libro();
		l1.setIsbn("l1");
		l1.setAutore("Angelo");
		l1.setTitolo("Titolo Libro 1");
		l1.setNumeroPagine(200);
		l1.setGenere("Fantasy");
		l1.setAnno(2022);
		
		// -------------------AGGIUNTA RIVISTA--------------------
		
		Rivista r1 = new Rivista();
		r1.setIsbn("r1");
		r1.setTitolo("Titolo Rivista 1");
		r1.setNumeroPagine(150);
		r1.setAnno(2021);
		r1.setPeriodicita(Periodicita.MENSILE);
		
		
		// -------------------SALVO ELEMENTI--------------------

//		ElementoLetterarioDAO.save(l1);
//		ElementoLetterarioDAO.save(r1);
		
		
		//--------------------RIMOZIONE ELEMENTO BY ISBN-------------
		
//		ElementoLetterarioDAO.removeByIsbn("l1");
		
		//--------------------RICERCA ELEMENTO BY ISBN-------------
		
//		ElementoLetterarioDAO.getByIsbn("r1");
		
		//--------------------RICERCA ELEMENTO BY ANNO-------------
		
//		ElementoLetterarioDAO.getByAnno(2021);
		
		//--------------------RICERCA ELEMENTO BY AUTORE-------------
		
//		ElementoLetterarioDAO.getByAutore("Angelo");
		
		//---------------------RICERCA ELEMENTO BY TITOLO (O PARTE DI ESSO)-----------
		
//		ElementoLetterarioDAO.getByTitolo("itol");
		
		//---------------------RICERCA ELEMENTO BY TITOLO (O PARTE DI ESSO)-----------
		
		
		// -------------------AGGIUNTA UTENTE--------------------	
		
				Utente u1 = new Utente();
				u1.setNome("Gerardo");
				u1.setCognome("Di Letizia");
				u1.setDataNascita("01-12-1994");
				u1.setNumeroTessera("100");
				
		// -------------------SALVO UTENTE-------------------- 
		
		
//		UtenteDAO.save(u1);
		
		// -------------------AGGIUNTA PRESTITO--------------------	
		
		Prestito p1 = new Prestito();
		p1.setUtente(u1);
		p1.setElementoPrestato(r1);
		p1.setDataInizioPrestito(LocalDate.parse("2022-12-01"));
		p1.setDataRestituzioneEff(LocalDate.parse("2023-01-21"));
		p1.setDataRestituzionePrev(LocalDate.parse("2023-01-01"));
		
		
		// -------------------SALVO PRESTITO-------------------- 
		
//		PrestitoDAO.save(p1);
		
		
		//--------------------RICERCA PRESTITI BY N. TESSERA -------------
		
//		PrestitoDAO.getByTessera(100);
		
		//--------------------RICERCA PRESTITI SCADUTI -------------
		
//		PrestitoDAO.getPrestitiScaduti();
		
		
		
		

	}

}
