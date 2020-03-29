package uvsq.pglp_4_2;


/**
 * 
 * @author ismail
 * class de la command concraite d'ajout d'operande qui dérive l'interface Command 
 *
 */
public class AddOperand implements Command{

	private MoteurRPN interpret;
	public double operand;
	
	/**
	 * @param interpret
	 * @param operand : operande a enregistré pour l'ajouter a la pile 
	 */
	public AddOperand(MoteurRPN interpret, Double operand) {
		this.interpret = interpret;
		this.operand = operand;
	}

	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		interpret.ajouterOperand(operand);
	}
}
