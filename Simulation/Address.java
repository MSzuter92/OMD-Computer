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
    public Address(int address) {
    	this.address = address;
    }

    /**
     * @return
     */
    public int getAddress() {
        return address;
    }

    /**
     * @param Memory 
     * @return
     */
    public Word get(Memory memory) {
        return memory.read(this);
    }
    
    public String toString(){
    	return Integer.toString(address);
    }
}
