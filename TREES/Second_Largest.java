/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TREES;

/**
 *   /*
                 * Second Largest Element In Tree
Send Feedback
Given a generic tree, find and return the node with second largest value in given tree. 
* Return NULL if no node with required value is present.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output format:
Second Largest node data
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
40
                 */
 import java.util.ArrayList;
import java.util.Scanner;
class double2<T> {
    TreeNode<Integer> max;
TreeNode<Integer> smax;
}

 class QueueEmptyException extends Exception {
}

 class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

    
 class Second_Largest {

	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise(){
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for(int i = 0 ; i < numChild; i++){
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}


	public static void main(String[] args) {
		TreeNode<Integer> root =  takeInputLevelWise();
		TreeNode<Integer> ans = findSecondLargest(root);
		if(ans == null){
			System.out.println(Integer.MIN_VALUE);
		}else{
			System.out.println(ans.data);
		} 
	}

  public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
     
      double2<Integer> ans = helper(root);
      return ans.smax;
      
   
	}
	public static double2<Integer> helper (TreeNode<Integer> root)
    {
     double2<Integer> ans = new double2<>();
      ans.max=root;
      ans.smax = null;
        for(int i=0;i<root.children.size();i++)
        {
        double2<Integer> temp = helper(root.children.get(i));
        if(temp.max.data>ans.max.data)
        {
            TreeNode<Integer> store =ans.max;
            
            if(ans.smax ==null && temp.smax == null)
                ans.smax = ans.max;
            
            if(ans.smax == null && temp.smax!=null)
            {
                if(store.data>temp.smax.data)
                    ans.smax = store;
                else
                 ans.smax = temp.smax;
            }
            if(temp.smax==null)
                ans.smax = store;
            
            if(temp.smax.data>ans.max.data)
                ans.smax = temp.smax;
            else
                ans.smax = ans.max;
            
            ans.max= temp.max;
        }
        else
        {
            if(temp.max.data>ans.smax.data)
                ans.smax = temp.max;
                
            if(ans.smax == null && temp.smax == null)
                ans.smax = temp.max;
            
            if(ans.smax == null && temp.smax!=null)
                ans.smax = temp.smax;
            
            if(temp.max.data>ans.smax.data)
                ans.smax = temp.smax;
           
        }
        }
        return ans;
    }
	

}

