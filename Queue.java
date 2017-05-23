/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plans.adt;

import plans.impl.Change;

/**
 *
 * @author Home
 */

/**
 * A queue of primitive integers
 */
public interface Queue {
        
    /**
     * Adds an element to the end of the queue.
     * 
     * @param newChange
     */
    public void enqueue(Change newChange);
    
    /**
     * Removes and returns the front most element of the queue
     * 
     * @return the front most element of the queue
     * @throws Exception if the queue is empty
     */
    public Change dequeue() throws Exception;
        
    /**
     * @return the size of the queue
     */
    public int getSize();
    
    /**
     * Removes all elements from the queue
     */
    public void clear();
    
    /**
     * @return a String representation of the queue
     */
    @Override
    public String toString();
}