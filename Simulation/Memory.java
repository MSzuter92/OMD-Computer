package Simulation;

import java.util.ArrayList;

public abstract class Memory {
	protected ArrayList<Word> memory;
	protected int size;
	
	/**
	 * Creates a new memory of the specified size.
	 * @param int size The size of the memory 
	 */
	public Memory(int size) {
		memory = new ArrayList<Word>(size);
	}
	
	/**
	 * Reads the specified address in the memory and returns the Word placed on that address.
	 * @param Address address The address that points to the wanted Word 
	 * @return The searched Word
	 */
	public Word read(Address address) {
		return memory.get(address.getAddress());
	}
	
	/**
	 * Sets a new value (Word) to the specified Address.
	 * @param Word word The word to be stored 
	 * @param Address address The address where the word should be stored 
	 */
	public void setWord(Word word, Address address){
		memory.remove(address.getAddress());
		memory.add(address.getAddress(), word);
	}

}
