/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

/**
 *
 * @author sarthak sethi
 */
public class TheLoveLetter_Mystery {
    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abcd"));
    }
     static int theLoveLetterMystery(String s) {
         int ans=0; 
             for(int i=0;i<s.length()/2;i++){
                ans+= Math.abs(s.charAt(i)-s.charAt(s.length()-i-1));
                 //System.out.println(ans);
             }
           return ans;
         }
       
    }

}
