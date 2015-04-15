package Simulation;

public abstract class Word implements Operand {
	
    public abstract Word add(Word word);
 
    public abstract boolean equalsTo(Word word);
    
    public abstract Word get(Memory memory);
    
    public abstract Word mul(Word word);
    
    @Override
    public abstract String toString();
    
}