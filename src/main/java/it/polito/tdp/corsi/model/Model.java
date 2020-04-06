package it.polito.tdp.corsi.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	private CorsoDAO dao;
	
	public Model() {
		dao = new CorsoDAO();
	}
	
	public List<Corso> getCorsiByPeriodo(Integer pd) {
		return dao.getCorsiByPeriodo(pd);
	}
	
	public Map<Corso, Integer> getIscrittiByPeriodo(Integer pd) {
		return dao.getIscrittiByPeriodo(pd);
	}
	
	public List<Studente> getStudentiByCorso(Corso corso) {
		return dao.getStudentiByCorso(corso);
	}
	
	public boolean esisteCorso(String codins) {
		return dao.esisteCorso(codins);
	}
	
	// metodo per dividere gli studenti in base al CDS elaborando i dati che avevo e creando una HashMap 
	// SOLUZIONE MIGLIORE E' ALTRA, FAR FARE TUTTO AL DB, CREANDO UNA NUOVA QUERY!!!
//	public Map<String, Integer> getDivisioneCS(Corso c) {
//		List<Studente> studenti = dao.getStudentiByCorso(c);
//		
//		Map<String, Integer> statistiche = new HashMap<String, Integer>();
//		
//		for(Studente s : studenti) {
//			
//			if(s.getCDS() != null && !s.getCDS().equals("")) {
//				if(statistiche.containsKey(s.getCDS())) {
//					statistiche.put(s.getCDS(), statistiche.get(s.getCDS()) +1);
//				} else {
//					statistiche.put(s.getCDS(), 1);
//				}
//			}
//		}
//		
//		return statistiche;
//	}
	
	public Map<String, Integer> getDivisioneCDS(Corso c) {
		return dao.getDivisioneCDS(c);
	}
}
