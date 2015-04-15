package Simulation;


import java.util.*;

/**
 * 
 */
public class LongWord extends Word {
	long content;
	
	/**
	 * Constructor
     * @param size
     */
    public LongWord(long size) {
    	content = size;
    }

    /**
     * @return content
     */
    private long getValue() {
        return content;
    }

    /**
     * @param Word w1 
     * @param Word w2 
     * @return
     */
    public LongWord add(Word w1, Word w2) {
        
        return null;
    }

    /**
     * @param Word w1 
     * @return
     */
    public boolean equalsTo(Word w1) {
        // TODO implement here
        return false;
    }

    /**
     * @param Memory memory 
     * @return
     */
    public LongWord get(Memory memory) {
        // TODO implement here
        return null;
    }

    /**
     * @param Word w1 
     * @param Word w2 
     * @return
     */
    public LongWord mul(Word w1, Word w2) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}