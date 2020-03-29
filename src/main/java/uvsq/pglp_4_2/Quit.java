package uvsq.pglp_4_2;

/**
 * 
 * @author ismail
 * class de la command concraite 'quit' qui dérive l'interface Command 
 *
 */
public class Quit implements Command{

	Interpreteur interpret;
	
	/**
	 * @param interpret
	 */
	public Quit(Interpreteur interpret) {
		this.interpret = interpret;
	}

	/* (non-Javadoc)
	 * @see uvsq.pglp_4_2.Command#execute()
	 */
	@Override
	public void execute() {
		interpret.exit();
	}

}
