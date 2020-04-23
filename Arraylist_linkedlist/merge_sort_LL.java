
package Arraylist_linkedlist;
import java.util.Scanner;
//class LinkedListNode<T> {
//	public T data;
//	public LinkedListNode<T> next;
//
//	public LinkedListNode(T data) {
//		this.data = data;
//		this.next = null;
//	}
//}

 class Runner {
	private static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data != -1) {
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

	public static void main(String[] args) {

		print(merge_sort_LL.mergeSort(input()));

	}
}


public class merge_sort_LL   {
  public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		// write your code here
        if(head.next==null)
            return head;
       
        LinkedListNode<Integer> middle = printMiddel(head);
       // System.out.print(middle.data);
        LinkedListNode<Integer> head2 = middle.next;
    middle.next=null;
         LinkedListNode<Integer> left=mergeSort(head);
         LinkedListNode<Integer> right=mergeSort(head2);
        return mergeTwoList(left,right);
        
 
      
	}
    public static LinkedListNode<Integer> printMiddel(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> temp = head;
        int mid =0,trav=0;
        while(fast.next!=null)
        {   
            slow= slow.next;
            mid++;
            if(fast.next.next == null)
               break;
            fast = fast.next.next;
            if(fast.next == null)
                break;
        }   
        while(trav<mid-1) 
        {   
            temp = temp.next; 
            trav++;
        }
        return temp;

}
 public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
	
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
    
    

