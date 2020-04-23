/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

import java.util.LinkedList;

public class LL_implementation {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.size();
        list.add(10); // creating node and adding element at the end
        list.add(20);
        list.addFirst(5); // adding elem at start
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
             // print the elements;
        }
        list.set(1,100); //set 100 at 1st position
        //System.out.println(list.size());
        list.toArray();//will convert ll into aray
        list.getClass();
    }
    
}
