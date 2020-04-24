/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class Remove_duplicates {
    public static ArrayList<Integer> removeduplicates(int[] a)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
             if(!map.containsKey(a[i]))
             {
                  ans.add(a[i]);
                  map.put(a[i],true);        
             }    
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,5,1000,4,4,4,5,20,30,4,5,6,20,1000,1000,5,50};
       
        ArrayList<Integer> ans = removeduplicates(a);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
        
        
    }
    
}
