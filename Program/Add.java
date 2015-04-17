package Program;
import Simulation.Address;
import Simulation.Operand;
import Simulation.Memory;
import Simulation.Word;

import java.util.*;


public class Add extends Arithmetic {
	
	/**
     * 
     */
    public Add(Operand w1, Operand w2, Address dest) {
    	super(w1, w2, dest);
    }

    /**
     * @param Counter c 
     * @param Memory m
     */
    public void execute(Counter c, Memory m) {
        Word result = w1.get(m).add(w2.get(m));
        m.setWord(result, dest);
        c.decreaseCounter();
    }

    public String toString() {
		return "ADD" + " [" + w1.toString() + "] " + w2.toString() + " [" + dest.toString() + "]";
    }
}
