package PACK;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DRIVER {
	public static void main(String[] args) {
		HOME frame = new HOME();
		frame.HOME();	 
		
	} 
	
	public static JMenuBar MENU(final JFrame frameprecedente) {
		frameprecedente.setVisible(true);
		JMenuBar menuBar = new JMenuBar();
		JMenu mnInfo = new JMenu("Info");
		menuBar.add(mnInfo);
		mnInfo.add(AreaRiservata(frameprecedente));
		return menuBar;
	} 
	
	public static Component HOME(final JFrame frameprecedente) {
		JButton btnHOME = new JButton();
		btnHOME.setToolTipText("Torna alla HOME");
		btnHOME.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameprecedente.setVisible(false);
				HOME frame = new HOME();
				frame.HOME();
			}
		});
		btnHOME.setIcon(new ImageIcon("src\\img\\homebutton.png"));
		btnHOME.setBounds(10, 372, 117, 51);
		return btnHOME;
	}
	
	public static Component CALC(final JFrame frameprecedente) {
		JButton btnCALC = new JButton();
		btnCALC.setToolTipText("Guadagni calciatori");
		btnCALC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameprecedente.setVisible(false);
				CALC frame = new CALC();
				frame.CALC();
			}
		});
		btnCALC.setIcon(new ImageIcon("src\\img\\calc.png"));
		btnCALC.setBounds(600, 100, 79, 56);
		return btnCALC;
	}
	
	public static Component SEARCH(final JFrame frameprecedente) {
		JButton btnSEARCH = new JButton();
		btnSEARCH.setToolTipText("Ricerca calciatori");
		btnSEARCH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameprecedente.setVisible(false);
				SEARCH JFrame = new SEARCH();
				JFrame.SEARCH();
			}
		});
		btnSEARCH.setIcon(new ImageIcon("src\\img\\search.png"));
		btnSEARCH.setBounds(600, 20, 79, 56);
		return btnSEARCH;
	}
	
	public static Component AGENTE(final JFrame frameprecedente) {
		JButton btnAG = new JButton();
		btnAG.setToolTipText("Lista agenti");
		btnAG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameprecedente.setVisible(false);
				AGENTE frame = new AGENTE();
				frame.AGENTE();
			}
		});
		btnAG.setIcon(new ImageIcon("src\\img\\agente.png"));
		btnAG.setBounds(600, 180, 79, 56);
		return btnAG;
	}	
	
	public static Component CLUB(final JFrame frameprecedente) {
		JButton btnCLUB = new JButton();
		btnCLUB.setToolTipText("Lista CLUB");
		btnCLUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameprecedente.setVisible(false);
				CLUB frame = new CLUB();
				frame.CLUB();
			}
		});
		btnCLUB.setIcon(new ImageIcon("src\\img\\club.png"));
		btnCLUB.setBounds(600, 260, 79, 56);
		return btnCLUB;
	}	
	
	public static Component SPESE(final JFrame frameprecedente) {
		JButton btnSPESE = new JButton();
		btnSPESE.setToolTipText("Spese CLUB");
		btnSPESE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameprecedente.setVisible(false);
				SPESE frame = new SPESE();
				frame.SPESE();
			}
		});
		btnSPESE.setIcon(new ImageIcon("src\\img\\SPESE.png"));
		btnSPESE.setBounds(574, 372, 117, 51);
		return btnSPESE;
	}	
	
	public static Component GUADAGNO(final JFrame frameprecedente) {
		JButton btnGUAD = new JButton();
		btnGUAD.setToolTipText("Guadagno procuratori");
		btnGUAD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
			frameprecedente.setVisible(false);
			GUADAGNO frame = new GUADAGNO();
			frame.GUADAGNO();
			}
		});
		btnGUAD.setIcon(new ImageIcon("src\\img\\GUADAGNI.png"));
		btnGUAD.setBounds(574, 372, 117, 51);
		return btnGUAD;
	}
	
	public static JMenuItem AreaRiservata(final JFrame frameprecedente) {
		frameprecedente.setVisible(true);
		JMenuItem mntmAreaRiservata = new JMenuItem("Area Riservata");
		mntmAreaRiservata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				   {
				   Login frame=new Login();
				   frameprecedente.setVisible(false);
				   frame.setSize(300,100);
				   frame.setLocationRelativeTo(null);
				   frame.setVisible(true);
				   }
				   catch(Exception e)
				   {JOptionPane.showMessageDialog(null, e.getMessage());}
				   }
		});
		return mntmAreaRiservata;
	}
	
}
