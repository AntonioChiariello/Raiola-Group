package PACK;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HOME extends JFrame{
	public HOME() {
	}


	private JFrame frame; 
	private JTable NewsTable;
	private Object[][] data;

	
	
	public void HOME()  {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 709, 438);
		frame.setLocationRelativeTo(null);
		frame.setTitle("RAIOLA GROUP");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.setJMenuBar(DRIVER.MENU(frame));
		
		frame.getContentPane().add(DRIVER.SEARCH(frame));
		frame.getContentPane().add(DRIVER.AGENTE(frame));
		frame.getContentPane().add(DRIVER.CALC(frame));
		frame.getContentPane().add(DRIVER.CLUB(frame));
		
			frame.getContentPane().add(CONNECTION.HOME());
			
			JLabel sfondo = new JLabel("");
			sfondo.setIcon(new ImageIcon("src\\img\\sfondo2.png"));
			sfondo.setBounds(0, 0, 705, 440);
			frame.getContentPane().add(sfondo);
			
			frame.setVisible(true);
		}
	}

