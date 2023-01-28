package it.epicode.w3.dao;

import it.epicode.w3.entities.ElementoLetterario;
import it.epicode.w3.entities.Utente;
import it.epicode.w3.utils.JpaUtils;

public class UtenteDAO {

	public static void save(Utente u) {
		try {
			JpaUtils.t.begin();
			JpaUtils.em.persist(u);
			JpaUtils.t.commit();
			
			System.out.println("Utente aggiunto correttamente!");
		} catch (Exception e) {
			System.out.println("Errore nell'aggiunta al database" + e.getMessage());
		}
		
	}
}
