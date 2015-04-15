package Program;

import java.util.*;

import Simulation.Address;
import Simulation.Memory;
import Simulation.Operand;
import Simulation.Word;

/**
 * 
 */
public class Mul extends Arithmetic {

    /**
     * 
     */
    public Mul(Operand w1, Operand w2, Address dest) {
    	super(w1, w2, dest);
    }

    /**
     * @param Counter c 
     * @param Memory m
     */
    public void execute(Counter c, Memory m) {
        Word result = w1.get(m).mul(w2.get(m));
        m.setWord(result, dest);
        c.decreaseCounter();
    }

}