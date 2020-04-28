/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRIORITY_QUEUE;

/**
 *
 * @author sarthak sethi
 */
public class Inplace_HeapSort_Descending {
    // min priority queue is used
    public static void main(String[] args) {
        int a[] = {5,1,9,0,0,6};
        for(int i=0;i<a.length;i++){
            insert_into_same_heap(a,i);
        }
        for(int i=0;i<a.length;i++){
           a[a.length-1-i]= remove_and_add_in_last(a,a.length-i);
            //initaly array is full heap is full
            //after 1 removal
            /*
             * heap we remove ho rha so heap size reduces but array size remains same
             * as heap se remove krke last me daal rhe
             */
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    private static void insert_into_same_heap(int[] a, int i) {
        int childindex = i;
        int parentindex = (childindex-1)/2;
        while(childindex>0){// same logic as in min priority queue
            if(a[childindex]<a[parentindex]){
                int temp = a[childindex];
                a[childindex] = a[parentindex];
                a[parentindex] = temp;
                childindex = parentindex;
                parentindex = (childindex-1)/2;
            }else
                return ;
        }
        // after insertion all elements stored in the form of heap
        // they are not sorted but in heap
        // which meansa[0] has minimum;// 0 1 6 5 2 9
        // remove the elemnts from heap and store in last
    }

    private static int remove_and_add_in_last(int[] a, int heapsize) {
        int temp = a[0]; // store the minimum 
        a[0] = a[heapsize-1];
        heapsize--;
        int index =0;
        int minindex = index;
        int leftchildindex = 1;
        int rightchildindex = 2;
        while(leftchildindex<heapsize){
            if(a[leftchildindex]<a[minindex])
                minindex = leftchildindex;
            if(a[rightchildindex]<a[minindex])
                minindex = rightchildindex;
            if(minindex==index)
                break;
            else{
                int temp1 = a[index];
                a[index] = a[minindex];
                a[minindex] = temp1;
                index = minindex;
                leftchildindex = 2*index+1;
                rightchildindex = 2*index+2;
            }
        }
        return temp;
    }

   
    
}
