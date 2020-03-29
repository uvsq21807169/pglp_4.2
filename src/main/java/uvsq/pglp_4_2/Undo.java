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
	/* (non-Javadoc)
	 * @see uvsq.pglp_4_2.Command#execute()
	 */
	@Override
	public void execute() {} 
	
	/**
	 * @param history
	 */
	public void execute(ArrayList<Command> history) {
		interpret.precedent(history);
	} 
	
}
