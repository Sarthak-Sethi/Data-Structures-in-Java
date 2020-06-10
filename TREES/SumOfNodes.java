/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TREES;

import Stack_Queue.QueueEmptyException;
import Stack_Queue.QueueUsingLL;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class SumOfNodes {
    public static int sumOfAllNode(TreeNode<Integer> root){
    	int sum = root.data;
        for(int i=0;i<root.children.size();i++)
        {
            sum = sum+  sumOfAllNode(root.children.get(i));
        }
        return sum;
	}
    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>(); 
                // Queue of node that are entered themselves but their children aren't added yet
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
		System.out.println(sumOfAllNode(root));
	}
    
}
