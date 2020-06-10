/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TREES;

import Stack_Queue.QueueEmptyException;
import java.util.Scanner;
import Stack_Queue.QueueUsingLL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

 /**
 * @author sarthak sethi
 */
 class pair<T>{
     /*
      *  It is used in maximum sum node in this approach we need to compare the sum of the root and its children and 
      * return the root which have the maximum sum
      * 
      * 
      */
    
    TreeNode<T> root;
    T sum;
    pair(T data)
    {
        this.sum = data;
    }
}
public class TreeinputLevelWise {
    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		
         if(root==null)
             return null;
          if(root.children.size()==0)
              return null;
        ArrayList<Integer> indexes = new ArrayList<Integer>(); 
        for(int i = 0; i < root.children.size(); i++) { 
            TreeNode<Integer> child = root.children.get(i); 
            if(child.children.size() == 0) { 
                indexes.add(i);
                // vo wale index add kro Arraylist me jinpe padha children unka children ka size ==0 hai
            }
        }
        for(int i = indexes.size()-1; i >= 0; i--) { 
            int j = indexes.get(i);
            root.children.remove(j); 
            // reverse loop chalao and remove those indexes
            // reverse loop because agar seedhi lagaoge and root ke 3 children h 10 20 30 and 10 leafnode hai 20 bhi
            // so ab 10 remove krke i++ krenge to to 30 pe jaayega becasue 10 remove krke 20 ek peeche chala jaayega
        }
        
           for(int i=0;i<root.children.size();i++)
        {// recursion call on all children
           TreeNode<Integer> temp = removeLeafNodes(root.children.get(i));
            if(temp==null){
                root.children.remove(i);    
            }                
        }
      
