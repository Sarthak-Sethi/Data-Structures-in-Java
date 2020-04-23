/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;
import java.util.Scanner;

class LinkedListNode1<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode1(T data) {
		this.data = data;
	}
}

public class Merge_2_sorted_ll {
	
	static Scanner s = new Scanner(System.in);
	
	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
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
		LinkedListNode<Integer> head1 = takeInput();
		LinkedListNode<Integer> head2 = takeInput();
		LinkedListNode<Integer> head3 = mergeTwoList(head1, head2);
		print(head3);
	}

    private static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> temp1 = head1;
        LinkedListNode<Integer> temp2 = head2;
        LinkedListNode<Integer> fhead= head1;
        LinkedListNode<Integer> ftail= head1;
        if(temp1.data>temp2.data)
        {
            fhead = temp2;
            ftail= temp2; 
            temp2 = temp2.next;
        }
        else
        { 
            fhead = temp1;
            ftail = temp1;
            temp1 = temp1.next;
        }
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {  
                 ftail.next = temp1;
                ftail = ftail.next;
                 temp1 = temp1.next;
            }
            else 
            {  
                ftail.next = temp2;
               ftail = ftail.next;
                temp2 = temp2.next;
                //System.out.println("HELLO" + temp2.next.data);
            }          
        }
        if(temp1==null)
        {
            ftail.next = temp2;
            ftail = temp2;
        }
        else
        {
            ftail.next = temp1;
        }
        return fhead;
    }
}
