package Program;


import java.util.*;

import Simulation.Memory;

/**
 * 
 */
public class Halt implements Instruction {

    /**
     * @param Counter cou
     */
    public Halt() {}

    /**
     * @param Counter c 
     * @param Memory m
     */
    public void execute(Counter c, Memory m) {
        c.setCounter(-1);
    }
    
    public String toString() {
    		return "HLT";
    }
}