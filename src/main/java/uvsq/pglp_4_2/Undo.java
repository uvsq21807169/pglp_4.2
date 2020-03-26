package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.Stack;

public class Undo implements Command{

	protected ArrayList<Command> history ;
	
	public Undo(ArrayList<Command> h) { 
		history = h; 
	}
	
	@Override
	public void apply() {
		((Command) history.get(history.size()-2)).undo(); 
	} 
	
	public void undo() {}
}
