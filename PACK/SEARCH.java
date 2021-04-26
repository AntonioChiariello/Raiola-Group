package PACK;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;


public class SEARCH {
	
	int Cx=103;
	private JFrame frame;
	private JTextField NOMEINSERITO;
	private JTextField COGNOMEINSERITO;
	private JTextField CLUBINSERITO;
	/**
	 * @wbp.parser.entryPoint
	 */ 

	public void SEARCH() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setTitle("RICERCA");
		frame.setBounds(100, 100, 709, 490);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setJMenuBar(DRIVER.MENU(frame));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(26, 29, 71, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COGNOME");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(229, 29, 81, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CLUB");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(461, 34, 71, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		NOMEINSERITO = new JTextField();
		NOMEINSERITO.setFont(new Font("Tahoma", Font.BOLD, 10));
		NOMEINSERITO.setBackground(Color.LIGHT_GRAY);
		NOMEINSERITO.setForeground(Color.BLACK);
		NOMEINSERITO.setBounds(84, 36, 117, 25);
		frame.getContentPane().add(NOMEINSERITO);
		NOMEINSERITO.setColumns(10);
		
		COGNOMEINSERITO = new JTextField();
		COGNOMEINSERITO.setFont(new Font("Tahoma", Font.BOLD, 10));
		COGNOMEINSERITO.setBackground(Color.LIGHT_GRAY);
		COGNOMEINSERITO.setBounds(320, 36, 117, 25);
		frame.getContentPane().add(COGNOMEINSERITO);
		COGNOMEINSERITO.setColumns(10);
		
		CLUBINSERITO = new JTextField();
		CLUBINSERITO.setFont(new Font("Tahoma", Font.BOLD, 10));
		CLUBINSERITO.setBackground(Color.LIGHT_GRAY);
		CLUBINSERITO.setBounds(527, 36, 117, 25);
		frame.getContentPane().add(CLUBINSERITO);
		CLUBINSERITO.setColumns(10);
		
		frame.getContentPane().add(DRIVER.HOME(frame));
		
		JButton buttonRicerca = new JButton();
		JRootPane rootPane = frame.getRootPane(); 
		rootPane.setDefaultButton(buttonRicerca);
		buttonRicerca.setIcon(new ImageIcon("src\\img\\RICERCA.png"));
		buttonRicerca.setBounds(574, 372, 117, 51);
		frame.getContentPane().add(buttonRicerca);
		
		JLabel sfondo = new JLabel("");
		sfondo.setIcon(new ImageIcon("src\\img\\sfondo2.png"));
		sfondo.setBounds(0, 0, 705, 440);
		frame.getContentPane().add(sfondo);
		
		
		
		buttonRicerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String NOME=NOMEINSERITO.getText();
			String COGNOME=COGNOMEINSERITO.getText();
			String CLUB=CLUBINSERITO.getText();
			
			frame.getContentPane().add(CONNECTION.SEARCH(NOME, COGNOME, CLUB));
			
			}
	
});
}
}