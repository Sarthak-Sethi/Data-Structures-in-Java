/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.HashMap;
import sun.java2d.pipe.AlphaColorPipe;

/**
 *
 * @author sarthak sethi
 */
public class PallindromeIndex {
     
    public static void main(String[] args) {
        System.out.println( palindromeIndex("baa"));
        HashMap<Character,Integer> map = new HashMap<>();
        map.containsKey(map);
        
   
}
    
     static int palindromeIndex(String s) {
         int ans =-1;
        if(isPalindrome(s))
        return ans;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                if(i+1<s.length()){
                    if(isPalindrome(s.substring(i+1,s.length()-i)))
                        return i;
                        return s.length()-i-1;
            }
        }     
    } return ans;
     }
     
     static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        }
        return true; 
    }
}