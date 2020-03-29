package uvsq.pglp_4_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ismail
 * class Invoker qui contient les commandes et fait appel a aux sous class de Command
 *
 */

public class CommandFactory {
	
	private ArrayList<Command> history;
	Map<String, Command> commands;
	
	public CommandFactory() {
		history = new ArrayList<>();
		commands = new HashMap<>();
	}
	
	/**
	 * @param name : le nom de la commande, Ex : "+"
	 * @param command : l'objet de la commande concraite
	 */
	public void addCommand(String name, Command command) {
		commands.put(name, command);
	}
	
	/**
	 * @param name : le nom de la commande, Ex : "+"
	 * @return : si la commande existe, retourner vraie
	 */
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
