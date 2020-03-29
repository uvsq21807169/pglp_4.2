package uvsq.pglp_4_2;

public class Multiplication implements Command{

	private MoteurRPN interpret;

	public Multiplication(MoteurRPN interpret) {
		this.interpret = interpret;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		interpret.multiplication();
	}


}
