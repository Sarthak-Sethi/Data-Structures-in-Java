/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

/**
 *
 * @author sarthak sethi
 */
public class bubblesort {
    
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
        LinkedListNode<Integer> temp  = head;
        int size=0,trav=0;
        while(temp!=null)
        {
            temp = temp.next;
            size++;
        }
        
       while(trav<size-1) { 
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> prev = null;
        while(current.next!=null)
        {
            if(current.data.compareTo(current.next.data) == 1)
            {  LinkedListNode<Integer> next  = current.next;
             
                if(prev!=null) {
            prev.next = current.next;
                current.next = next.next;
                next.next = current;
                prev = prev.next; }
                else
                {
                current.next = next.next;
                    next.next = current;
                    prev = next;
                    head = prev;
                }
            }
            else 
            {
             prev = current;
            current = current.next;
            }
        }trav++; } 
        return head;
	}
        public static void main(String[] args) {
		reverse_Best.print(bubblesort.bubbleSort(reverse_Best.takeinput()));
	}
}
