
package plans.impl;

import plans.adt.Queue;

/**
 * This should be your implementation of the queue ADT.
 * 
 * @author Bolatzhan Kumalakov
 */
public class ChangeQueue implements Queue {
        private Change[] values = new Change[5];
        private int size;
        private int front;
        private int back;

        public ChangeQueue(){
            size = 0;
            front = 0;
            back = 0;
        }


        @Override
        public void enqueue(Change newChange) {

            if(size == values.length){
                Change[] temp = new Change[2*values.length];
                int index = front;

                for (int i=0; i<size; i++){
                    temp[i] = values[index];
                    index = (index+1)%values.length;
                }

                values = temp;
                front=0;
                back=size;
            }

            values[back] = newChange;
            back=(back+1)%values.length;
            size++;  
        }

        @Override
        public Change dequeue() throws Exception {

            if(size==0){
                throw new Exception("The queue is empty!");
            }

            Change result = values[front];
            front=(front+1)%values.length;
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

            String str1 = "front[";
            String str2 = "]back";

            if(size==0){
               return str1+str2;
            }

            if(front < back) {
               for(int i=front; i<back; i++){
                   str1 += values[i] +" ";
               } 
               return str1+str2;
            } else {
                for (int i=0; i<back; i++){
                    str1+= values[i] +" ";
                }

                for (int i=back; i<front; i++){
                     str1+= values[i] +" ";  
                }

                 for (int i=front; i<size; i++){
                     str1+= values[i] +" ";  
                }

                 return str1 + str2;
            }
        }
}
