/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;
import java.util.Scanner;

public class insert_node {
	
	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			Node<Integer> newNode = new Node<>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
//				Node<Integer> temp = head;
//				while(temp.next != null){
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}

	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		Node<Integer> newNode = new Node<>(data); // create the note for given data and pos
		
		int i = 0;
		Node<Integer> temp = head;
                if(pos == 0){
			newNode.next = temp;
			//return newNode;
		}
		while(i < pos - 1){ // till the position jaha inseert krna usse ek pehle tak traverse kro
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next; //jo insert krna uske next me pichle wala daal do suppoer 10 20 30 40 and we want to insert 80 in 30 and 40 so temp.next  is 40 so 80 ke next me 40 daal do
                temp.next = newNode; // 
		return head;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		head = insert(head, 80, 0);
		print(head);
		
//		Node<Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<Integer>(20);
//		Node<Integer> node3 = new Node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;
//		Node<Integer> head = node1;
//		print(head);
//		print(head);
		

	}

}
