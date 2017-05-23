
package plans.impl;

import plans.adt.Stack;

/**
 * This should be your implementation of the stack ADT.
 * 
 * @author Bolatzhan Kumalakov
 */
public class ChangeStack implements Stack {
    private Change[] values; 
    private int size;
    
    public ChangeStack(){
        values = new Change[10]; 
        size =0;
    }

    @Override
    public void push(Change newChange) {
      
     if(size == values.length) {
         Change[] values2; 
         values2 = new Change[2*values.length];
         for (int i=0; i<size; i++){
             values2[i] = values[i];  
         }
         values = values2; 
     }  
     values[size] = newChange;  
     size++;     
    }

    @Override
    public Change pop() throws Exception {
   
        if(size==0){
            throw new Exception("The stack is empty!");
        }
        
        Change result = values[size-1];
        size--; 
        return result;                    
    }
    
    @Override
    public int getSize() {
    return size;   
    }

    @Override
    public void clear() {
    size = 0;
    }
    
    @Override
    public String toString(){
        int k;
        String mystack="bottom[";
        
        for(k=0; k<size; k++){
            mystack += values[k]+" ";
        }
        return mystack + "]top";
    }
}
