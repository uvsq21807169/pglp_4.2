package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * @author ismail
 * class de la command concraite 'undo' qui dérive l'interface Command 
 *
 */
public class Undo implements Command{
	
	
	Interpreteur interpret;
	
	/**
	 * @param interpret
	 */
	public Undo(Interpreteur interpret) { 
		this.interpret = interpret;
	}
	
	@Override
	public void execute() {} 
	
	/**
	 * @param history : historique des commandes
	 */
	public void execute(ArrayList<Command> history) {
		interpret.precedent(history);
	} 
	
}
