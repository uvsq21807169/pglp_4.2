package uvsq.pglp_4_2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.*;

import java.util.EmptyStackException;


public class AppTest  extends TestCase{

	MoteurRPN moteur;
	CommandFactory cf;
	
	@org.junit.Before
	public void testInitMoteurRPN(){
		moteur = new MoteurRPN();
		cf = new CommandFactory();
		
		cf.addCommand("undo", new Undo(moteur));
		cf.addCommand("quit", new Quit(moteur));
		cf.addCommand("+", new Addition(moteur));
		cf.addCommand("-", new Soustraction(moteur));
		cf.addCommand("*", new Multiplication(moteur));
		cf.addCommand("/", new Division(moteur));
	}
	
	
	@org.junit.Test
	public void testAjoutOperand(){
		moteur = new MoteurRPN();
		cf = new CommandFactory();
		Double operand = 2.2;
		cf.addCommand(operand.toString(), new AddOperand(moteur, operand));
		cf.executeCommand(operand.toString());		
		assertEquals(moteur.getOperands().get(0), operand);	
	}
	
	@org.junit.Test
	public void testCalculerPlus(){
		moteur = new MoteurRPN();
		cf = new CommandFactory();
		cf.addCommand("+", new Addition(moteur));	
		Double op1 = 2.0;
		Double op2 = 3.0;
		cf.addCommand(op1.toString(), new AddOperand(moteur, op1));
		cf.executeCommand(op1.toString());	
		cf.addCommand(op2.toString(), new AddOperand(moteur, op2));
		cf.executeCommand(op2.toString());	
		cf.executeCommand("+");
		assertEquals(moteur.getOperands().get(0), 5.0);	

	}
	
	@org.junit.Test
	public void testCalculerMoins(){
		moteur = new MoteurRPN();
		cf = new CommandFactory();
		cf.addCommand("-", new Soustraction(moteur));
		Double op1 = 3.0;
		Double op2 = 2.0;
		cf.addCommand(op1.toString(), new AddOperand(moteur, op1));
		cf.executeCommand(op1.toString());	
		cf.addCommand(op2.toString(), new AddOperand(moteur, op2));
		cf.executeCommand(op2.toString());	
		cf.executeCommand("-");
		assertEquals(moteur.getOperands().get(0), 1.0);	
	}
	
	@org.junit.Test
	public void testCalculerMult(){
		moteur = new MoteurRPN();
		cf = new CommandFactory();
		cf.addCommand("*", new Multiplication(moteur));
		Double op1 = 2.0;
		Double op2 = 3.0;
		cf.addCommand(op1.toString(), new AddOperand(moteur, op1));
		cf.executeCommand(op1.toString());	
		cf.addCommand(op2.toString(), new AddOperand(moteur, op2));
		cf.executeCommand(op2.toString());	
		cf.executeCommand("*");
		assertEquals(moteur.getOperands().get(0), 6.0);	
	}
	
	@org.junit.Test
	public void testCalculerDiv(){
		moteur = new MoteurRPN();
		cf = new CommandFactory();
		cf.addCommand("/", new Division(moteur));
		Double op1 = 2.0;
		Double op2 = 1.0;
		cf.addCommand(op1.toString(), new AddOperand(moteur, op1));
		cf.executeCommand(op1.toString());	
		cf.addCommand(op2.toString(), new AddOperand(moteur, op2));
		cf.executeCommand(op2.toString());	
		cf.executeCommand("/");
		assertEquals(moteur.getOperands().get(0), 2.0);	
	}
	
	@org.junit.Test
	public void testUndo(){
		moteur = new MoteurRPN();
		cf = new CommandFactory();
		cf.addCommand("+", new Addition(moteur));
		Double op1 = 2.0;
		Double op2 = 1.0;
		cf.addCommand(op1.toString(), new AddOperand(moteur, op1));
		cf.executeCommand(op1.toString());	
		cf.addCommand(op2.toString(), new AddOperand(moteur, op2));
		cf.executeCommand(op2.toString());	
		cf.executeCommand("+");
		
		cf.addCommand("undo", new Undo(moteur));
		cf.executeCommand("undo");
		
		assertEquals(moteur.getOperands().get(1), 1.0);	
	}
	
}
