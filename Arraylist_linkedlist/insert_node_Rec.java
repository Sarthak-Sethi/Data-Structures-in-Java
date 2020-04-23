/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

/**
 *
 * @author sarthak sethi
 */
public class insert_node_Rec extends reverse_Best {
    
    public static LinkedListNode<Integer> insertrecursive(LinkedListNode<Integer> head,int pos,int elem)
    {
        if(pos ==0)
        {
            LinkedListNode<Integer> newnode = new LinkedListNode<Integer>(elem);
            newnode.next = head;
            return newnode;
        }
        if(head==null)
        return head; // to check if the postion is valid kyunki null.next nhi aayega null pointer exception aayegi
        LinkedListNode<Integer> smallhead = insertrecursive(head.next,pos-1,elem);
        head.next = smallhead;
        return head;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = reverse_Best.takeinput();
        insertrecursive(head,2,2);
        reverse_Best.print(head);
    }
    
}
