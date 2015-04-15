package Program;
import java.util.*;

/**
 * 
 */
public class Counter {
	int counter;
	int initialValue;
	
    /**
     * 
     */
    public Counter() {
    	counter = 0;
    	initialValue = 0;
    }

    /**
     * 
     */
    public void setCounter(int size) {
        counter = size;
    }
    
    public void setInitial(int value) {
    	initialValue = value;
    }
    
    public int getInitial() {
    	return initialValue;
    }

    /**
     * 
     */
    public void decreaseCounter() {
        counter--;
    }

    /**
     * 
     */
    public int getValue() {
        return counter;
    }

}