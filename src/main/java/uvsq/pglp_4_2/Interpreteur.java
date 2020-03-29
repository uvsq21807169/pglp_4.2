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
	
	public Interpreteur() {
		pile = new ArrayList<Double>();
	}
	
	/**
	 * Stop le programme 
	 */
	public void exit() {
		System.out.println("\nLe Programme est terminé .\n");
		System.exit(0);
	}

	/**
	 * @param history : historique des commandes
	 * si l'historique n'est pas vide, on vide la pile des operandes et on réexécute toutes 
	 * les commandes sauf la derniere
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
	 * l'afichege de la pile apres chaque commande
	 */
	public void afficherPile() {
		System.out.print("-- pile : ");
		for(double d: pile)
			System.out.print(d + " ");
		System.out.println();
	}
	
	
}
