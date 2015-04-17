package Simulation;

public class LongMemory extends Memory {
	
	/**
	 * Creates an LongMemory with the specified size.
	 * @param size the size of the memory
	 */
	public LongMemory(int size) {
		super(size);
		for(int i = 0; i < size; i++){
			memory.add(new LongWord(0)); //Puts an initial value of 0 in every position of the memory
		}
	}

}