/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.HashMap;

/**
 *
 * @author sarthak sethi
 */
public class Anagram {
     static int anagram(String s) {
        int ans =0;
        if(s.length()%2!=0)
        return -1;
        // char[] a = s.toCharArray();
        // Arrays.sort(a,0,(a.length/2));
        // Arrays.sort(a,a.length/2,a.length);
        // for(int i=0;i<a.length;i++)
        // System.out.print(a[i]+" ");
        // for(int i=0;i<(a.length)/2;i++){
        //     if(a[i]!=a[(a.length/2)+i])
        //     ans+=1;
        // }
        HashMap<Character,Integer> map = new HashMap<>();
       for(int i=0;i<s.length()/2;i++)
       {
           if(map.containsKey(s.charAt(i))){
              int temp =  map.get(s.charAt(i));
              temp+=1;
              map.put(s.charAt(i),temp);
           }
           else{
               map.put(s.charAt(i),1);
           }
       }

       for(int i=s.length()/2;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
               int temp = map.get(s.charAt(i));
               if(temp == 0){
                   ans+=1;
               }
               else {
                   temp-=1;
                   map.put(s.charAt(i),temp);
               }
           }
           else {
               ans+=1;
           }
       }
    
    return ans;
    }
}
