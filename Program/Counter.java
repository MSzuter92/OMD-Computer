package Program;
import java.util.*;

/**
 * 
 */
public class Counter {   //You can't count on GitHub...
	int counter;
	
    /**
     * 
     */
    public Counter() {
    	counter = 0;
    }

    /**
     * 
     */
    public void setCounter(int size) {
        counter = size;
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