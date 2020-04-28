/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRIORITY_QUEUE;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class MinPriorityQueue  {
    private ArrayList<Integer> heap;

    public MinPriorityQueue() {
        heap = new ArrayList<>();
    }
    public boolean  isEmpty(){
        return heap.isEmpty();
    }
    public int size(){
        return heap.size();
    }
    public int getMin() throws PriorityQueueException{
         if(isEmpty()){
	throw new PriorityQueueException();
		}
         else
        return heap.get(0);
    } 
    public void insert(int element){
        heap.add(element);
        int childindex = heap.size()-1;
        int parentindex = (childindex-1)/2;
        while(childindex>0){
            if(heap.get(childindex) < heap.get(parentindex)){
                int temp = heap.get(childindex);
                heap.set(childindex, heap.get(parentindex));
                heap.set(parentindex, temp);
                childindex = parentindex;
                parentindex = (childindex-1)/2;
            }
            else{
                return ;
            }
        }
    }
    int removeMin() throws PriorityQueueException {
        if(isEmpty()){
	throw new PriorityQueueException();
		}
        int temp = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
         heap.remove(heap.size()-1);
         int index = 0;
        int minindex = index;
        int leftchildindex = 2*minindex+1;
        int rightchildindex = 2*minindex+2;
        while(leftchildindex<heap.size()){
            if(heap.get(leftchildindex)<heap.get(minindex))
                minindex = leftchildindex;
            // there is a possibility ki rightchildindex naa ho 
            // check this rightchildindex<heap.size() 
            //leftchild to hoga hi becasuse thats the while loop condition
            
            if(rightchildindex<heap.size() && heap.get(rightchildindex)<heap.get(minindex))
                minindex= rightchildindex;
            if(minindex==index)
            {
                // this means ki left ya right are not smaller than root
                // nas break krdo kuch nhi krna
                break;
            }
            else{
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minindex));
                heap.set(minindex, temp1);
                index = minindex;
                leftchildindex = 2*index+1;
                 rightchildindex = 2*index+2;
            }

        }
        return temp;  
    }
    public static void main(String[] args) {
		MinPriorityQueue pq = new MinPriorityQueue();
                Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		while(choice != -1) {
			switch(choice) {
				case 1 : // insert
					int element = s.nextInt();
					pq.insert(element);
					break;
				case 2 : // getMin
				try {
					System.out.println(pq.getMin());
				} catch (PriorityQueueException e) {
					System.out.println(Integer.MIN_VALUE);
					return;
				}
					break;
				case 3 : // removeMin
				try {
					System.out.println(pq.removeMin());
				} catch (PriorityQueueException e) {
					System.out.println(Integer.MIN_VALUE);
					return;
				}
					break;
				case 4 : // size
					System.out.println(pq.size());
					break;
				case 5 : // isEmpty
					System.out.println(pq.isEmpty());
				default :
						return;
			}
			choice = s.nextInt();
		}
	}

}
