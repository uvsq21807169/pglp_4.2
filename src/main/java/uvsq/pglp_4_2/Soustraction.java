package uvsq.pglp_4_2;

public class Soustraction implements Command{

	private MoteurRPN interpret;

	public Soustraction(MoteurRPN interpret) {
		this.interpret = interpret;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		interpret.soustraction();
	}


}
