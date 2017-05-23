
package plans.adt;

import plans.impl.Change;

/**
 * This is ChangeManager specification.
 * 
 * @author Bolatzhan Kumalakov
 */
public interface ChangeManagerInterface {
    
    /**
     * User should be able to plan the change.
     * 
     * @param newChange 
     */
    public void planChange(Change newChange);
    
    /**
     * User should be able to commit the change, which is planned 
     * in the queue. If not in the queue, method should throw an exception.
     * 
     * @throws java.lang.Exception
     * @throw exception if planned change does not exist.
     */
    public void commitChange() throws Exception;
    
    /**
     * Prints out changes stored in the ChangeStack.
     */
    public void printCommitedChanges();
    
}
