/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;
import java.util.Scanner;


public class mid_of_LL{
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
         LinkedListNode<Integer> middle = printMiddel(input());
            System.out.println(middle.data);
		
	}
	

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

    private static LinkedListNode<Integer> printMiddel(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
     
        while(fast!=null)
        {   
          slow= slow.next;  
            if(fast.next.next == null)
               break;
            fast = fast.next.next;
            if(fast.next == null)
                break;
        }   
//        while(trav<mid-1) 
//        {   
//            temp = temp.next; 
//            trav++;
//        }
        return slow;
        
    }
}
class LinkedListNode2<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode2(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
