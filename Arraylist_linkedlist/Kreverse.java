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
public class Kreverse {
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if(head==null){
            return head;
            
        }
        int count=0;
        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> prev=null;
        while(count<k&&curr!=null){
            LinkedListNode<Integer> next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
            
        }
        LinkedListNode<Integer> smallHead=kReverse(curr,k);
        head.next=smallHead;
        return prev;
    }
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
		reverse_Best.print(kReverse(reverse_Best.takeinput(), s.nextInt()));
	}
}
