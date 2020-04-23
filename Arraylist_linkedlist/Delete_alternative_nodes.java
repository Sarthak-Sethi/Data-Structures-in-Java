/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

/**
 *
 * @author sarthak sethi
 */
public class Delete_alternative_nodes {
    public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
        head = deleteAlternate(head);

	}
    public static LinkedListNode<Integer> deleteAlternate(LinkedListNode<Integer> head)
    {
        if(head==null || head.next==null )
        {
            return head;
        }
        
      LinkedListNode<Integer> smallans = deleteAlternate(head.next.next);
        head.next = smallans;
        return head;
    }
    
}
