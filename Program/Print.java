package Program;


import java.util.*;

import Simulation.Memory;
import Simulation.Operand;

/**
 * 
 */
public class Print implements Instruction {
	Operand w;
	
    /**
     * @param Operand w
     */
    public Print(Operand w) {
        this.w = w;
    }

    /**
     * @param Counter c 
     * @param Memory m
     */
    public void execute(Counter c, Memory m) {
        System.out.println(w.get(m).toString());
        c.decreaseCounter();
    }

}