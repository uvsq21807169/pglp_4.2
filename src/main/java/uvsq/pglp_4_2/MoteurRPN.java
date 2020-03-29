package uvsq.pglp_4_2;

import java.util.ArrayList;

/**
 * 
 * @author ismail
 * The derived receiver class
 * class qui recoit les appels des commandes concraites
 *
 */

public class MoteurRPN extends Interpreteur{
	
	/**
	 * @param op : operande a ajouter
	 */
	public void ajouterOperand(Double op) {
		pile.add(op);
	}
	
	/**
	 * @return : retourn le derner element de la pile
	 */
	public Double popLastElement() {	
		double op = pile.get(pile.size()-1);
		pile.remove(pile.size()-1);
		return op;
	}
	
	/**
	 * @return : retourner vraie si la pile a plus de deux operandes
	 */
	public Boolean moreThanTwoOp() {
		if(pile.size() >= 2)
			return true;
		
		System.out.println("Pas assez d'operandes !\n");
		return false;
	}
	
	public void addition() {
		
		if(moreThanTwoOp()) {
			pile.add(popLastElement()+popLastElement());
		}	
	}
	
	public void soustraction() {
		
		if(moreThanTwoOp()) {
			double op1 = popLastElement();
			double op2= popLastElement();

			pile.add(op2-op1);
		}	
	}
	
	public void multiplication() {
		
		if(moreThanTwoOp()) {
			pile.add(popLastElement()*popLastElement());
		}
	}

	
	public void division() {
		
		if(moreThanTwoOp()) {
			double op1 = popLastElement();
			double op2= popLastElement();

			pile.add(op2/op1);	
		}
	}
	
	public ArrayList<Double> getOperands(){
		return pile;
	}
		
}
