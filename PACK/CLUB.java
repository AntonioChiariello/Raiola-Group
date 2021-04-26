package PACK;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CLUB extends JFrame {
	private JPanel contentPane;
	private JFrame frame;

	public void CLUB() {
		frame = new JFrame();
		frame.setJMenuBar(DRIVER.MENU(frame));
		frame.setResizable(false);
		frame.setTitle("CLUB");
		frame.setBounds(100, 100, 709, 490);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(DRIVER.HOME(frame));		
		frame.getContentPane().add(DRIVER.SPESE(frame));		
		
			frame.getContentPane().add(CONNECTION.CLUB());
			
			JLabel sfondo = new JLabel("");
			sfondo.setIcon(new ImageIcon("src\\img\\sfondo2.png"));
			sfondo.setBounds(0, 0, 705, 440);
			frame.getContentPane().add(sfondo);
			
			frame.setVisible(true);
		 }
	}

