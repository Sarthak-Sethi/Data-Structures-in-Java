/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue;

import java.util.Scanner;

 class Node<T> {    
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
                    }
}

public class QueueUsingLL<T> {
    private Node<T> front ;
    private Node<T> rear ;
    private int size ;
	public QueueUsingLL() {
        front =null;
        rear = null;
        size=0;

	}

	public void enqueue(T data) {
    Node<T> newnode = new Node<>(data);
        if(size==0)
        {
            front = newnode;
            rear = newnode;
        }
        size++;
        front.next = newnode;
        front = front.next;
	}

	public int size() {
    return size;
	}

	public boolean isEmpty() {
        return(size==0);

	}

	public T dequeue() throws QueueEmptyException {
        if(size==0)
            throw new  QueueEmptyException();
        T temp = rear.data;
        rear = rear.next;
        size--;
        return temp;

	}

	public T front() throws  QueueEmptyException {
        if(size==0)
            throw new QueueEmptyException();
return rear.data;

	}
        public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		QueueUsingLL<Integer> st = new QueueUsingLL<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.enqueue(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.dequeue());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.front());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
	}
}