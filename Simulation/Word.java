package Simulation;

public abstract class Word implements Operand {

	/**
	 * Performs an addition between two Words.
	 * @param Word word The Word to be added 
	 * @return The result
	 */
	public abstract Word add(Word word);

	/**
	 * Compares two Words and checks for equality between them.
	 * @param Word word The word to be compared to
	 * @return True if the words are equal
	 */
	public abstract boolean equalsTo(Word word);

	/**
	 * Returns the searched Word in the specified memory.
	 * @param Memory memory The memory used by the computer
	 * @return the wanted Word  
	 */
	public abstract Word get(Memory memory);

	/**
	 * Performs a multiplication between two Words.
	 * @param Word word The word to be multiplied with
	 * @return The result
	 */
	public abstract Word mul(Word word);

	/**
	 * Returns a string containing the value to be printed.
	 * @return String with value
	 */
	public abstract String toString();

}