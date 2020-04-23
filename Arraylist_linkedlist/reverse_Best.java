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
public class reverse_Best {
    public static LinkedListNode<Integer> reversebest(LinkedListNode<Integer> head)
    {
        if(head==null || head.next==null)
            return head;
        LinkedListNode<Integer> ftail = head.next;
        LinkedListNode<Integer> smallans = reversebest(head.next);
        ftail.next = head;
        head.next = null;
        return smallans;
    }
    public static LinkedListNode<Integer> takeinput() {
         LinkedListNode<Integer> head = null;
         LinkedListNode<Integer> tail =null;
         Scanner s = new Scanner(System.in);
         int data = s.nextInt();
         while(data!=-1)
         {
           LinkedListNode<Integer> newnode = new LinkedListNode<Integer>(data); // creating a node corresponding to the input data
           if(head == null)
           {
            head= newnode;
            tail = newnode;
            //agar head null hai and ab ek newnode bn gya hai to head null nhi rehna chachiye and should point to new node
           }    
            else 
          {
//               LinkedListNode<Integer> temp = head;
//               while(temp.next!=null)
//               {
//                   temp=temp.next;
//               }
//               temp.next = newnode;
               tail.next = newnode;
               tail = newnode; //or tail = tail.next; // tail change ho jaayega naa ab kyunki new node add ho gya hai 
           }
           data = s.nextInt();
         }
         
        return head;
    }
    public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeinput();
        LinkedListNode<Integer> ans = reversebest(head);
        
        print(ans);
    }
    
}
