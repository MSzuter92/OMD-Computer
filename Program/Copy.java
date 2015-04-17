package Program;

import Simulation.Address;
import Simulation.Memory;
import Simulation.Operand;

public class Copy implements Instruction {
	private Operand src;
	private Address dest;

	/**
	 * Initiates a Copy instruction which moves the value of a Word into another.
	 * @param Operand src The Address/Word containing the source value
	 * @param Address dest The Address for the destinaiton of the result
	 */
    public Copy(Operand src, Address dest) {
        this.src = src;
        this.dest = dest;
    }

    /**
     * Execute-method which performs the Copy.
     * @param Counter c The computers counter to be decreased
     * @param Memory m The computers current memory
     */
    public void execute(Counter c, Memory m) {
        m.setWord(src.get(m), dest);
        c.decreaseCounter();
    }
    
    /**
     * Prints the instruction to be executed.
     * @return the String containing the result to be printed
     */
    public String toString() {
    	return "CPY" + " " + src.toString() + " [" + dest.toString() + "] ";
    }

}