package Program;

import java.util.*;

import Simulation.Address;
import Simulation.Memory;
import Simulation.Operand;
import Simulation.Word;

/**
 * 
 */
public class Copy implements Instruction {
	Operand src;
	Address dest;

    /**
     * @param Operand src 
     * @param Address dest
     */
    public Copy(Operand src, Address dest) {
        this.src = src;
        this.dest = dest;
    }

    /**
     * @param Counter c 
     * @param Memory m
     */
    public void execute(Counter c, Memory m) {
        m.setWord(src.get(m), dest);
        c.decreaseCounter();

    }

}