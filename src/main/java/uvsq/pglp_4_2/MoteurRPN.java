package uvsq.pglp_4_2;

import java.util.ArrayList;

//Receiver
public class MoteurRPN extends Interpreteur{
	
	private ArrayList<Double> operands;

	public MoteurRPN() {
		operands = new ArrayList<Double>();
	}
	
	public void addOperand(double operand) {
		operands.add(operand);
	}
	
	public void addition() {
		
		if(operands.size() < 2)
			return;
		
		double op1 = operands.get(operands.size()-1);
		operands.remove(operands.size()-1);
		double op2 = operands.get(operands.size()-1);
		operands.remove(operands.size()-1);
		
		operands.add(op1+op2);
		
		
	}
	public void soustraction() {
			
	}
	public void multiplication() {
		
	}
	public void division() {
		
	}
	
	public ArrayList<Double> getOperands() {
		return operands;
	}
	
	public void showOperands() {
		System.out.print("-- pile : ");
		for(double d: operands)
			System.out.print(d + " ");
		System.out.println();
	}

	public void undo() {
		for(int i = 0; i< history.size()-2; i++) {
			System.out.println(history.get(i).getClass());
			history.get(i).apply();
		}
		
	}

	
	
}
