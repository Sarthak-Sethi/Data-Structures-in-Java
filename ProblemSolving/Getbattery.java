package ProblemSolving;


import Arraylist_linkedlist.Arraylist;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarthak sethi
 */
public class Getbattery {
    public static void main(String[] args) {
        System.out.println(getBattery(null));
    }
   public static int getBattery(List<Integer> list) {
    // Write your code here
       int ans = 50;
    for(int i=0;i<list.size();i++){
        if(ans+list.get(i)>=100)
            ans = 100;
        else
        ans+=list.get(i);
    }
    return ans;
    }

}
