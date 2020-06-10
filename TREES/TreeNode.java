/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TREES;

import java.util.ArrayList;

/**
 *
 * @author sarthak sethi
 */
public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;
    
        public TreeNode(T data)
        {
            this.data = data;
            children = new ArrayList<>();
            //Arraylist is used save the address of the all the children's in the case of linked list we had to store only 
            //one address but in the case of trees we need to save the multiple addresses of the children so we can save 
            //that in two ways we can either used a array or a linked list but if we use and linkedlist then to Excess fifth 
            //children we need to travel from the first to the fifth and only problem in array is that we have to predefined 
            //the size of the array so to overcome that we can use arraylist which stores the address of the all the children's
            //of the root node 

        }
}
    
