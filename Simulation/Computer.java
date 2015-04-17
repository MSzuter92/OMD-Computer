package Simulation;

import java.util.*;

import Program.Counter;
import Program.Instruction;
import Program.Program;

public class Computer {
	private Counter counter;
	private Memory memory;
	private Instruction[] instructions;

	/**
	 * Initiates a new Computer. 
	 * @param Memory memory The type of memory to be used 
	 */
	public Computer(Memory memory) {
		this.memory=memory;
	}

	/**
	 * Loads the specified program into the memory.
	 * @param Program The program to be loaded
	 */
	public void load(Program program) {
		counter = new Counter();

		ArrayList<Instruction> temp = program.fetchInstructions();
		instructions = new Instruction[temp.size()];
		int count = 0;
		for (Instruction i : temp) {  //Transfers the instructions into an Array so they can be executed with 
			instructions[count] = i;  //the correct index and make Jumps possible
			count++;
		}

		counter.setCounter(instructions.length);
		counter.setInitial(instructions.length);
	}

	/**
	 * Iterates over the instructions list and executes them in order.
	 */
	public void run() {
		while (counter.getValue() > 0) {
			instructions[counter.getInitial()-counter.getValue()].execute(counter, memory);
		}
	}
}
