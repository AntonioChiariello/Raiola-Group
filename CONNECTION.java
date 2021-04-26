package PACK;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CONNECTION {

	
	
public static Component HOME() {
	String nomicolonne[]= {"Nome","Cognome","Club"};
	Object rowData[][] = {{"Row1-Column1", "Row1-Column2", "Row1-Column3"}};
	DefaultTableModel NewsT = new DefaultTableModel(rowData, nomicolonne)
	  {
	    public boolean isCellEditable(int row, int column)
	    {
	      return false;
	    }
	  };
	JTable News = new JTable(NewsT);
	NewsT.removeRow(0);
	 String query = "SELECT nome, nomeclub, cognome FROM CALCIATORE, ROSA \r\n"
	 		 + "WHERE CODCARTELLINO=CODCALC  \r\n"
			 +"ORDER BY nomeclub, nome ASC;";
{
	    try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RAIOLA GROUP", "postgres", "2004");
	            PreparedStatement pstmt = connection.prepareStatement(query);) {
	    		ResultSet rs = pstmt.executeQuery();
	        	while (rs.next()) {
	        				String c = rs.getString("nome");
	        				String n = rs.getString("cognome");
	        				String s = rs.getString("nomeclub");
        		NewsT.addRow(new Object[] {c, n, s});
	        	}
	    } catch(Exception e) {
	       	e.printStackTrace();
	    }
	    JScrollPane scrollPane = new JScrollPane(News);
		scrollPane.setBounds(14, 14, 550, 350);
		return scrollPane;		
	}
	};
	
public static Component INTROITI_CALCIATORE() {
	String nomicolonne[]= {"Nome","Cognome","Club", "Incasso Club", "Nazionale", "Presenze Naz.","Sponsor", "Incasso Sponsor", "Guadagno totale annuo"};
	Object rowData[][] = {{"Row1-Column1", "Row1-Column2", "Row1-Column3", "Row1-Column4", "Row1-Column5", "Row1-Column6", "Row1-Column7", "Row1-Column8", "Row1-Column9"}};
	DefaultTableModel NewsT = new DefaultTableModel(rowData, nomicolonne)
	  {
	    public boolean isCellEditable(int row, int column)
	    {
	      return false;
	    }
	  };
	JTable News = new JTable(NewsT);
	NewsT.removeRow(0);
	 String query = "SELECT nome, cognome, nomeclub, stipendio, retribuzionespo, nomespo, percentuale, nazionalenome, presenze FROM CALCIATORE, ROSA, CONTRATTI, PROCURATORE, SPONSOR, NAZIONALE \r\n"
	 		 + "WHERE CODCARTELLINO=CODCART AND CODCART = CARTELLINOCALC AND CODCARTELLINO = CODCALC AND CODCARTELLINO = TESTIMONIAL AND CODCARTELLINO = CALCIATORI\r\n"
			 +"ORDER BY  nome ASC;";
{
	    try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RAIOLA GROUP", "postgres", "2004");
	            PreparedStatement pstmt = connection.prepareStatement(query);) {
	    		ResultSet rs = pstmt.executeQuery();
	        	while (rs.next()) {
	        				String a = rs.getString("nome");
	        				String b = rs.getString("cognome");
	        				String c = rs.getString("stipendio");
	        				String d = rs.getString("retribuzionespo");
	        				String e = rs.getString("percentuale");
	        				String f = rs.getString("nomeclub");
	        				String g = rs.getString("nomespo");
	        				String h = rs.getString("nazionalenome");
	        				String i = rs.getString("presenze");
	        				
	        				int n1 = Integer.parseInt(c);
        					int n2 = Integer.parseInt(d);
        					int n3 = Integer.parseInt(e);
        					int r = ((n1+n2)*1000000)-((((n1+n2)*1000000)*n3)/100);
        					Integer.toString(r);

	        				
        		NewsT.addRow(new Object[] {a, b, f, c, h, i, g, d, r});
	        	}
	    } catch(Exception e) {
	       	e.printStackTrace();
	    }
	    JScrollPane scrollPane = new JScrollPane(News);
		scrollPane.setBounds(30, 30, 640, 312);
		return scrollPane;		
	}
	}

	
