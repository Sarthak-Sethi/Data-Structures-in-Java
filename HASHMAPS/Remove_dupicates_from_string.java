/*
 * To change this template, choose Tools Templates
 * and open the template in the editor.
 */
package HASHMAPS;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class Remove_dupicates_from_string {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String uniChars = uniqueChar(s.next());
		System.out.println(uniChars);
	}

    private static String uniqueChar(String str) {
        HashMap<Character,Boolean> map = new HashMap<>();
        String ans ="";
        for(int i=0;i<str.length();i++)
        {
           if(map.containsKey(str.charAt(i))) 
           {
             continue;  
           }
           else
           {
               ans = ans+str.charAt(i);
               map.put(str.charAt(i),true);
           }
               
        }
        return ans;
        
    }
}
