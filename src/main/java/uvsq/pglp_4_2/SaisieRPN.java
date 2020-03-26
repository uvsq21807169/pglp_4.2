package uvsq.pglp_4_2;

import java.util.Scanner;

/* Client */
public class SaisieRPN {
	
	Scanner sc;
	MoteurRPN moteur;
	
	public SaisieRPN() {
		
		sc = new Scanner(System.in);
		moteur = new MoteurRPN();
		
		moteur.addCommand("+", new Addition(moteur));
		moteur.addCommand("-", new Soustraction(moteur));
		moteur.addCommand("*", new Multiplication(moteur));
		moteur.addCommand("/", new Division(moteur));
		moteur.addCommand("addOperand", new addOperand(moteur));
		
		while(true) {
			Command command = getNewCommand(); 
			if (command instanceof Quit ) {
				System.out.println("Programme fini !");
				return ; 
			}
			else{
				moteur.history.add(command);
				command.apply();
			}
			moteur.showOperands();

		}
		
	}
	
	protected Command getNewCommand() { 
		
		
		while(true) {
			String line = sc.nextLine();

			if(moteur.commands.containsKey(line)) {
				return moteur.commands.get(line);
			}
			try {
				Double operand = Double.parseDouble(line);
				moteur.addOperand(operand);
				return moteur.commands.get("addOperand");			
			}
			catch(Exception ex) {
				System.out.println("Vous devez saisir un operand OU +,-,/,* OU undo OU quit !\n");
			}
		}
	}

}
