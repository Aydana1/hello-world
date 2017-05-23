
package plans.adt;

import plans.impl.Change;

/**
 * A stack of primitive integers
 */
public interface Stack {
    
    /**
     * Puts the given element on the top of the stack.
     * 
     * @param newChange
     */
    public void push(Change newChange);
    
    /**
     * Removes and returns the top most element of the stack
     * 
     * @return the top most element of the stack
     * @throws Exception if the stack is empty
     */
    public Change pop() throws Exception;
        
    /**
     * @return the size of the stack
     */
    public int getSize();
    
    /**
     * Removes all elements from the stack
     */
    public void clear();
       
    /**
     * @return a String representation of the stack
     */
    @Override
    public String toString();

}