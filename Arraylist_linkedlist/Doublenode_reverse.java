/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

import java.util.Scanner;

class Doublenode
{
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;
    
}
public class Doublenode_reverse {
    public static Doublenode reversebetter(LinkedListNode<Integer> head)
    {
        if(head==null || head.next==null)
        {
            Doublenode d = new Doublenode();
            d.head = head;
            d.tail = head;
            return d;
        }
        Doublenode smallans = new Doublenode();
        smallans = reversebetter(head.next);
        smallans.tail.next = head;
        head.next = null;
        Doublenode ans = new Doublenode();
        ans.head = smallans.head;
        ans.tail = head;
        return ans;
        
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
        Doublenode ans = new Doublenode();
        ans = reversebetter(head);
        print(ans.head);
    }
}
