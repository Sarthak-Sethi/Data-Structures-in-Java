/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author sarthak sethi
 */
public class StrongPassword {
    static int minimumNumber(int n, String s) {
        // Return the minimum number of characters to make the password strong
        int hasdigit = 0;
        int hasuppercase= 0;
        int haslowercase=0;
        int haspsecialchar=0;
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);        
           if(Character.isDigit(ch) && hasdigit!=1)
                hasdigit = 1;
                else if(Character.isUpperCase(ch) && hasuppercase!=1)
                hasuppercase =1;
                else if(Character.isLowerCase(ch) && haslowercase!=1)
                haslowercase=1;
        } 
        Pattern patternSpecial = Pattern.compile("(\\W)");
            Matcher matcherSpecial = patternSpecial.matcher(s);
            boolean b = matcherSpecial.find();
            if(b){
                haspsecialchar = 1;
            }
        if(n>=6)
        return 4-(hasdigit+haspsecialchar+haslowercase+hasuppercase);
        else {
            int missing = 4-(hasdigit+haspsecialchar+haslowercase+hasuppercase);
            if(6-n<(missing))
            return missing;
            else {
                return 6 - n;
            }
            }
        }

    
}
