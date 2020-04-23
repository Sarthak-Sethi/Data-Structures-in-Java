/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;
public class Linkedlistuse {
	
	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>(10);
		Node<Integer> node2 = new Node<>(20);
		Node<Integer> node3 = new Node<>(30);
		node1.next = node2;
		node2.next = node3;
		Node<Integer> head = node1;
		print(head);
		print(head);
		// do baar chalega print as ek baar function call hui......  and khatam hua
                

	}

}
