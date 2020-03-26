package uvsq.pglp_4_2;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
	
	private final Map<CommandEnum, Command> commands;

	public CommandFactory() {
		commands = new HashMap<CommandEnum, Command>();
	}
	
	public void addCommand(CommandEnum name, Command command) {
		commands.put(name, command);
	}
	
	public void executeCommand(CommandEnum name) {
		if(commands.containsKey(name)) {
			commands.get(name).apply();
		}
	}
	
	public static CommandFactory init() {
		CommandFactory cf = new CommandFactory();		
		return cf;
	}

}