 return root;           
	}
    public static void preorder(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		for (int i = 0; i < root.children.size(); i++) {
			preorder(root.children.get(i));
                       
		}
	}
    
    public static void postOrder(TreeNode<Integer> root){
        if(root==null)
            return;
        
	for(int i=0;i<root.children.size();i++)
    {
        postOrder(root.children.get(i));
    }
        System.out.print(root.data+" ");
        
	}

  
          public static void replaceWithDepthValue(TreeNode<Integer> root){/*
   * Replace node with depth
Send Feedback
In a given Generic Tree, replace each node with its depth value. You need to just update the data of each node, no need to return or print anything.
Input format :

Line 1 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 : (Level wise, each level in new line)
0 
1 1 1 
2 2
   */
              help(root,0);
	}
	 private static void help(TreeNode<Integer> root, int depth) 
         { // help for replacewith depth value
        root.data =depth;
        for(int i=0;i<root.children.size();i++)
        {
            help(root.children.get(i),depth+1);
        }
        
        }
    
    public static pair<Integer> maxSumNode2(TreeNode<Integer> root)
    {
        /*
         * Node having sum of children and node is max
Send Feedback
Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. 
* In the sum, data of node itself and data of immediate children is to be taken.
Input format :

Line 1 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : Node with maximum sum.

Sample Input 1 :
5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
Sample Output 1 :
1
         */
        
       pair<Integer> ans = new pair<>(root.data);
       ans.root = root;
       ans.sum = root.data;
        for(int i=0;i<root.children.size();i++)
        {
            ans.sum = ans.sum + root.children.get(i).data;
        }
        for(int i=0;i<root.children.size();i++)
        {
           pair<Integer> x  = maxSumNode2(root.children.get(i)); 
           if(x.sum>ans.sum)
           {
               ans = x;
           }
        }
        
      return ans; 
      
    }
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root)
    {
        TreeNode<Integer> ans = root;
        int sum=root.data;
        for(int i=0;i<root.children.size();i++)
        {
            sum = sum + root.children.get(i).data;
        }
         for(int i=0;i<root.children.size();i++)
         {
          TreeNode<Integer> x =  maxSumNode(root.children.get(i)); 
          int xsum = x.data;
          for(int j=0;j<x.children.size();j++)
          {
              xsum = xsum + x.children.get(j).data;
          }
         if(xsum>sum) 
         {
             ans = x;
         }
         }
         return ans;
    }
    public static int countLeafNodes(TreeNode<Integer> root){

        if(root.children.size()==0)
            return 1;
        int sum=0;
        for(int i=0;i<root.children.size();i++)
        {
            sum = sum + countLeafNodes(root.children.get(i));
        }
    return sum;
	}
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
        
     boolean ans=false;    
        if(root1.children.size()!=root2.children.size())
        {
            ans = false;
            return ans;
        }
        if(root1.data==root2.data)    {
            ans = true; }
        for(int i=0;i<root1.children.size();i++)
    {
         ans =  checkIdentical(root1.children.get(i),root2.children.get(i));
    }
        return ans;
	}
    public static void printnodeatk(TreeNode<Integer> root,int k )
    {
        //Depth of a node is defined as the distance from the node
        //Depth of root is zero 
        //height is of tree and depth is for individual nodes 
        
        //For example if K is 1 we need to do is that we should say the children of the root to print the depth of those nodes
        //whose depth is zero
        
 //similarly if K is 4 we should say the children of the roOT to print the depth of the nodes whose depth 
        //is 4 we will use recursion
      
 //k=0 is the base case
        
        if(k<0)
            return;
        if(k==0)
            System.out.println(root.data);
        for(int i=0;i<root.children.size();i++)
        {
            printnodeatk(root.children.get(i),k-1);
        }
    }
    
    public static int height(TreeNode<Integer> root){
         int height=0;
        if(root==null)
            return height;
        for(int i=0;i<root.children.size();i++)
        {
            int childheight = Math.max(height,height(root.children.get(i)));
            // max from all the childrens height and adding 1 for root height should give ans
            if(childheight>height)
                height = childheight;
            // comparing previous child and new child
        }
        return height+1;// adding 1 to childheight
	}
    
    public static int numofNodeGreaterthanx(TreeNode<Integer> root,int x){
	    int count=0;
        if(root.data>x){
            count++;
        }
        for(int i=0;i<root.children.size();i++)
        {
             count=count+numofNodeGreaterthanx(root.children.get(i),x);
             //children me kitne nodes hai 
        }
    return count;
	}
    public static int sumOfAllNode(TreeNode<Integer> root){
    	int sum = root.data;
        for(int i=0;i<root.children.size();i++)
        {
            sum = sum+  sumOfAllNode(root.children.get(i));
            //child ka sum and root
        }
        return sum;
	}
    public static int largestnode(TreeNode<Integer> root)
    {   if(root==null)
        return Integer.MIN_VALUE; // way to return minus infinity
    int ans = root.data;
    for(int i=0;i<root.children.size();i++)
    {
        int largest = largestnode(root.children.get(i));
        if(largest>ans)
            ans = largest;
    }//if previous node/child is smaller than next child node change ans
        return ans;
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
    public static TreeNode<Integer> takeinput()
    {
        Scanner s = new Scanner(System.in);
        int rootdata;
        System.out.println("enter root data");
        rootdata = s.nextInt();
       QueueUsingLL <TreeNode<Integer>> pendingnode = new QueueUsingLL<>(); // queue is of treenode type
       // queue created in which we will keep all the pending nodes full stop the pending note signify 
       //the number of nodes Jinke children Nahin poochhe.  
       TreeNode<Integer> root = new TreeNode<>(rootdata);
       pendingnode.enqueue(root);
       //creating rootnode and adding it in queue
       while(!pendingnode.isEmpty()) // jab tak queue is not empty 
       {
           TreeNode<Integer> frontnode;
            try {
                frontnode = pendingnode.dequeue(); // top most element of queue is popped out
                System.out.println("enter number of children for "+frontnode.data);
                // here front node is root now ans we are asking for no of childre for root
                int numchildren = s.nextInt();
                for(int i=0;i<numchildren;i++)
                {
                    System.out.println("enter"+(i+1)+" th child of "+frontnode.data);
                    int child = s.nextInt();
                    TreeNode<Integer> childnode = new TreeNode<>(child);//chils of root
                    frontnode.children.add(childnode);// child added to Arraylist of root as its his children
                    pendingnode.enqueue(childnode);//Since we need to ask the children….. of the children of the child node 
                    //we will enqueue the child node in the queue
                }
            } catch (QueueEmptyException ex) {
                Logger.getLogger(TreeinputLevelWise.class.getName()).log(Level.SEVERE, null, ex);
                //this will never work yaha kabhi nhi aayega
            }
           
       }
       return root;
     }
    
     public static void print(TreeNode<Integer> root)
   {
      QueueUsingLL <TreeNode<Integer>> pendingnode = new QueueUsingLL<>();
        pendingnode.enqueue(root);
        pendingnode.enqueue(null);
        //String childs = "";
       while(!pendingnode.isEmpty())
       {      
            try {     
                TreeNode<Integer> frontnode = pendingnode.dequeue();
                if(frontnode==null)
                {
                    if(pendingnode.size()!=0)
                {
                    pendingnode.enqueue(null);
                }
                  System.out.println();
                }
                       else
                    {
                           System.out.print(frontnode.data + " ");
                          for(int i=0;i<frontnode.children.size();i++)
                        {         pendingnode.enqueue(frontnode.children.get(i));
                   // childs = childs+frontnode.children.get(i).data+" ";     
                        }       
                    }
            }
            
            catch (QueueEmptyException ex) {
                //Logger.getLogger(TreeinputLevelWise.class.getName()).log(Level.SEVERE, null, ex);
            }
           
       }    
   }
     public static void printuse(TreeNode<Integer> root)
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
           printuse(root.children.get(i));
           //har child kr liye print call krdo taaki unke children print ho ske 
       }
   }
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         TreeNode<Integer> root =takeinput();
        // printuse(root);
         //System.out.println(largestnode(root));
         //printnodeatk(root,2);
        TreeNode<Integer> ans= removeLeafNodes(root);
        print(ans);
    }

   
}
