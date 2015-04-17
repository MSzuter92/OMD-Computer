package Program;

import Simulation.Memory;
import Simulation.Operand;

public class JumpEq implements Instruction {
	private int index;
	private Operand w1;
	private Operand w2;

	/**
	 * Initiates a JumpEq instruction which compares two Words and executes a Jump upon equality of the Words.
	 * @param int index The index of the Jump to possibly be executed
	 * @param Operand w1 The first Operand to be compared
	 * @param Operand w2 The second Operand to be compared
	 */
	public JumpEq(int index, Operand w1, Operand w2) {
		this.w1 = w1;
		this.w2= w2;
		this.index = index;
	}

	/**
	 * The execute method for JumpEq which only executes a Jump 
	 * @param Counter c 
	 * @param Memory m
	 */
	public void execute(Counter c, Memory m) {
		if (w1.get(m).equalsTo(w2.get(m))){
			c.setCounter(c.getInitial()-index);
		} else {
			c.decreaseCounter();
		}	
	}
	
	/**
     * Prints the instruction to be executed.
     * @return the String containing the result to be printed
     */
	public String toString(){
		return "JEQ " + String.valueOf(index) + " [" + w1.toString() + "] " + w2.toString();
	}
	
}
