/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRIORITY_QUEUE;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author sarthak sethi
 */
class MaxPQ implements  Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
       if(o2>01)
           return 1;
       else if (o2<01)
           return -1;
           return 0;
    }
    
}
class strlengthcompare implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()<o2.length())
            return -1;
        else if(o1.length()>o2.length())
            return 1;
        else
            return 0;
    }
    
}
public class UsingInbuiltPQ {
    // by default min priority queue is there when we write
    public static void main(String[] args) {
        String[] s = {"my","Name","is","Sarthak"};
        MaxPQ maxPQ = new MaxPQ();
        PriorityQueue<Integer> pq = new PriorityQueue<>(10,Collections.reverseOrder());
        strlengthcompare slc = new strlengthcompare();
         PriorityQueue<String> pqs = new PriorityQueue<>(10,slc);
         for(int i=0;i<s.length;i++){
             pqs.add(s[i]);
         }
         while(!pqs.isEmpty())
             System.out.println(pqs.remove());
    }
    
}
