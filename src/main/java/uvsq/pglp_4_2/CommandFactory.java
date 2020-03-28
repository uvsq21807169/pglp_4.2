package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*the Invoker class*/

public class CommandFactory {
	
	private Map<String, Command> history;
	Map<String, Command> commands;
	

	public CommandFactory() {
		history = new HashMap<String, Command>();
		commands = new HashMap<>();
	}
	
	public void addCommand(String name, Command command) {
		commands.put(name, command);
	}
	
	public boolean executeCommand(String name) {
		if(commands.containsKey(name)) {
			
			if(commands.get(name).getClass().getSimpleName().equals("addOperand")) {
				((addOperand)commands.get(name)).execute(Double.parseDouble(name));
			}
			else {
				if(commands.get(name).equals("undo")) {
					for(String l: history.keySet()) {
						
						try {
							
							//faut mettre hshmap avec meme nom et se enregistre comme entrée
							Double operand = Double.parseDouble(l);
							executeCommand(l);
							moteur.afficherPile();
						}
						catch(Exception ex) {
					}
				}
				else {
					commands.get(name).execute();
					history.put(name, commands.get(name));
				}
			}
						
			return true;

		}
		return false;
	}
	


}
