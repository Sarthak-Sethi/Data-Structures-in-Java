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
public class delete_recursively {
    public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i){
        
             if(head == null)
            return head;
		if(i ==0)
            return head.next;
       
       
      LinkedListNode<Integer> smallhead =  deleteIthNodeRec(head.next,i-1);
        head.next = smallhead;
		return head;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head = reverse_Best.takeinput();
		int pos = s.nextInt();
		head = deleteIthNodeRec(head, pos);
		reverse_Best.print(head);
	}
}
