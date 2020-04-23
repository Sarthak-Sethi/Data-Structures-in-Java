/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

/**
 *
 * @author sarthak sethi
 */
import java.util.Scanner;


 class Runner2 {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(Even_after_Odd_LinkedList.sortEvenOdd(input()));
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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}

public class Even_after_Odd_LinkedList {
    public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
     LinkedListNode<Integer> oddhead = null ;
     LinkedListNode<Integer> oddtail = null ;
     LinkedListNode<Integer> evenhead = null;
        LinkedListNode<Integer> eventail = null;
        if(head.next==null)
        {
            return head;
        }
         while(head!=null)
       {
           if(head.data%2!=0)
           {
              if(oddhead==null) 
              {
                  oddhead = head; 
                  oddtail = head;
              }
               else
               {
                   oddtail.next = head;
                   oddtail = oddtail.next;
               }
                   
           }
             else
             {
                 if(evenhead==null)
                 {
                     evenhead= head;
                     eventail = head;
                 }
                 else
                 {
                     eventail.next = head;
                     eventail = eventail.next;
                 }
             }
         head = head.next;
       }
        if(oddtail!=null)
       oddtail.next = evenhead;
        else
        {
            if(oddhead==null && oddtail == null)
                return evenhead;
        }
        if(eventail!=null)
       eventail.next = null;
        return oddhead;
	}
}
