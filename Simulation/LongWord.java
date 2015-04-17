package Simulation;

public class LongWord extends Word {
	private long content;

	/**
	 * Creates a longWord containing the specified value.
	 * @param long content The Value of the Word
	 */
	public LongWord(long content) {
		this.content = content;
	}

	/**
	 * Returns the Words value.
	 * @return long content The value 
	 */
	private long getValue() {
		return content;
	}

	/**
	 * Adds the value of another Word.
	 * @param Word w The Word to be added 
	 * @return new Longword containing the new value
	 */
	public Word add(Word w) {
		long value = this.content + ((LongWord)w).getValue();
		return new LongWord(value);
	}

	/**
	 * Compares this Word to another and checks for equality.
	 * @param Word w The Word to be compared
	 * @return true if the two Words are equal
	 */
	public boolean equalsTo(Word w) {
		if(this.content==((LongWord)w).getValue()){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns the Word with its content.
	 * @param Memory memory The memory used by the computer
	 * @return new LongWord containing the correct value
	 */
	public Word get(Memory memory) {    	
		return new LongWord(content);
	}

	/**
	 * Performs a multiplication with another Word.
	 * @param Word w The word to be multiplied 
	 * @return new LongWord containing the result of the multiplication 
	 */
	public Word mul(Word w) {
		long value = content * ((LongWord)w).getValue();
		return new LongWord(value);
	}

	/**
	 * Prints the value of this Word.
	 * @return String containing the value
	 */
	public String toString() {
		return Long.toString(content);
	}

}