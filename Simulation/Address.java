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
    public void Address() {
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
    	memory.read(this);
        // TODO implement here
        return null;
    }
}
