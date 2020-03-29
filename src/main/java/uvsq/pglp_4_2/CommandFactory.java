package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*the Invoker class*/

public class CommandFactory {
	
	private ArrayList<Command> history;
	Map<String, Command> commands;
	

	public CommandFactory() {
		history = new ArrayList<Command>();
		commands = new HashMap<>();
	}
	
	public void addCommand(String name, Command command) {
		commands.put(name, command);
	}
	
	public boolean executeCommand(String name) {
		if(commands.containsKey(name)) {
			if(name.equals("undo")) {
				((Undo)commands.get(name)).execute(history);
			}
			else {
				commands.get(name).execute();
				history.add(commands.get(name));
			}			
			return true;

		}
		return false;
	}
	


}
