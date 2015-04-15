package Simulation;

import java.util.*;

/**
 * 
 */
public class Address implements Operand {
	private int address;
	
    /**
     * Constructor
     * @param index
     */
    public void Address(int index) {
        address = index;
    }

    /**
     * @return
     */
    public int getAddress() {
        // TODO implement here
        return 0;
    }

    /**
     * @param Memory 
     * @return
     */
    public Word get(Memory memory) {
        return memory.getWord(address);
    }
}
