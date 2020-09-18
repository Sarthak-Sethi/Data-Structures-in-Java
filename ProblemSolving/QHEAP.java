
package ProblemSolving;

import java.util.*;
/**
 *
 * @author sarthak sethi
 */
public class QHEAP {
    static ArrayList<Integer> heap = new ArrayList<>();
            public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
       for(int i=0;i<q;i++){
             int choice = s.nextInt();
            switch(choice) {
                case 1 :
                int element = s.nextInt();
                add(element);
                break ;
                case 2 :
                int element2 = s.nextInt();
                delete(element2);
                    break ;
                case 3 :
                System.out.println(minimum());
                    break ;
            }
        }
    }

    private static void add(int element) {
        //System.out.println("in add");
        heap.add(element);
        int childindex = heap.size()-1;
        int parentindex = (childindex-1)/2;
        while(childindex>0){
        if(heap.get(childindex)<heap.get(parentindex)){
            int temp = heap.get(childindex);
            heap.set(childindex, parentindex);
            heap.set(parentindex, temp);
            childindex = parentindex;
            parentindex = 2*childindex + 1;
        }
        else {
            return ;
        }
        }
    }

    private static void delete(int element) {
       // System.out.println("in del");
        int index = 0;
       for(int i=0;i<heap.size();i++){
           if(heap.get(i) == element){
               index = i;
           }
       }
        System.out.println("deleted element is "+heap.get(index));

        heap.set(index, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int minindex = index;
        int leftchildindex = 2*minindex+1;
        int rightchildindex = 2*minindex+2;
        while(leftchildindex<heap.size())
        {
            if(heap.get(leftchildindex)<heap.get(minindex))
                minindex = leftchildindex;
            if(rightchildindex<heap.size() && heap.get(rightchildindex)<heap.get(minindex))
                minindex= rightchildindex;
            if(minindex==index)
            {
                break;
            }
            else{
                int temp1 = heap.get(index); // jo 0 pe h
                heap.set(index, heap.get(minindex)); // 0 pe min set kiya
                heap.set(minindex, temp1); // jaha se min liya waha 0 wala set
                index = minindex;
                leftchildindex = 2*index+1;
                 rightchildindex = 2*index+2;
            }

        }       
        for(int i=0;i<heap.size();i++)
            System.out.println("heap is "+heap.get(i)+"  ");
    }
    private static int minimum(){
        //System.out.println("in munimum");
            return heap.get(0); 
    }   
}
