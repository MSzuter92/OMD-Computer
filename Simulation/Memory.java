package Simulation;

import java.util.ArrayList;

public abstract class Memory {
	private ArrayList<Word> memory;
	private int size;
	
	/**
	 *
	 */
	public Memory(int size) {
		this.size = size;
		memory = new ArrayList<Word>(size);
	}
	
	/**
	 * 
	 * @param address
	 * @return
	 */
	public Word read(Address address) {
		return memory.get(address.getAddress());
	}

}
