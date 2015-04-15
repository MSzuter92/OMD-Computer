package Simulation;

import java.util.*;

/**
 * 
 */
public class Address implements Operand {
	private int address;
	
    /**
     * @param int
     */
    public Address() {
        // TODO implement here
    	this.address = address;
    }

    /**
     * @return
     */
    public int getAddress() {
        // TODO implement here
        return address;
    }

    /**
     * @param Memory 
     * @return
     */
    public Word get(Memory memory) {
        // TODO implement here
        return memory.read(this);
    }
}
