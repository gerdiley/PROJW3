package it.epicode.w3.dao;

import java.util.List;

import javax.persistence.Query;

import it.epicode.w3.entities.ElementoLetterario;
import it.epicode.w3.entities.Libro;
import it.epicode.w3.utils.JpaUtils;

public class ElementoLetterarioDAO {
//	---------------------AGGIUNTA ELEMENTO-------------------
	public static void save(ElementoLetterario el) {
		try {
			JpaUtils.t.begin();
			JpaUtils.em.persist(el);
			JpaUtils.t.commit();
			
			System.out.println("ELemento aggiunto correttamente!");
		} catch (Exception e) {
			System.out.println("Errore nell'aggiunta al database" + e.getMessage());
		}
		
	}
	
//	---------------------RIMOZIONE ELEMENTO BY ISBN-------------------
	
	public static void removeByIsbn(String isbn) {
		JpaUtils.t.begin();


        try {
            Query q = JpaUtils.em.createNamedQuery("removeByIsbn");
            q.setParameter("n", isbn);
            int delete = q.executeUpdate();
            JpaUtils.em.getTransaction();
            JpaUtils.t.commit();

            System.out.println("Elemento rimosso correttamente!");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERRORE nella rimozione!");
		}
	}
	
//	---------------------RICERCA ELEMENTO BY ISBN-------------------
	
	public static void getByIsbn(String isbn) {
		JpaUtils.t.begin();
		
		
		try {
			Query q = JpaUtils.em.createNamedQuery("getByIsbn");
			q.setParameter("n", isbn);
			
			List<ElementoLetterario> res = q.getResultList();
			
			for(ElementoLetterario l : res) {
				System.out.println(l);
			}
			
			System.out.println("Libro trovato correttamente!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRORE nella rimozione!");
		}
	}
	
//	---------------------RICERCA ELEMENTO BY ANNO-------------------
	
	public static void getByAnno(int anno) {
		JpaUtils.t.begin();
		
		
		try {
			Query q = JpaUtils.em.createNamedQuery("getByAnno");
			q.setParameter("n", anno);
			
			List<ElementoLetterario> res = q.getResultList();
			
			for(ElementoLetterario l : res) {
				System.out.println(l);
			}
			
			
			System.out.println("Libro trovato correttamente!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRORE nella ricerca!");
		}
	}
	
	
//	---------------------RICERCA ELEMENTO BY AUTORE-------------------
	
	public static void getByAutore(String autore) {
		JpaUtils.t.begin();
		
		
		try {
			Query q = JpaUtils.em.createNamedQuery("getByAutore");
			q.setParameter("a", autore);
			
			List<Libro> res = q.getResultList();
			
			for(Libro l : res) {
				System.out.println(l);
			}
			
			
			System.out.println("Libro trovato correttamente!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRORE nella ricerca!");
		}
	}
	
//	---------------------RICERCA ELEMENTO BY AUTORE-------------------
	
	public static void getByTitolo(String titolo) {
		JpaUtils.t.begin();
		
		
		try {
			Query q = JpaUtils.em.createNamedQuery("getByTitolo");
			q.setParameter("a", "%" + titolo + "%");
			
			List<ElementoLetterario> res = q.getResultList();
			
			for(ElementoLetterario l : res) {
				System.out.println(l);
			}
			
		
			System.out.println("Libro trovato correttamente!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRORE nella ricerca!");
		}
	}
}
