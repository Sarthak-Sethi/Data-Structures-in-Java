/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author sarthak sethi
 */
public class Count_valley {
    static int countingValleys(int n, String s) {
        int i=0,ans=0,pos = 0;
        boolean up = false;
       for(i=0;i<s.length();i++){
           if(s.charAt(i)=='D'){
               pos-=1;
               up = false;
           }
           else {
               pos+=1;
               up = true;
           }
           if(pos==0 && up){
               ans+=1;
           }
       }
        return ans;
    }
}
