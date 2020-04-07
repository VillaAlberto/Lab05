package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class DizionarioDAO {
	
	public Set<String> AnagrammiCorretti(Set<String> ls)
	{
		final String sql= "SELECT * FROM parola WHERE nome=?";
		Set<String> risultato= new HashSet<String>();
		
		for(String anagramma:ls) {
			try {
				Connection conn= ConnectDB.getConnection();
				PreparedStatement st= conn.prepareStatement(sql);
				st.setString(1, anagramma);
				ResultSet rs= st.executeQuery();
				
				if (rs.next())
				{
					risultato.add(anagramma);
				}
				conn.close();
			}
			
			catch (SQLException e){
				throw new RuntimeException("Errore Db", e);
			}
			
		}
		
		return risultato;
	}

}