public static Component AGENTE() {
	String nomicolonne[]= {"Nome Procuratore","Cognome Procuratore","Percentuale", "Nome Calciatore", "Cognome Calciatore"};
	Object rowData[][] = {{"Row1-Column1", "Row1-Column2", "Row1-Column3", "Row1-Column4", "Row1-Column5"}};
	DefaultTableModel Proc = new DefaultTableModel(rowData, nomicolonne)
	  {
	    public boolean isCellEditable(int row, int column)
	    {
	      return false;
	    }
	  };
	JTable Procuratori = new JTable(Proc);
	Proc.removeRow(0);
	 String query = "SELECT nomep, cognomep, percentuale, nome, cognome FROM procuratore, calciatore \r\n"
			 +"WHERE cartellinocalc=codcartellino \r\n"
			 +"ORDER BY  nomep ASC;";
;
	 {
	    try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RAIOLA GROUP", "postgres", "2004");
	            PreparedStatement pstmt = connection.prepareStatement(query);) {
	    		ResultSet rs = pstmt.executeQuery();
	        	while (rs.next()) {
	        				String a = rs.getString("nomep");
	        				String b = rs.getString("cognomep");
	        				String c = rs.getString("percentuale");
	        				String d = rs.getString("nome");
	        				String e = rs.getString("cognome");
        		Proc.addRow(new Object[] {a, b, c, d, e});
	        	}
	    } catch(Exception e) {
	       	e.printStackTrace();
	    }
	    JScrollPane scrollPane = new JScrollPane(Procuratori);
		scrollPane.setBounds(30, 30, 640, 312);
		return scrollPane;
	 }
}

public static Component GUADAGNO() {
	int x = 0;
	String calcg = null;
	String nomicolonne[]= {"Nome Procuratore","Cognome Procuratore", "Nome Calciatore", "Cognome Calciatore", "Guadagno effettivo"};
	Object rowData[][] = {{"Row1-Column1", "Row1-Column2", "Row1-Column3", "Row1-Column4", "Row1-Column5"}};
	DefaultTableModel Proc = new DefaultTableModel(rowData, nomicolonne)
	  {
	    public boolean isCellEditable(int row, int column)
	    {
	      return false;
	    }
	  };
	JTable Procuratori = new JTable(Proc);
	
	Proc.removeRow(0);
	 String query = "SELECT nomep, cognomep, percentuale, nome, cognome, stipendio FROM procuratore, calciatore, contratti \r\n"
			 +"WHERE cartellinocalc=codcartellino AND codcartellino=codcart \r\n"
			 +"ORDER BY  nomep ASC;";
	 {
	    try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RAIOLA GROUP", "postgres", "2004");
	            PreparedStatement pstmt = connection.prepareStatement(query);) {
	    		ResultSet rs = pstmt.executeQuery();
	        	while (rs.next()) {
	        				String a = rs.getString("nomep");
	        				String b = rs.getString("cognomep");
	        				String c = rs.getString("percentuale");
	        				String d = rs.getString("nome");
	        				String e = rs.getString("cognome");
	        				String f = rs.getString("stipendio");
	        				
	        					int n1 = Integer.parseInt(f);
	        					int n2 = Integer.parseInt(c);
	        					int r=((n1*1000000)*n2)/100;
	        					
	        					if(r>x) {
	        						x=r;
	        						calcg = e;
	        					}
	        					Integer.toString(r);
	        							
        		Proc.addRow(new Object[] {a, b, d, e, r});
	        	}
	        	int row = Procuratori.getRowCount();
	        	for(int i = 0; i < row ; i++) {
	        		String controllo = (String) Procuratori.getValueAt(i, 3);
	        		
	        		if (calcg.equals(controllo)){
	        			Procuratori.setRowSelectionInterval(i, i);
						Procuratori.setSelectionBackground(Color.RED);
						}
	        		if (!calcg.equals(controllo)){
	        			Procuratori.setEnabled(false);
	        		}
	        	}
	    } catch(Exception e) {
	       	e.printStackTrace();
	    }
	    JScrollPane scrollPane = new JScrollPane(Procuratori);
		scrollPane.setBounds(30, 30, 640, 312);
		return scrollPane;
}
}

public static Component SEARCH(String NOMEC, String COGNOMEC, String CLUBC) {
	
	String NOME = NOMEC;
	String COGNOME = COGNOMEC;
	String CLUB = CLUBC;
	String nomicolonne[]= {"Nome","Cognome","Club","Stipendio"};
	Object rowData[][] = {{"Row1-Column1", "Row1-Column2", "Row1-Column3", "Row1-Column4"}};
	DefaultTableModel Ricerca = new DefaultTableModel(rowData, nomicolonne)
	  {
	    public boolean isCellEditable(int row, int column)
	    {
	      return false;
	    }
	  };
	JTable Ricerca1 = new JTable(Ricerca);
	Ricerca.removeRow(0);
	String query="SELECT nome, cognome, nomeclub, stipendio FROM CALCIATORE, ROSA, CONTRATTI \r\n"
	 		+ "WHERE CODCARTELLINO=CODCALC AND CODCARTELLINO=CODCART AND cognome=? AND nomeclub=? AND nome=?";
	 try 
	 (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RAIOLA GROUP", "postgres", "2004");
			 PreparedStatement pstmt = connection.prepareStatement(query);) {
		 	pstmt.setString(1, COGNOME);	
	        pstmt.setString(2, CLUB);
	        pstmt.setString(3, NOME);
	        ResultSet rs = pstmt.executeQuery();
	        String n = null;
	        String c = null;
	        String nc = null;
	        String s = null;
	        int n1 = 0;
	        while (rs.next()) {
	        	 n = rs.getString("nome");
				 c = rs.getString("cognome");
				 nc = rs.getString("nomeclub");
				 s = rs.getString("stipendio");
				
				n1 = Integer.parseInt(s);
				n1 = n1 * 1000000;
				Integer.toString(n1);
			
	        }	if (NOME.equals(n) && COGNOME.equals(c) && CLUB.equals(nc)) 
				{
					Ricerca.addRow(new Object[] {n, c, nc, n1});			
				} 
				else {
					    JOptionPane.showMessageDialog(null,"Inserisci i valori corretti o controlla se presenti",
					   "Error",JOptionPane.ERROR_MESSAGE);
					    
				}	
	 } catch(Exception e) {
		 e.printStackTrace();
	 }
	 JScrollPane scrollPane = new JScrollPane(Ricerca1);
	 scrollPane.setBounds(30, 120, 600, 230);
	 return scrollPane;
}
	
