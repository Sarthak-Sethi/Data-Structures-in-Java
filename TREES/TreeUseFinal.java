/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TREES;

import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class TreeUseFinal {
     public static TreeNode<Integer> takeinput(Scanner s)
   {
       int n;
       n= s.nextInt();
       TreeNode<Integer> root = new TreeNode<>(n); // data for root of tree
        int childcount = s.nextInt();
       for(int i=0;i<childcount;i++)
       {
           TreeNode<Integer> child = takeinput(s);
           root.children.add(child);
       }
       
       return root;
   }
     public static int numofnodes(TreeNode<Integer> root)
     {
         if(root==null)
             return 0;
         int count=1;
         for(int i=0;i<root.children.size();i++)
         {
             count += numofnodes(root.children.get(i));
         }
         return count;
     }
   public static void print(TreeNode<Integer> root)
   {
       String s = root.data+":";
       for(int i=0;i<root.children.size();i++)
       {
        s= s+root.children.get(i).data+",";
        //Root ke andar Jo link list Hai Uske Har index per Ek child pada hai Har child Ke Data ko print karne ke liye 
        //yah command hai 
        //this will print the child of root
       }
       System.out.println(s);
       for(int i=0;i<root.children.size();i++)
       {
           print(root.children.get(i));
           //har child kr liye print call krdo taaki unke children print ho ske 
       }
   }
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         TreeNode<Integer> root =takeinput(s);
         print(root);
    }
}
