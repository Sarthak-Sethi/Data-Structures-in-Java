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
public class AbsolutePermutation {
    public static void main(String[] args) {
        int[] ans = absolutePermutation(10, 1);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
     static int[] absolutePermutation(int n, int k) {
        if(k==0){
            int[] ans = new int[n];
            for(int i=0;i<n;i++)
            ans[i] = i+1;
            return ans;
        }
        int[] ans = new int[n];
        int[] pos = new int[n];       
         HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i+1,true);
            pos[i] = i+1;
        }
//         System.out.println(map);
//          for(int i=0;i<pos.length;i++)
//            System.out.print(pos[i]+" ");
        int p=0;
        for(int i=0;i<n;i++){
            boolean done = false;
            //System.out.println("it comes here");
            try{
            if(map.containsKey(Math.abs(pos[i]-k)) && map.get(pos[i]-k)){
                done = true;
         System.out.println("map has found "+Math.abs(pos[i]-k)+" for element "+pos[i]);
                    ans[p] = Math.abs(pos[i]-k);
                    p++;
                    map.put(Math.abs(pos[i]-k),false);
            }
            }
            catch(NullPointerException ne){
                done = true;
               if(map.containsKey(Math.abs(pos[i]+k)) && map.get(pos[i]+k)){
                ans[p] = Math.abs(pos[i]+k);
                    p++;
                    map.put(Math.abs(pos[i]+k),false);
               }
            }
            if(!done){
            try{
                
            if(map.containsKey(Math.abs(pos[i]+k)) && map.get(pos[i]+k)){
                System.out.println("map has found "+Math.abs(pos[i]+k)+" for element "+pos[i]);
                ans[p] = Math.abs(pos[i]+k);
                    p++;
                    map.put(Math.abs(pos[i]+k),false);
            }
                
            }
            catch(NullPointerException ne){
                if(map.containsKey(Math.abs(pos[i]-k)) && map.get(pos[i]-k)){
                    ans[p] = Math.abs(pos[i]-k);
                    p++;
                    map.put(Math.abs(pos[i]-k),false);
            } 
            }
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i] ==0){
                int[] temp = new int[1];
                temp[0] = -1;
                return temp;
            }
        }
        return ans;
    }
}
