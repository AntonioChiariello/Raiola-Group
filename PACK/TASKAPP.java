package PACK;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TASKAPP {

	private JFrame frame;
	private JTextField textFieldNome;
	private JTextField textFieldCognome;
	private JTextField textFieldDATADINACITA;
	private JTextField textFieldCODCARTELLINO;
	private JTextField textFieldNAZIONALITA;
	private JTextField textFieldSTIPENDIO;
	private JTextField textFieldRETRIBUZIONE;
	private JTextField textFieldPresNaz;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void TASKAPP() {

		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Area riservata");
		frame.setBounds(100, 100, 621, 454);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		JButton buttonHome = new JButton();
		buttonHome.setIcon(new ImageIcon("src\\img\\HOMETA.png"));
		buttonHome.setBounds(21, 357, 194, 53);
		frame.getContentPane().add(buttonHome);
		
		buttonHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				HOME JFrame = new HOME();
				JFrame.HOME();
			}
		});
		
		JButton btnUpdate = new JButton();
		btnUpdate.setToolTipText("Inserimento dati database");
		btnUpdate.setIcon(new ImageIcon("src\\img\\UPDATE.png"));
		btnUpdate.setBounds(404, 357, 194, 53);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnUpdate);
		
		JLabel lblNewLabel = new JLabel("NOME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(21, 25, 84, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(218, 25, 283, 22);
		frame.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblCognome = new JLabel("COGNOME");
		lblCognome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCognome.setBounds(21, 55, 84, 20);
		frame.getContentPane().add(lblCognome);
		
		textFieldCognome = new JTextField();
		textFieldCognome.setBounds(218, 53, 283, 19);
		frame.getContentPane().add(textFieldCognome);
		textFieldCognome.setColumns(10);
		
		JLabel lblNascita = new JLabel("ETA'");
		lblNascita.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNascita.setBounds(21, 85, 84, 20);
		frame.getContentPane().add(lblNascita);
		
		textFieldDATADINACITA = new JTextField();
		textFieldDATADINACITA.setBounds(218, 86, 283, 19);
		frame.getContentPane().add(textFieldDATADINACITA);
		textFieldDATADINACITA.setColumns(10);
		
		JLabel lblCodCartellino = new JLabel("COD. CARTELLINO");
		lblCodCartellino.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCodCartellino.setBounds(21, 177, 151, 20);
		frame.getContentPane().add(lblCodCartellino);
		
		textFieldCODCARTELLINO = new JTextField();
		textFieldCODCARTELLINO.setBounds(218, 179, 283, 19);
		frame.getContentPane().add(textFieldCODCARTELLINO);
		textFieldCODCARTELLINO.setColumns(10);
		
		JLabel lblNazionalita = new JLabel("NAZIONALITA'");
		lblNazionalita.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNazionalita.setBounds(21, 115, 125, 20);
		frame.getContentPane().add(lblNazionalita);
		
		textFieldNAZIONALITA = new JTextField();
		textFieldNAZIONALITA.setBounds(218, 117, 283, 19);
		frame.getContentPane().add(textFieldNAZIONALITA);
		textFieldNAZIONALITA.setColumns(10);
		
		JLabel lblClub = new JLabel("CLUB");
		lblClub.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClub.setBounds(21, 207, 84, 20);
		frame.getContentPane().add(lblClub);
		
		JLabel lblStipendio = new JLabel("STIPENDIO");
		lblStipendio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStipendio.setBounds(21, 237, 107, 20);
		frame.getContentPane().add(lblStipendio);
		
		textFieldSTIPENDIO = new JTextField();
		textFieldSTIPENDIO.setBounds(218, 239, 283, 19);
		frame.getContentPane().add(textFieldSTIPENDIO);
		textFieldSTIPENDIO.setColumns(10);
		
		JLabel lblSponsor = new JLabel("SPONSOR");
		lblSponsor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSponsor.setBounds(21, 267, 84, 20);
		frame.getContentPane().add(lblSponsor);
		
		JLabel lblRetribuzione = new JLabel("RETRIBUZIONE");
		lblRetribuzione.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRetribuzione.setBounds(21, 297, 125, 20);
		frame.getContentPane().add(lblRetribuzione);
		
		textFieldRETRIBUZIONE = new JTextField();
		textFieldRETRIBUZIONE.setBounds(218, 298, 283, 19);
		frame.getContentPane().add(textFieldRETRIBUZIONE);
		textFieldRETRIBUZIONE.setColumns(10);
		
		textFieldPresNaz = new JTextField();
		textFieldPresNaz.setColumns(10);
		textFieldPresNaz.setBounds(218, 148, 283, 19);
		frame.getContentPane().add(textFieldPresNaz);
		
		JLabel lblPresNaz = new JLabel("PRESENZE NAZIONALE");
		lblPresNaz.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPresNaz.setBounds(21, 145, 204, 20);
		frame.getContentPane().add(lblPresNaz);
		
		JLabel lblAgente = new JLabel("AGENTE");
		lblAgente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAgente.setBounds(21, 327, 125, 20);
		frame.getContentPane().add(lblAgente);
		
		String[] Club = {"Atalanta", "Bologna", "Fiorentina", "Inter", "Juventus", "Lazio", "Milan", "Napoli", "Roma"};
		final JComboBox comboBoxClub = new JComboBox(Club);
		comboBoxClub.setBounds(218, 209, 283, 19);
		frame.getContentPane().add(comboBoxClub);
		
		String[] Agenti = {"Raiola", "Piscane", "Lucci", "Jay-Z", "Mendes", "Barnet", "Berti", "Bozzo"};
		final JComboBox comboBoxAg = new JComboBox(Agenti);
		comboBoxAg.setBounds(218, 327, 283, 21);
		frame.getContentPane().add(comboBoxAg);
		
		String[] Sponsor = {"Adidas", "Nike", "Puma", "Kappa", "NewBalance"}; 
		final JComboBox comboBoxSponsor = new JComboBox(Sponsor);
		comboBoxSponsor.setBounds(218, 268, 283, 21);
		frame.getContentPane().add(comboBoxSponsor);
		
		JLabel sfondo = new JLabel("");
		sfondo.setIcon(new ImageIcon("src\\img\\SONDO1.jpg"));
		sfondo.setBounds(0, 0, 612, 417);
		frame.getContentPane().add(sfondo);
	
		
		
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   String nome=textFieldNome.getText();
				   String cognome=textFieldCognome.getText();
				   String Data=textFieldDATADINACITA.getText();
				   String cartellino=textFieldCODCARTELLINO.getText();
				   String presnaz=textFieldPresNaz.getText();
				   String naz=textFieldNAZIONALITA.getText();
				   String club=(String)comboBoxClub.getSelectedItem();
				   String stip=textFieldSTIPENDIO.getText();
				   String sponsor=(String)comboBoxSponsor.getSelectedItem();
				   String retr=textFieldRETRIBUZIONE.getText();
				   String Ag=(String)comboBoxAg.getSelectedItem();
				   String nomeAg = null;
				   String codproc = null;
				   int percentualeAg = 0;
				   
				   if(nome.equals("")) {
					   JOptionPane.showMessageDialog(frame,"I valori inseriti sono errati!",
						"Error",JOptionPane.ERROR_MESSAGE);
			       }else {
				   
				   if(Ag.equals("Raiola")) {
					   nomeAg = "Mino";
					   codproc = "MR001";
					   percentualeAg = 15;
				   }
				   if(Ag.equals("Piscane")) {
					   nomeAg = "Vincenzo";
					   codproc = "VP002";
					   percentualeAg = 3;
				   }
				   if(Ag.equals("Lucci")) {
					   nomeAg = "Alessandro";
					   codproc = "AL003";
					   percentualeAg = 4;
				   }
				   if(Ag.equals("Jay-Z")) {
					   nomeAg = "Shawn Corey Carter";
					   codproc = "JZ004";
					   percentualeAg = 8;
				   }
				   if(Ag.equals("Mendes")) {
					   nomeAg = "Jorge";
					   codproc = "JM005";
					   percentualeAg = 12;
				   }
				   if(Ag.equals("Barnet")) {
					   nomeAg = "Jonathan";
					   codproc = "JB006";
					   percentualeAg = 9;
				   }
				   if(Ag.equals("Berti")) {
					   nomeAg = "Sergio";
					   codproc = "SB007";
					   percentualeAg = 4;
				   }
				   if(Ag.equals("Bozzo")) {
					   nomeAg = "Giuseppe";
					   codproc = "GB008";
					   percentualeAg = 10;
				   }
				   String query="INSERT INTO calciatore(nome, cognome, eta, nazionalita, codcartellino) "
				   		+ "VALUES (?, ?, ?, ?, ?);"
						   
				   		+ "INSERT INTO rosa( nomeclub, codcalc, valutazione)"
				   		+ "VALUES (?, ?, ?);"
				   		
				   		+ "INSERT INTO contratti(codcart, codclub, sponsorname, stipendio, retribuzionespo)"
				   		+ "VALUES (?, ?, ?, ?, ?);"
				   		
				   		+ "INSERT INTO nazionale(nazionalenome, calciatori, presenze)"
				   		+ "VALUES (?, ?, ?);"
				   		
				   		+ "INSERT INTO procuratore(nomep, cognomep, codproc, cartellinocalc, percentuale)"
				   		+ "VALUES (?, ?, ?, ?, ?);"
				   		
				   		+ "INSERT INTO sponsor(nomespo, testimonial)"
				   		+ "VALUES (?, ?)";
				   {
				   try 
					   (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RAIOLA GROUP", "postgres", "2004");
						   PreparedStatement pstmt = connection.prepareStatement(query);) {
				        pstmt.setString(1, nome);	
				        pstmt.setString(2, cognome);	
				        pstmt.setString(3, Data);
				        pstmt.setString(4, naz);
				        pstmt.setString(5, cartellino);
				        pstmt.setString(6, club);
				        pstmt.setString(7, cartellino);
				        pstmt.setString(8, stip);
				        pstmt.setString(9, cartellino);
				        pstmt.setString(10, club);
				        pstmt.setString(11, sponsor);
				        pstmt.setString(12, stip);
				        pstmt.setString(13, retr);
				        pstmt.setString(14, naz);
				        pstmt.setString(15, cartellino);
				        pstmt.setString(16, presnaz);
				        pstmt.setString(17, nomeAg);
				        pstmt.setString(18, Ag);
				        pstmt.setString(19, codproc);
				        pstmt.setString(20, cartellino);
				        pstmt.setInt(21, percentualeAg);
				        pstmt.setString(22, sponsor);
				        pstmt.setString(23, cartellino);
				        
				        pstmt.executeUpdate();
				        
				      
				        JOptionPane.showMessageDialog(frame, "I valori sono stati inseriti correttamente.");
				        frame.setVisible(false);
				        TASKAPP frame = new TASKAPP();
				 	   	frame.TASKAPP();
				   		}
				     catch(Exception e) {
				    	JOptionPane.showMessageDialog(frame,"I valori inseriti sono errati!",
						"Error",JOptionPane.ERROR_MESSAGE);
				       	e.printStackTrace();
				    }
				   }	
			}}		
		});
		}	
}