package Simulation;


import java.util.*;

/**
 * 
 */
public class LongWord extends Word {
	private long content;
	
	/**
     * @param long
     */
    public LongWord(long content) {
    	this.content = content;
    }

    /**
     * @return
     */
    private long getValue() {
        return content;
    }

    /**
     * @param Word w1 
     * @param Word w2 
     * @return
     */
    public Word add(Word w) {
        long value = this.content + ((LongWord)w).getValue();
        return new LongWord(value);
    }

    /**
     * @param Word w1 
     * @return
     */
    public boolean equalsTo(Word w) {
    	if(this.content==((LongWord)w).getValue()){
    		return true;
    	}
        return false;
    }

    /**
     * @param Memory memory 
     * @return
     */
    public Word get(Memory memory) {    	
        return new LongWord(content);
    }

    /**
     * @param Word w1 
     * @param Word w2 
     * @return
     */
    public Word mul(Word w) {
    	long value = this.content * ((LongWord)w).getValue();
        return new LongWord(value);
    }

    /**
     * @return
     */
    public String toString() {
        return Long.toString(content);
    }

}