package Simulation;

import java.util.ArrayList;

public abstract class Memory {
	protected ArrayList<Word> memory;
	protected int size;
	
	/**
	 * 
	 */
	public Memory(int size) {
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
	
	public void setWord(Word word, Address address){
		memory.remove(address.getAddress());
		memory.add(address.getAddress(), word);
	}

}
