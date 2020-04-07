package it.polito.tdp.anagrammi.model;

import java.util.Set;

public class TestRicerca {

	public static void main(String[] args) {
		
		Ricerca r= new Ricerca();
		String s="cocco";
		Set <String> anagrammi= r.anagrammi(s);
		System.out.println("Gli anagrammi della parola "+s+" sono:\n");
		System.out.println(anagrammi);
	}

}
