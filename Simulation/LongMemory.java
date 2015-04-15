package Simulation;


import java.util.*;

/**
 * 
 */
public class LongMemory extends Memory {
		//skapar ny LongWord i alla minnesplatser
    public LongMemory(int size) {
		super(size);
		for(int i =0; i<size; i++){
			memory.add(new LongWord(0));
		}
	}

}