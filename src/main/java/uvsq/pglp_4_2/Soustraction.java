package uvsq.pglp_4_2;

/**
 * 
 * @author ismail
 * class de la command concraite '-' qui dérive l'interface Command 
 *
 */
public class Soustraction implements Command{

	private MoteurRPN interpret;

	/**
	 * @param interpret
	 */
	public Soustraction(MoteurRPN interpret) {
		this.interpret = interpret;
	}

	/* (non-Javadoc)
	 * @see uvsq.pglp_4_2.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		interpret.soustraction();
	}


}
