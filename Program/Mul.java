package Program;

import Simulation.Address;
import Simulation.Memory;
import Simulation.Operand;
import Simulation.Word;

public class Mul extends Arithmetic {

	/**
	 * Initiates a Mul instruction which multiplies two Words and stores the in a Destination Address.
	 * @param Operand w1 The first factor of the multiplication 
	 * @param Operand w2 The second factor of the multiplication 
	 * @param Address dest The Address for the destination where the result should be stored
	 */
	public Mul(Operand w1, Operand w2, Address dest) {
		super(w1, w2, dest);
	}

	/**
	 * the execute method Mul which performs the multiplication and stores the result in the memory.
	 * @param Counter c The counter to be affected
	 * @param Memory m The memory used by the computer
	 */
	public void execute(Counter c, Memory m) {
		Word result = w1.get(m).mul(w2.get(m));
		m.setWord(result, dest);
		c.decreaseCounter();
	}

	/**
	 * Prints the instruction to be executed.
	 * @return the String containing the result to be printed
	 */
	public String toString() {
		return "MUL" + " [" + w1 + "] " + "[" + w2 + "] " + "[" + dest + "] ";
	}

}