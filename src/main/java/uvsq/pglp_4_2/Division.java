package uvsq.pglp_4_2;

public class Division implements Command{

	private MoteurRPN interpret;

	
	public Division(MoteurRPN interpret) {
		this.interpret = interpret;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		interpret.division();
	}


}
