package uvsq.pglp_4_2;

/**
 * 
 * @author ismail
 * class de la command concraite '+' qui dérive l'interface Command 
 *
 */
public class Addition implements Command{

	MoteurRPN interpret;
	
	/**
	 * @param interpret
	 */
	public Addition(MoteurRPN interpret) {
		this.interpret = interpret;
	}

	@Override
	public void execute() {
		interpret.addition();
	}


}
