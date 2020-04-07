package it.polito.tdp.anagrammi.model;

import java.util.Set;

import it.polito.tdp.anagrammi.DAO.DizionarioDAO;

public class Model {
	
	DizionarioDAO d= new DizionarioDAO();
	Ricerca r= new Ricerca();
	
	public Set<String> AnagrammiCorretti(String s){
		return d.AnagrammiCorretti(r.anagrammi(s));
	}

	public Set<String> AnagrammiSbagliati(String s){
		Set<String> risultato= r.anagrammi(s);
		risultato.removeAll(AnagrammiCorretti(s));
		return risultato;
	}
}
