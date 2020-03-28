package uvsq.pglp_4_2;

import java.util.ArrayList;

/*the derived Receiver class */

public class MoteurRPN extends Interpreteur{
	

	public MoteurRPN(CommandFactory cf) {
		super(cf);
	}
	
	public void addition() {
		
		if(pile.size() < 2)
			return;
		
		double op1 = pile.get(pile.size()-1);
		pile.remove(pile.size()-1);
		double op2 = pile.get(pile.size()-1);
		pile.remove(pile.size()-1);
		
		pile.add(op1+op2);
		
		
	}
	public void soustraction() {
			
	}
	public void multiplication() {
		
	}
	public void division() {
		
	}
		
}
