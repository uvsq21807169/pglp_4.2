package uvsq.pglp_4_2;

public class Addition implements Command{

	private MoteurRPN interpret;

	public Addition(MoteurRPN interpret) {
		this.interpret = interpret;
	}

	@Override
	public void apply() {
		interpret.addition();
	}

	@Override
	public void undo() {
		System.out.println("undo undoun");
		interpret.undo();
	}

}
