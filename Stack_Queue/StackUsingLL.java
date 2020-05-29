/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue;

import java.util.Scanner;
/*
 *
 * @author sarthak sethi
 */

public class StackUsingLL<T> {
    private int size	;
    private Node<T> head ;
    
	public StackUsingLL() {
         size=0;
         head = null; 
	}
	
	public int size() {
        if(head == null)
            return 0;
        return size;

	}
	
	public void push(T data) {
        Node<T> newnode = new Node<T>(data);
         if(size==0)
             head= newnode;
        newnode.next = head;
        head = newnode;
        size++;

	}
	
	public boolean isEmpty() {
if(size==0)
    return true;
        else
            return false;
	}
	
	public T pop() throws StackEmptyException {
       if(size() == 0){
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
        T popelem = head.data;
        head = head.next;
        size--;
    return popelem;
	}
	
	public T top() throws StackEmptyException {
        return head.data;

	}
        
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
                
		StackUsingLL<Integer> st = new StackUsingLL<>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.push(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.pop());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.top());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
	}
}
