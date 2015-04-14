package Program;


import java.util.*;

import Simulation.Memory;


public interface Instruction {

    /**
     * @param Counter c 
     * @param Memory m
     */
    public void execute(Counter c, Memory m);

}