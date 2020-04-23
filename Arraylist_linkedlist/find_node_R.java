/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

/**
 *
 * @author sarthak sethi
 */
public class find_node_R {
public static int indexOfNRec(LinkedListNode<Integer> head, int n) {	
        if(head==null )
        return -1;
        if(head.data ==n) 
            return 0 ; 
        if(head.next==null)
            return -1; 
       
        int smallans = indexOfNRec(head.next,n);
        if(smallans!=-1)
            return smallans+1;
        else
            return -1;
        
	}
    public static void main(String[] args) {
        LinkedListNode<Integer> head = reverse_Best.takeinput();
        int ans = indexOfNRec(head,2);
        System.out.println(ans);
    }
}
