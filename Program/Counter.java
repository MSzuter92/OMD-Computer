package Program;

public class Counter {
	int counter;
	int initialValue;

	/**
	 * Initiates a Counter with the default values 0
	 */
	public Counter() {
		counter = 0;
		initialValue = 0; //To keep track of the original amount of instructions, primarily for Jumps.
	}

	/**
	 * Sets the Counter to the desired value.
	 * @param value The new value of the Counter
	 */
	public void setCounter(int value) {
		counter = value;
	}

	/**
	 * Sets the InitialValue of the Counter.
	 * @param value The new Value of the initialValue
	 */
	public void setInitial(int value) {
		initialValue = value;
	}

	/**
	 * Returns this Counters initial value.
	 * @return initialValue The original value of this counter
	 */
	public int getInitial() {
		return initialValue;
	}

	/**
	 * Decreases the counter with 1.
	 */
	public void decreaseCounter() {
		counter--;
	}

	/**
	 * Returns the current value of the counter.
	 * @return counter The current value
	 */
	public int getValue() {
		return counter;
	}

}