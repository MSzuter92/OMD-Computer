package Program;
import java.util.*;

/**
 * @param <E>
 * 
 */
public class Program extends java.util.ArrayList<Instruction> {
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
     * remove is not permitted, returns null
     */
    public Instruction remove(int index) {
    	System.out.println("Remove on a program list is not permitted!! ACCESS DENIED!!");
    	return null;
    }
    
    /**
     * remove is not permitted, returns null
     */
    public Instruction remove(Instruction ins) {
    	System.out.println("Remove on a program list is not permitted!! ACCESS DENIED!!");
    	return null;
    }
    
    /**
     * Returns an ArrayList containing all the programs instructions. 
     * @return ArrayList instructions
     */
    public ArrayList<Instruction> fetchInstructions() {
    	return instructions;
    }
    
    public String toString(){
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < instructions.size() ;i++){
    		sb.append(i + " " + instructions.get(i).toString() + "\n");
    	}
    	return sb.toString();
    }

}










