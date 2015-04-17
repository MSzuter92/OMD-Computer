package Simulation;

public interface Operand {

	/**
	 * Returns a Word in the specified memory.
	 * @param Memory memory The memory used by the computer 
	 * @return The wanted Word.
	 */
	public Word get(Memory memory);
	
	/**
	 * Returns a string containing the value to be printed.
	 * @return String with value
	 */
	public String toString();
	
}
