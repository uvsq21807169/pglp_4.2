package uvsq.pglp_4_2;

import java.util.ArrayList;

/*the derived Receiver class */

public class MoteurRPN extends Interpreteur{
	
	public void addition() {
		
		if(moreThanTwoOp()) {
			pile.add(popLastElement()+popLastElement());
		}	
	}
	
	public void soustraction() {
		
		if(moreThanTwoOp()) {
			pile.add(popLastElement()-popLastElement());
		}	
	}
	
	public void multiplication() {
		
		if(moreThanTwoOp()) {
			pile.add(popLastElement()*popLastElement());
		}
	}
	
	public void division() {
		
		if(moreThanTwoOp()) {
			pile.add(popLastElement()/popLastElement());
		}
	}
		
}
