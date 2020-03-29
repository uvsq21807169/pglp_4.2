package uvsq.pglp_4_2;


/**
 * 
 * @author ismail
 * class de la command concraite d'ajout d'operande qui dérive l'interface Command 
 *
 */
public class addOperand implements Command{

	private MoteurRPN interpret;
	public double operand;
	
	/**
	 * @param interpret
	 * @param operand
	 */
	public addOperand(MoteurRPN interpret, Double operand) {
		this.interpret = interpret;
		this.operand = operand;
	}

	/* (non-Javadoc)
	 * @see uvsq.pglp_4_2.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		interpret.ajouterOperand(operand);
	}
}
