package uvsq.pglp_4_2;

public class Addition implements Command{

	MoteurRPN interpret;
	
	public Addition(Interpreteur interpret) {
		this.interpret = (MoteurRPN)interpret;
	}

	@Override
	public void execute() {
		interpret.addition();
	}

	@Override
	public void undo(CommandFactory cf) {
	}

}
