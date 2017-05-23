
package plans.impl;

import plans.adt.ChangeManagerInterface;

/**
 * 
 * @author Aidana
 */
public class ChangeManager implements ChangeManagerInterface {
    
    ChangeQueue ch1 = new ChangeQueue();
    ChangeStack ch2 = new ChangeStack();
    
    /**
     * This method should add a change object to the ChangeQueue, and
     * display user notification, if there was enough space.
     * 
     * @param newChange 
     */
    @Override
    public void planChange(Change newChange) {
        ch1.enqueue(newChange);
    }
    /**
     * This method should pop() an existing change object from ChangeQueue,
     * and put it to the ChangeStack.
     * 
     * @throws Exception 
     */
    @Override
    public void commitChange() throws Exception {
       
        if (ch1.getSize() == 0){
            throw new Exception ("Queue is empty!");
        }
        
        ch2.push( ch1.dequeue());
    }

    /**
     * Prints out changes stored in the ChangeStack. 
     */
    @Override
    public void printCommitedChanges() {
        System.out.println("You've made " + ch2.getSize() + " change(s).");
        System.out.println(ch2);
    }   
}
