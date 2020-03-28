package uvsq.pglp_4_2;

public class Quit implements Command{

	Interpreteur interpret;
	
	public Quit(	Interpreteur interpret) {
		this.interpret = interpret;
	}

	@Override
	public void execute() {
		interpret.exit();
	}

	@Override
	public void undo(CommandFactory cf) {
		// TODO Auto-generated method stub
		
	}

}
