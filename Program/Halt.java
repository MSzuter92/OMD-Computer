package Program;

import Simulation.Memory;

public class Halt implements Instruction {

	/**
	 * Empty Constructor.
	 */
	public Halt() {}

	/**
	 * The Execute method for Halt which sets the counter to the value -1.
	 * @param Counter c The Counter to be affected 
	 * @param Memory m Common parameter for the execute-method, not used here 
	 */
	public void execute(Counter c, Memory m) {
		c.setCounter(-1);
	}

	/**
     * Prints the instruction to be executed.
     * @return the String containing the result to be printed
     */
	public String toString() {
		return "HLT";
	}

}