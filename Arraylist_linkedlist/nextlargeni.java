/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

public class nextlargeni {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
       LinkedListNode<Integer> temp =head;
        LinkedListNode<Integer> last = reverse(temp);
        
        if(last.data==9)
        {
            last.data =0;
            if(last.next.data==9) {
                LinkedListNode<Integer> newnode = new LinkedListNode<>(1);
                last.next.next = newnode;
                last.next.data =0;
              //  last = newnode;
            }
          else {  
          last.next.data = last.next.data+1;
          }
        }
        else
        {
            last.data = last.data+1;
        }
       LinkedListNode<Integer> ans = reverse(last);
        return ans;
	}
}
