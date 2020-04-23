/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;
import java.util.Scanner;


class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class Pallindrome {
	private static Scanner s = new Scanner(System.in);

//	public static void main(String[] args) {
//		System.out.print(Solution.isPalindrome_2((input())));
//	}

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

}
 class Solution {
	public static void isPalindrome_2(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int trav=1;
       while(temp.next!=null)
       {
           temp = temp.next;
           trav++;
       }
            System.out.println(trav);
    }
        public static void main(String[] args) {
         LinkedListNode<Integer> head = Pallindrome.input();
         Solution.isPalindrome_2(head);
         
     }
}
