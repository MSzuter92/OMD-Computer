package Simulation;

public class Address implements Operand {
	private int address;

	/**
	 * Creates a new Address with the sent in index.
	 * @param int address The index of the address
	 */
	public Address(int address) {
		this.address = address;
	}

	/**
	 * Returns the index of the Address.
	 * @return int address The index
	 */
	public int getAddress() {
		return address;
	}

	/**
	 * Returns the Word that the Address points to.
	 * @param Memory The memory where the Address is stored
	 * @return The Word positioned in this address
	 */
	public Word get(Memory memory) {
		return memory.read(this);
	}

	/**
	 * Prints the index of the Address.
	 * @return String containing the index
	 */
	public String toString(){
		return Integer.toString(address);
	}

}
