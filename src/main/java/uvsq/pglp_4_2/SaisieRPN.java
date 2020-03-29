package uvsq.pglp_4_2;

import java.util.Scanner;

/**
 * 
 * @author ismail
 * Class Client
 *
 */
public class SaisieRPN {
	
	Scanner sc;
	MoteurRPN moteur;
	CommandFactory cf;

	
	/**
	 * Enregistrement de toutes les commandes
	 */
	public SaisieRPN() {
		
		sc = new Scanner(System.in);
		
		cf = new CommandFactory();
		
		moteur = new MoteurRPN();
		
		
		cf.addCommand("undo", new Undo(moteur));
		cf.addCommand("quit", new Quit(moteur));
		cf.addCommand("+", new Addition(moteur));
		cf.addCommand("-", new Soustraction(moteur));
		cf.addCommand("*", new Multiplication(moteur));
		cf.addCommand("/", new Division(moteur));
		
		/**
		 * boucle infinie pour la saisie des commandes
		 */
		while(true) {
			
			String line = sc.nextLine();
			
			try {
				Double operand = Double.parseDouble(line);
				cf.addCommand(line, new AddOperand(moteur, operand));
				cf.executeCommand(line);
				moteur.afficherPile();
			}
			catch(Exception ex) {
				if( cf.executeCommand(line)) {
					moteur.afficherPile();
				}
				else {
					System.out.println("Vous devez saisir un operand OU +,-,/,* OU undo OU quit !\n");
				}
			}
		
		}
		
	}

}
