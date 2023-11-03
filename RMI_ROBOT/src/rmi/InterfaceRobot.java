package rmi;

import java.rmi.Remote;

public interface InterfaceRobot extends Remote {
	void avancer() throws Exception;
	void gauche() throws Exception;
	void affichage() throws Exception;
}

