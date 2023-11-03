package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmi.InterfaceRobot;

public class Robot extends java.rmi.server.UnicastRemoteObject implements InterfaceRobot {
	Position p;
	String direction;
	
	
	public Robot() throws Exception {
		this.p=new Position();
		this.direction="E";
	}
	
	public void avancer() throws Exception {
		if(this.direction.compareTo("E")==0) {
			this.p.setX(1);
		}else if(this.direction.compareTo("W")==0) {
			this.p.setX(-1);
		}else if(this.direction.compareTo("N")==0) {
			this.p.setY(1);
		}else if(this.direction.compareTo("S")==0) {
			this.p.setY(-1);
		}else {
			System.out.println("Command Error");
		}
	}
	public void gauche() throws Exception {
		if(this.direction=="N") {
			
			this.direction="W";
			
		}else if(this.direction=="W") {
			
			this.direction="S";
			
		}else if(this.direction=="S") {
			
			this.direction="E";
			
		}else  if(this.direction=="E") {
			
			this.direction="N";
		}
	}
	public void affichage() throws Exception {
//		System.out.println("DIRECTION:"+this.direction+" position of your Robot"+this.p.affichage());
		  this.p.affichage();
	}
	public static void main(String args[])
	{
		try
		{
			//createion object
			System.out.println("Created Object to call the methods");
			Robot p=new Robot();
			
			System.out.println("Created methods");
			//creation register pour RIM
			Registry reg=LocateRegistry.createRegistry(1099);
			reg.rebind("ReferenceRobot", p);
			
			System.out.println("Created Register");

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String toString() {
		return "P2 []";
	}
}