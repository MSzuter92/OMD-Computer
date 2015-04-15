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
        // TODO implement here
    	this.content = content;
    }

    /**
     * @return
     */
    private long getValue() {
        // TODO implement here
        return content;
    }

    /**
     * @param Word w1 
     * @param Word w2 
     * @return
     */
    @Override
    public Word add(Word w) {
        // TODO implement here
        long value = this.content + ((LongWord)w).getValue();
        return new LongWord(value);
    }

    /**
     * @param Word w1 
     * @return
     */
    @Override
    public boolean equalsTo(Word w) {
        // TODO implement here
    	if(this.content==((LongWord)w).getValue()){
    		return true;
    	}
        return false;
    }

    /**
     * @param Memory memory 
     * @return
     */
    @Override
    public Word get(Memory memory) {
        // TODO implement here
    	
        return new LongWord(content);
    }

    /**
     * @param Word w1 
     * @param Word w2 
     * @return
     */
    @Override
    public Word mul(Word w) {
        // TODO implement here
    	long value = this.content * ((LongWord)w).getValue();
        return new LongWord(value);
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        // TODO implement here
        return Long.toString(content);
    }

}