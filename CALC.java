package PACK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CALC extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	public void CALC() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("GUADAGNI CALCIATORI");
		frame.setBounds(100, 100, 709, 490);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(DRIVER.HOME(frame));
		
		
		frame.getContentPane().add(CONNECTION.INTROITI_CALCIATORE());
		
		JLabel sfondo = new JLabel("");
		sfondo.setIcon(new ImageIcon("src\\img\\sfondo2.png"));
		sfondo.setBounds(0, 0, 705, 440);
		frame.getContentPane().add(sfondo);
		
		frame.setVisible(true);
		frame.setJMenuBar(DRIVER.MENU(frame));
	}

}
