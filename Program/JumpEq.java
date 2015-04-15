package Program;


import java.util.*;

import Simulation.Memory;
import Simulation.Operand;

/**
 * 
 */
public class JumpEq implements Instruction {
	int index;
	Operand w1;
	Operand w2;
	
	
    /**
     * 
     */
    public JumpEq() {
    }

    /**
     * @param int index 
     * @param Operand w1 
     * @param Operand w2
     */
    public JumpEq(int index, Operand w1, Operand w2) {
        
    	this.w1 = w1;
    	this.w2= w2;
    	this.index = index;
    	
    }

    /**
     * @param Counter c 
     * @param Memory m
     */
    public void execute(Counter c, Memory m) {
        
    	if ( w1.get(m).equalsTo(w2.get(m))){
    		//i så fall delegera till jump eller bara decrease counter -återkommer! 
    		
    	}
    	else {
    		//Decrease Counter? 
    	}
    	
    }

}