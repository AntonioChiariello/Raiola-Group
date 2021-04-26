package PACK;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
  
class Login extends JFrame implements ActionListener
 {
	
  JButton SUBMIT;
  JPanel panel;
  JLabel label1,label2;
  final JTextField  text1,text2;
  
   Login ()
   { 
	   label1 = new JLabel();
	   label1.setText("Username:");
	   text1 = new JTextField(15);
	 
	   label2 = new JLabel();
	   label2.setText("Password:");
	   text2 = new JPasswordField(15);
	  
	   SUBMIT=new JButton("LOG-IN");
	   SUBMIT.setToolTipText("Accesso area riservata");
	   JRootPane rootPane = this.getRootPane(); 
	   rootPane.setDefaultButton(SUBMIT);
	   
	   panel=new JPanel(new GridLayout(3,1));
	   panel.add(label1);
	   panel.add(text1);
	   panel.add(label2);
	   panel.add(text2);
	   panel.add(SUBMIT);
	   getContentPane().add(panel,BorderLayout.CENTER);
	   SUBMIT.addActionListener(this);
	   setTitle("Login Area Riservata");

	   }
		  public void actionPerformed(ActionEvent ae)
		   {			 
		   String value1=text1.getText();
		   String value2=text2.getText();
		   
		   String query = "SELECT * FROM LOGIN";
			{
			    try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RAIOLA GROUP", "postgres", "2004");
			            PreparedStatement pstmt = connection.prepareStatement(query);) {
			    		ResultSet rs = pstmt.executeQuery();
			        	while (rs.next()) {
			        				String c = rs.getString("utente");
			        				String n = rs.getString("password");
			        				if(value1.equals(c) && value2.equals(n)) {
			        			   		this.setVisible(false);
			        					TASKAPP tframe = new TASKAPP();
			        			   		tframe.TASKAPP();
			        				}
			        				else {
			        						JOptionPane.showMessageDialog(this,"Utente o password errati",
			        						"Error",JOptionPane.ERROR_MESSAGE);
			        				}
			        	}
			    }catch(Exception e) {
			       	e.printStackTrace();
			    }	
			}
		}
}	 
 
