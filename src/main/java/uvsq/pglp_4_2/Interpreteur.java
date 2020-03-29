package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*the Receiver class*/

public class Interpreteur {
	
	ArrayList<Double> pile;
	
	public Interpreteur() {
		pile = new ArrayList<Double>();
	}
	
	public void ajouterOperand(Double op) {
		pile.add(op);
	}
	
	public Double popLastElement() {	
		double op = pile.get(pile.size()-1);
		pile.remove(pile.size()-1);
		return op;
	}
	
	public Boolean moreThanTwoOp() {
		if(pile.size() >= 2)
			return true;
		
		System.out.println("Pas assez d'operandes !\n");
		return false;
	}
	
	public void exit() {
		System.out.println("\nLe Programme est terminé .\n");
		System.exit(0);
	}

	public void precedent(ArrayList<Command> history) {
		System.out.println("Supression de la derniere commande ... \n");
		pile.clear();
		history.remove(history.size()-1);
		for(Command com: history) {
			com.execute();
		}		
	}
	
	public void afficherPile() {
		System.out.print("-- pile : ");
		for(double d: pile)
			System.out.print(d + " ");
		System.out.println();
	}
	
	
}
