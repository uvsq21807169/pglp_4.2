package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Interpreteur {
	
	ArrayList<Command> history = new ArrayList<>(); 
	
	Map<String, Command> commands;
	
	Command undo;
	Command quit;
	
	public Interpreteur() {
		
		commands = new HashMap<>();
		commands.put("undo", new Undo(history));
		commands.put("quit", new Quit());

	}
	
	public void addCommand(String name, Command command) {
		commands.put(name, command);
	}
	
	public void executeCommand(String name) {
		if(commands.containsKey(name)) {
			commands.get(name).apply();
		}
	}
	
}
