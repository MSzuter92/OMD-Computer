package Program;

import Simulation.Memory;
import Simulation.Operand;

public class Print implements Instruction {
	Operand w;

	/**
	 * Initiates a Print instruction which prints the value of the Operand sent in.
	 * @param Operand w The Operand containing the Word which value is to be printed
	 */
	public Print(Operand w) {
		this.w = w;
	}

	/**
	 * the exeute method for Print which prints the value of the Word in the Console
	 * @param Counter c The counter used by the computer to be decreased
	 * @param Memory m The memory used by the computer
	 */
	public void execute(Counter c, Memory m) {
		System.out.println(w.get(m).toString());
		c.decreaseCounter();
	}

	/**
	 * Prints the instruction to be executed.
	 * @return the String containing the result to be printed
	 */
	public String toString(){
		return "PRT" + " [" + w + "] ";
	}

}