/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

import java.util.*;


/**
 *
 * @author sarthak sethi
 */
public class SuperReducedStrings {
   
    public static void main(String[] args) {
    String s = "baab";
        System.out.println(superReducedString(s));
    }
   
    static String superReducedString(String s) {
     Stack<Character> stack = new Stack<>();
     String ans ="";
    if(s.isEmpty())
        return "Empty String";
    for(int i=0;i<s.length();i++){
        if(!stack.isEmpty() && stack.peek()==s.charAt(i))
            stack.pop();
        else
        stack.add(s.charAt(i));
    }
    if(stack.isEmpty())
        return "Empty String";
    else{
        
        while(!stack.isEmpty())
            ans+=stack.pop();
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        return sb.toString();
        
    }
    //return ans;
    }
              
    }

