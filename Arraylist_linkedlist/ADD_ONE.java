/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class ADD_ONE {
     static LinkedListNode<Integer> addOneUtil(LinkedListNode<Integer> head)  
{  
    // res is head node of the resultant list  
     LinkedListNode<Integer> res = head;  
    LinkedListNode<Integer> temp = null; 
        LinkedListNode<Integer> prev = null;  
  
    int carry = 1, sum;  
  
    while (head != null) //while both lists exist  
    {  
        sum = carry + head.data;  
  
        // update carry for next calulation  
        carry = (sum >= 10)? 1 : 0;  
  
        // update sum if it is greater than 10  
        sum = sum % 10;  
  
        // Create a new node with sum as data  
        head.data = sum;  
  
        // Move head and second pointers to next nodes  
        temp = head;  
        head = head.next;  
    }  
  
    // if some carry is still there, add a new node to  
    // result list.  
    if (carry > 0) { 
        LinkedListNode<Integer> newNode = new LinkedListNode<>(carry);
        temp.next = newNode;  
    }
  
    // return head of the resultant list  
    return res;  
}  
	 public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
         // Reverse linked list  
    head = reverse(head); 
    head = addOneUtil(head);  
    return reverse(head);  
       
     }
    static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head)  
{  
    LinkedListNode<Integer> prev = null;  
    LinkedListNode<Integer> current = head;  
    LinkedListNode<Integer> next = null;  
    while (current != null)  
    {  
        next = current.next;  
        current.next = prev;  
        prev = current;  
        current = next;  
    }  
    return prev;  
}  
    	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
                Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(LinkedListNode<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
		
		LinkedListNode<Integer> head = takeInput();
		head = nextLargeNumber(head);
		print(head);
		
	}

}
