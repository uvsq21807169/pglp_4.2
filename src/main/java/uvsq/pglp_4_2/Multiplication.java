package uvsq.pglp_4_2;

/**
 * 
 * @author ismail
 * class de la command concraite '*' qui dérive l'interface Command 
 *
 */
public class Multiplication implements Command{

	private MoteurRPN interpret;

	/**
	 * @param interpret
	 */
	public Multiplication(MoteurRPN interpret) {
		this.interpret = interpret;
	}

	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		interpret.multiplication();
	}


}
