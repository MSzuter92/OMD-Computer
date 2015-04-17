package Program;

import Simulation.Memory;

public interface Instruction {

	/**
	 * The execute-method which is common for all instructions.
	 * @param Counter c The computers counter
	 * @param Memory m The memory used by the computer
	 */
	public void execute(Counter c, Memory m);

}