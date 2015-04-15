package Program;
import java.util.*;

/**
 * @param <E>
 * 
 */
public abstract class Program extends java.util.ArrayList<Instruction> {
	ArrayList<Instruction> instructions;

    /**
     * 
     */
    public Program() {
    	instructions = new ArrayList<Instruction>();
    }

    /**
     * @param Instruction 
     * @return
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

}