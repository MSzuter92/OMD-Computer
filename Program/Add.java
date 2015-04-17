package Program;

import Simulation.Address;
import Simulation.Operand;
import Simulation.Memory;
import Simulation.Word;

public class Add extends Arithmetic {
	
	/**
	 * Initiates a new Add-instruction.
	 * @param Operand w1 the first expression of the addition
	 * @param Operand w2 the second expression of the addition
	 * @param Address dest the destination address for the result
	 */
    public Add(Operand w1, Operand w2, Address dest) {
    	super(w1, w2, dest);
    }

    /**
     * Executes the addition and stores it in the memory.
     * @param Counter c the computers counter which is decreased upon a successfull execute
     * @param Memory m the currently used memory of the computer
     */
    public void execute(Counter c, Memory m) {
        Word result = w1.get(m).add(w2.get(m));
        m.setWord(result, dest);
        c.decreaseCounter();
    }
    
    /**
     * Prints the instruction to be executed.
     * @return the String containing the result to be printed
     */
    public String toString() {
    	return "ADD" + " [" + w1.toString() + "] " + w2.toString() + " [" + dest.toString() + "]";
    }

}
