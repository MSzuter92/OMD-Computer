package Program;
import java.util.*;

public class Program extends java.util.ArrayList<Instruction> {
	private static final long serialVersionUID = 1L;
	private ArrayList<Instruction> instructions;

	/**
	 * Constructs a new ArrayList where the programs instructions will be stored.
	 */
	public Program() {
		instructions = new ArrayList<Instruction>();
	}

	/**
	 * Overrides ArrayLists Add method which adds a new value (Instruction) into the list.
	 * @param Instruction The instruction to be added 
	 * @return True if the add was successful 
	 */
	public boolean add(Instruction ins) {
		return instructions.add(ins);
	}

	/**
	 * Returns an ArrayList containing all the programs instructions. 
	 * @return ArrayList instructions
	 */
	public ArrayList<Instruction> fetchInstructions() {
		return instructions;
	}

	/**
	 * Prints the instruction to be executed.
	 * @return the String containing the result to be printed
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < instructions.size() ;i++){
			sb.append(i + " " + instructions.get(i).toString() + "\n");
		}
		return sb.toString();
	}
	
}