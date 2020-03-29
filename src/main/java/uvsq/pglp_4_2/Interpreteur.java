package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
 * @author ismail
 * The receiver class
 * class générique qui contient l'inplmentation des deux commandes UNDO et QUIT
 */
public class Interpreteur {
	
	ArrayList<Double> pile;
	
	/**
	 * 
	 */
	public Interpreteur() {
		pile = new ArrayList<Double>();
	}
	
	/**
	 * 
	 */
	public void exit() {
		System.out.println("\nLe Programme est terminé .\n");
		System.exit(0);
	}

	/**
	 * @param history
	 */
	public void precedent(ArrayList<Command> history) {
		if(history.size() == 0)
			return;
		System.out.println("Supression de la derniere commande ... \n");
		pile.clear();
		history.remove(history.size()-1);
		for(Command com: history) {
			com.execute();
		}		
	}
	
	/**
	 * 
	 */
	public void afficherPile() {
		System.out.print("-- pile : ");
		for(double d: pile)
			System.out.print(d + " ");
		System.out.println();
	}
	
	
}
