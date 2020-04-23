/*
 * To change this template, choose Tools Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;
public class Node<T> {
    /*
     * generic can be either complete class or specific function
     it is not neceesary for complete class to be generic for using generic function
    this can be done other wise 
     */
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
                    }
	
}
