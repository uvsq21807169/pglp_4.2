package uvsq.pglp_4_2;

public class addOperand implements Command{

	private Interpreteur interpret;

	public addOperand(Interpreteur interpret) {
		this.interpret = interpret;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
	}
	
	public void execute(Double op) {
		// TODO Auto-generated method stub
		interpret.ajouterOperand(op);
	}

	@Override
	public void undo(CommandFactory cf) {
		// TODO Auto-generated method stub	
		interpret.deleteLastOp();
	}
}