public static Component CLUB() {
	String nomicolonne[]= {"Nome Club","Presidente","Stadio"};
	Object rowData[][] = {{"Row1-Column1", "Row1-Column2", "Row1-Column3"}};
	DefaultTableModel NewsT = new DefaultTableModel(rowData, nomicolonne)
	  {
	    public boolean isCellEditable(int row, int column)
	    {
	      return false;
	    }
	  };
	JTable News = new JTable(NewsT);
	NewsT.removeRow(0);
	 String query = "SELECT * FROM CLUB ORDER BY nomeclub ASC";
{
	    try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RAIOLA GROUP", "postgres", "2004");
	            PreparedStatement pstmt = connection.prepareStatement(query);) {
	    		ResultSet rs = pstmt.executeQuery();
	        	while (rs.next()) {
	        				String c = rs.getString("nomeclub");
	        				String n = rs.getString("presidente");
	        				String s = rs.getString("stadio");
        		NewsT.addRow(new Object[] {c, n, s});
	        	}
	    } catch(Exception e) {
	       	e.printStackTrace();
	    }
	    JScrollPane scrollPane = new JScrollPane(News);
		scrollPane.setBounds(30, 30, 640, 312);
		return scrollPane;		
	}
	};

	public static Component SPESE() {
		int x = 0;
		int rf = 0;
		int j = 0;
		boolean contr = false;
		String temp = null;
		String clubsp = null;
		String nomicolonne[]= {"Nome Club","Proprietario", "Cognome Procuratore", "Spesa effettiva"};
		Object rowData[][] = {{"Row1-Column1", "Row1-Column2", "Row1-Column3", "Row1-Column4"}};
		DefaultTableModel Club = new DefaultTableModel(rowData, nomicolonne)
		  {
		    public boolean isCellEditable(int row, int column)
		    {
		      return false;
		    } 
		  };
		JTable ClubSpese = new JTable(Club);
		
		Club.removeRow(0);
		 String query = "SELECT NOMECLUB, PRESIDENTE, COGNOMEP, PERCENTUALE, CODCART, STIPENDIO FROM CLUB, PROCURATORE, CONTRATTI \r\n"
				 +"WHERE nomeclub = codclub AND codcart = cartellinocalc \r\n"
				 +"ORDER BY nomeclub ASC;";
		 {
		    try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RAIOLA GROUP", "postgres", "2004");
		            PreparedStatement pstmt = connection.prepareStatement(query);) {
		    		ResultSet rs = pstmt.executeQuery();
		        	while (rs.next()) {
		        				String a = rs.getString("nomeclub");
		        				String b = rs.getString("presidente");
		        				String c = rs.getString("percentuale");
		        				String d = rs.getString("cognomep");
		        				String e = rs.getString("codcart");
		        				String f = rs.getString("stipendio");
		        				
		        					int n1 = Integer.parseInt(f);
		        					int n2 = Integer.parseInt(c);
		        					int r=((n1*1000000)*n2)/100;
		        					
		        					
		        					if(a.equals(temp)) {
		        						rf = rf + r;
		        					}
		        					else {
		        						rf=r;
		        						temp = a;
		        					}
		        					if(rf>x) {
		        						x=rf;
		        						clubsp = a;
		        					}
		        					Integer.toString(r);
		        							
	        		Club.addRow(new Object[] {a, b, d, r});
		        	}
		        	int row = ClubSpese.getRowCount();
		        	boolean found = false;
		        	
		        	for(int i = 0; i < row ; i++) {
		        		String controllo = (String) ClubSpese.getValueAt(i, 0);
		        		
		        		if (clubsp.equals(controllo)){
		        			if(found == false) {
		        				j = i;
		        				found = true;
		        			}
		        			ClubSpese.setRowSelectionInterval(i, j);
		        			ClubSpese.setSelectionBackground(Color.RED);
							}
		        		ClubSpese.setEnabled(false);
		        	}
		    } catch(Exception e) {
		       	e.printStackTrace();
		    }
		    JScrollPane scrollPane = new JScrollPane(ClubSpese);
			scrollPane.setBounds(30, 30, 640, 312);
			return scrollPane;
	}
	}

}

