/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

/**
 *
 * @author sarthak sethi
 */
public class swap {
    public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
        LinkedListNode<Integer> temp1 = head;
        LinkedListNode<Integer> temp2 = head;
        LinkedListNode<Integer> p1 = null;
        LinkedListNode<Integer> c1 = null;
        LinkedListNode<Integer> p2 = null;
        LinkedListNode<Integer> c2 = null;

        int trav1=0;
        int trav2 = 0;
        if(i==0 || j==1)
        {
            c1=head;
            p2=head;
            c2=head.next;
            c2.next = c1;
            c1.next = null;
            return c2;
        }
        if(i>j)
        {
            int temp =i;
            i=j;
            j= temp;
        }
        while(trav1<i-1)
        {
            temp1 = temp1.next;  
            trav1++;
        }
        p1 = temp1;
        c1 = temp1.next;
        while(trav2<j-1)
        {
            temp2 = temp2.next;
            trav2++;
        }
        p2 = temp2;
        c2 = temp2.next;
        p1.next = c2;
        p2.next = c1;
        c1.next = c2.next;
        c2.next = p2;

        return head;
    }
}
    
