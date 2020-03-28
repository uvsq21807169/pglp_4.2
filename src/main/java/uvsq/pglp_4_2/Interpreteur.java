package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*the Receiver class*/

public class Interpreteur {
	
	ArrayList<Double> pile = new ArrayList<Double>();
	CommandFactory cf;
	
	public Interpreteur(CommandFactory cf) {
		this.cf = cf;
	}
	
	public void ajouterOperand(Double op) {
		pile.add(op);
	}
	
	public void deleteLastOp(){
		pile.remove(pile.size()-1);
	}
	
	public void exit() {
		System.out.println("\nLe Programme est terminé .\n");
		System.exit(0);
	}

	public void precedent() {
		System.out.println("Supression de la derniere commande ... \n");
		
	}
	
	public void afficherPile() {
		System.out.print("-- pile : ");
		for(double d: pile)
			System.out.print(d + " ");
		System.out.println();
	}
	
	
}
