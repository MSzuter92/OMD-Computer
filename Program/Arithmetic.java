package Program;
import Simulation.Address;
import Simulation.Memory;
import Simulation.Operand;

import java.util.*;


public abstract class Arithmetic implements Instruction {
	Operand w1;
	Operand w2;
	Address dest;

    /**
     * @param Operand w1 
     * @param Operand w2 
     * @param Operand dest
     */
    public Arithmetic(Operand w1, Operand w2, Address dest) {
    	this.w1 = w1;
    	this.w2 = w2;
    	this.dest = dest;
    }
    
    public abstract void execute(Counter c, Memory m);

}