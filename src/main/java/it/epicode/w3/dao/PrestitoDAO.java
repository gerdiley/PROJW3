package it.epicode.w3.dao;

import java.util.List;

import javax.persistence.Query;

import it.epicode.w3.entities.ElementoLetterario;
import it.epicode.w3.entities.Prestito;
import it.epicode.w3.entities.Utente;
import it.epicode.w3.utils.JpaUtils;

// Ricerca degli elementi attualmente in prestito dato un numero di tessera utente

public class PrestitoDAO {
	
	public static void save(Prestito p) {
		try {
			JpaUtils.t.begin();
			JpaUtils.em.persist(p);
			JpaUtils.t.commit();
			
			System.out.println("Prestito aggiunto correttamente!");
		} catch (Exception e) {
			System.out.println("Errore nell'aggiunta al database" + e.getMessage());
		}
		
	}
	
	
	public static void getByTessera(int tessera) {
		JpaUtils.t.begin();
		
		
		try {
			Query q = JpaUtils.em.createNamedQuery("prestitoBytessera");
			q.setParameter("nt", tessera);
			
			List<Prestito> res = q.getResultList();
			
			for(Prestito l : res) {
				System.out.println(l);
			}
			
			System.out.println("Prestito trovato correttamente!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRORE nella rimozione!");
		}
	}
	
	public static void getPrestitiScaduti() {
		JpaUtils.t.begin();
		
		
		try {
			Query q = JpaUtils.em.createNamedQuery("prestitoBytessera");
			
			List<Prestito> res = q.getResultList();
			
			for(Prestito l : res) {
				System.out.println(l);
			}
			
			System.out.println("Prestiti scaduti trovati correttamente!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRORE nella rimozione!");
		}
	}
}
