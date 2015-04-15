package Simulation;

public abstract class Word implements Operand {
	
    public abstract Word add(Word word);
 
    public abstract boolean equalsTo(Word w1);
    
    public abstract Word get(Memory memory);
    
    public abstract Word mul(Word w1, Word w2);
    
    @Override
    public abstract String toString();
    
}