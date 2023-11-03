package rmi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;



public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//get register with local adress and port with registry
			Registry reg=LocateRegistry.getRegistry("127.0.0.1",1099);
			//locate the list of the methods stocked in the interface
			InterfaceRobot i= (InterfaceRobot) reg.lookup("ReferenceRobot");
			//methods call P1->P2
			//int x=i.add(10,5);
			//System.out.println("x="+x);
			//i.afficher("USTHB");

	        // Read user input from the console
	        BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
	        while(true) {
		        // Prompt the user to enter the desired robot
		        System.out.println("Enter the robot you want:");
		        Scanner sc = new Scanner(System.in);
		        String s=(String)sc.next();
		        System.out.println("robotChoice:"+s);

		        
		        if (s.equals("avancer")) {
	                i.avancer();
	                System.out.println("Robot moving forward.");
	            } else if (s.equals("gauche")) {
	                i.gauche();
	                System.out.println("Robot turning left.");
	            }else if (s.equals("afficher")) {
	                i.affichage();
	                System.out.println("Affichage est terminer");
	            }
			 	
	        }

			
			

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
}
}
