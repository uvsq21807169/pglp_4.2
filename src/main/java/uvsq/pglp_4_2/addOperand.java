package uvsq.pglp_4_2;

public class addOperand implements Command{

	private Interpreteur interpret;
	public double operand;
	
	public addOperand(Interpreteur interpret, Double operand) {
		this.interpret = interpret;
		this.operand = operand;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		interpret.ajouterOperand(operand);
	}
}
