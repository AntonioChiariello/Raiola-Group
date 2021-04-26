package PACK;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AGENTE extends JFrame {


	private JPanel contentPane;
	private JFrame frame;

	public void AGENTE() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("AGENTI");
		frame.setBounds(100, 100, 709, 490);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setJMenuBar(DRIVER.MENU(frame));
		frame.getContentPane().add(DRIVER.HOME(frame));
		frame.getContentPane().add(DRIVER.GUADAGNO(frame));
		
			frame.getContentPane().add(CONNECTION.AGENTE());
			
			JLabel sfondo = new JLabel("");
			sfondo.setIcon(new ImageIcon("src\\img\\sfondo2.png"));
			sfondo.setBounds(0, 0, 705, 440);
			frame.getContentPane().add(sfondo);
			
			frame.setVisible(true);
			
		 }
	}

