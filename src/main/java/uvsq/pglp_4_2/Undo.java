package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.Stack;

public class Undo implements Command{
	
	
	Interpreteur interpret;
	
	public Undo(Interpreteur interpret) { 
		this.interpret = interpret;
	}
	
	@Override
	public void execute() {
		interpret.precedent();
		//((Command) history.get(history.size()-2)).undo(); 
	} 
	
	public void undo(CommandFactory cf) {}
}
