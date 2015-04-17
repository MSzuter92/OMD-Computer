package Program;

import Simulation.Memory;

public class Jump implements Instruction {
	int index;

	/**
	 * Initiates a Jump instruction with the index of the instruction to be executed next.
	 * @param int index The index of the next instruction
	 */
	public Jump(int index) {
		this.index = index;
	}

	/**
	 * The execute method for Jump which sets the counter so it points to the right instruction.
	 * @param Counter c 
	 * @param Memory m
	 */
	public void execute(Counter c, Memory m) {
		c.setCounter(c.getInitial()-index);
	}

	/**
     * Prints the instruction to be executed.
     * @return the String containing the result to be printed
     */
	public String toString() {
		return "JMP " + index;
	}

}