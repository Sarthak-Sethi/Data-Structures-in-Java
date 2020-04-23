/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;
import java.util.Scanner;



//class LinkedListNode<T> {
//	public T data;
//	public LinkedListNode<T> next;
//
//	public LinkedListNode(T data) {
//		this.setData(data);
//		this.next = null;
//	}
//
//	public T getData() {
//		return data;
//	}
//
//	public void setData(T data) {
//		this.data = data;
//	}
//
//}

public class reverse_iterative {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(reverse_I(input()));
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
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

public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
			 LinkedListNode<Integer> current=head;
        LinkedListNode<Integer> previous=null;
        LinkedListNode<Integer> next=null;
       // if current is head usse peeche kuch nhi hai to that is null so previous = null
        while(current!=null)
        { next = current.next;
            current.next = previous;
         previous = current;
         current = next; 
        } //jab current null hoga to previous lastnode pe hoga..........which is head for reverse list so return previous
        return previous;
        
}
}

