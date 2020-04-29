/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

import com.sun.xml.internal.ws.util.localization.NullLocalizable;

/**
 *
 * @author sarthak sethi
 */
public class FunnyStrings {
    public static void main(String[] args) {
        System.out.println(funnyString("acxz"));
    }
    static String funnyString(String s) {
       
        int k=0;
        if(s.length()%2==0){ 
            int[] diff = new int[s.length()-2];
            for(int i=1;i<(s.length()/2);i++){
                diff[k] = Math.abs(s.charAt(i-1)-s.charAt(i));
                k++;
            }
            for(int i=(s.length()/2)+1;i<s.length();i++){
                diff[k] = Math.abs(s.charAt(i-1)-s.charAt(i));
                k++;
            }
            String check ="";
        for(int i=0;i<diff.length;i++)
            check+=diff[i];
        System.out.println(check);
        if(isPalindrome(check))
            return "Funny";
        else
            return "Not Funny";
        }
        else{
            int[] diff = new int[s.length()-1];
        for(int i=1;i<=s.length()/2;i++){
            diff[k] = Math.abs(s.charAt(i-1)-s.charAt(i));
            k++;
        }
        for(int i=(s.length()/2)+1;i<s.length();i++){
            diff[k] = Math.abs(s.charAt(i-1)-s.charAt(i));
            k++;
        }
         String check ="";
        for(int i=0;i<diff.length;i++)
            check+=diff[i];
        System.out.println(check);
        if(isPalindrome(check))
            return "Funny";
        else
            return "Not Funny";
        }
       
       
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
