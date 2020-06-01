/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author sarthak sethi
 */
public class QueueImplementation {
    // queue is not a class it is an interface
    // it is abstract .
   // Queue<Integer> q = new Queue<>();
// this is giving an error as it is interface 
    // so we make the reference of Queue to point to the LinkedList class as
    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();
         q.add(10); //enquue
         q.poll(); //deque
         q.peek();//front
         q.size();
         q.element();
    }
   
    
    
    
    
}
