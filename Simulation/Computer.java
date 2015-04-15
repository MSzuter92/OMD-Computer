package Simulation;


import java.util.*;

import Program.Counter;
import Program.Instruction;
import Program.Program;

/**
 * 
 */
public class Computer {
	Counter counter;
	Memory memory;
	Program program;
	ArrayList<Instruction> instructions;
	/**
     * 
     */
    public Computer(Memory memory) {
    	this.memory=memory;
    	instructions = new ArrayList<Instruction>();
    }

    /**
     * @param Program 
     * @return
     */
    public void load(Program program) {
        // TODO implement here
    	instructions = program.fetchInstructions();
    }

    /**
     * @return
     */
    public void run() {
        // TODO implement here
    	for(Instruction i:instructions){
    		i.execute(counter, memory);
    		
    	}
    	
    }

}