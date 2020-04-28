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
public class MaxPriorityQueue {
    ArrayList<Integer> heap;

    public MaxPriorityQueue() {
        heap = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        MaxPriorityQueue mpq = new MaxPriorityQueue();
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        while(choice!=-1){
            switch(choice){
            case 1 : // insert
                    int element = s.nextInt();
                    mpq.insert(element);
                    break;
            	case 2 : // getMax
			System.out.println(mpq.getMax());
			break;
		case 3 : // removeMax
                    System.out.println(mpq.removeMax());
                    break;
		case 4 : // size
                    System.out.println(mpq.getSize());
                    break;
		case 5 : // isEmpty
                    System.out.println(mpq.isEmpty());
		default :
                    return;  
            }
            choice = s.nextInt();
        }
    }
    public boolean isEmpty(){
        return heap.isEmpty();
    }
    public int getSize(){
        return heap.size();
    }
    public int getMax(){
        if(heap.isEmpty())
            return Integer.MIN_VALUE;
        return heap.get(0);
        
    }
    public void insert(int element){
        heap.add(element);
        int childindex = heap.size()-1;
        while(childindex>0) {
            int parentindex = (childindex-1)/2;
            if(heap.get(parentindex)>heap.get(childindex)) {
                return ;
            }else{ 
            int temp = heap.get(childindex);
            heap.set(childindex,heap.get(parentindex));
            heap.set(parentindex,temp);
            childindex = parentindex;
            }
        }
        
    }
    public int removeMax() {
        if(heap.isEmpty())
           return Integer.MIN_VALUE; 
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int index = 0;
        int maxindex = index;
        int leftchildindex = 1;
        int rightchildindex = 2;
        while(leftchildindex<heap.size()){
            if(heap.get(leftchildindex)>heap.get(maxindex))
                maxindex = leftchildindex;
             if(rightchildindex<heap.size() && heap.get(rightchildindex)>heap.get(maxindex))
                maxindex = rightchildindex;
             if(maxindex==index)
                 break;
             else{
                 int temp1 = heap.get(maxindex);
                 heap.set(maxindex, heap.get(index));
                 heap.set(index, temp1);
                 index = maxindex;
                 leftchildindex = 2*index+1;
                 rightchildindex = 2*index+1;
             }        
        }
        return temp;
    }
}
