package uvsq.pglp_4_2;

public class addOperand implements Command{

	private Interpreteur interpret;

	public addOperand(Interpreteur interpret) {
		this.interpret = interpret;
	}

	@Override
	public void apply() {
		// TODO Auto-generated method stub
		System.out.println("add op");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
