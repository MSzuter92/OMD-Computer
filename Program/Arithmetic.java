package Program;

import Simulation.Address;
import Simulation.Memory;
import Simulation.Operand;

public abstract class Arithmetic implements Instruction {
	Operand w1;
	Operand w2;
	Address dest;

    /**
     * Constructor for the abstract class Arithmetic which delegates Operands and
     * an execute()-method to the classes Add and Mul.
     * @param Operand w1 the first expression of the Arithmetic calculation
     * @param Operand w2 the second expression of the Arithmetic calculation
     * @param Address dest the destination address for the result
     */
    public Arithmetic(Operand w1, Operand w2, Address dest) {
    	this.w1 = w1;
    	this.w2 = w2;
    	this.dest = dest;
    }
    
    /**
     * Execute-method for the Arithmetic calculations (Add & Mul).
     */
    public abstract void execute(Counter c, Memory m);

}