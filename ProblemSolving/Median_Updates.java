package ProblemSolving;

import java.util.Scanner;

import Binary_Tree.BinaryTreeNode;

/**
 *
 * @author sarthak sethi
 */
public class Median_Updates {
    static BinaryTreeNode<Integer> root=null;
    static int noofnodes = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            char type = s.next().charAt(0);
            int num = s.nextInt();
            if(type == 'a'){
                add(num);
            }
            else {
                delete(num);
            }
        }
    }

    private static void add(int num) {
        noofnodes+=1;
      root = insert(root,num);
      if(noofnodes%2==0){
          double avg = 1.0*(root.data+root.right.data)/2*1.0;
          System.out.println(avg);
      }
      else 
        System.out.println(root.data);
    }

    private static void delete(int num) {
        if(hasdatahelp(num, root)) {
        root = deletedatahelp(num,root);
        noofnodes-=1;
        if(noofnodes%2==0 && root!=null && root.right!=null){
            double avg = 1.0*(root.data+root.right.data)/2*1.0;
          System.out.println(avg);
        }
        else if(root!=null) {
            System.out.println(root.data);
        }
        }
        else {
            System.out.println("Wrong!");
        }
    }
    static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            BinaryTreeNode<Integer> newnode = new BinaryTreeNode<Integer>(data);
           return newnode;
        }
        if(data>=root.data){
            if(root.right!=null){
               root.right =  insert(root.right,data);
            }
            else{
                BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(data);
                root.right = right;
            }
        }
        else if(data<root.data){
            if(root.left!=null){
                 root.left = insert(root.left,data);
            }
            else{
                BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(data);
                root.left = left;
            }
        }
        return root;
    }
       private static BinaryTreeNode<Integer> deletedatahelp(int data, BinaryTreeNode<Integer> root) {
        if(root==null)
            return null; 
        if(data>root.data)
             root.right=deletedatahelp(data,root.right);
       else if(data<root.data)
             root.left =deletedatahelp(data,root.left);
        else
       {
           if(root.left==null && root.right==null)
               return null;
           else if(root.left==null)
               return root.right;
           else if(root.right==null)
               return root.left;
           else
           {
               int max = max(root.right);
               root.data=max;
               root.right=deletedatahelp(max,root.right);
           }   
       }
        return root;
    }
      public static boolean hasdatahelp(int data,BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return false;
        if(root.data == data)
            return true;
        else if(data>root.data)
              return hasdatahelp(data,root.right);
        else
              return hasdatahelp(data,root.left);
    }
       public static int max(BinaryTreeNode<Integer> root) {
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }
}
