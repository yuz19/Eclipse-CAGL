import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Tp1 extends JFrame{
	
	
	
	
	
	 public static void main(String[] args) {
		 	class BtnAction implements ActionListener{


				@Override
				public void actionPerformed(ActionEvent e) {
					//System.out.println(e.getActionCommand());
					switch(e.getActionCommand()) {
					case "BOTTON1":
						System.out.println("left");
						break;
					case "BOTTON2":
						System.out.println("middle");
						break;
					case "BOTTON3":
						System.out.println("right");
						break;
					 default:
						System.out.println("clicked!");
						
					}
				}
				 
			 }
		    JFrame frame = new JFrame("Question 1"); // Le titre de la fenetre 
		    frame.setSize(500, 200);// La taille de la fenetre 
		    frame.setLocation(10,40);

		    Container C =frame.getContentPane();
		    Container CN =new Container();
		    
		    C.setLayout(new BorderLayout());
		    //CN.setLayout(new GridLayout(3,1));
		    CN.setLayout(new FlowLayout());
		    JButton botton = new JButton("BOTTON1");
		    CN.add(botton);
		    
		    JButton botton2 = new JButton("BOTTON2");
		    CN.add(botton2);
		    
		    JButton botton3 = new JButton("BOTTON3");
		    CN.add(botton3);
		    
		    C.add(CN,BorderLayout.NORTH);
		    
		    BtnAction btnA=new BtnAction();
		    
		    botton.addActionListener(btnA);
		    botton2.addActionListener(btnA);
		    botton3.addActionListener(btnA);
		    
		    frame.setVisible(true);   // Rendre la fenetre visible 
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	
	 
	
}
