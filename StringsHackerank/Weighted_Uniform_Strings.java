/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author sarthak sethi
 */
public class Weighted_Uniform_Strings {
    public static void main(String[] args) {
      String s =  "aaabbbbcccddd";
      int[] queries = {5,9,7,8,12,5};
       String[] ans =  weightedUniformStrings(s, queries);
       for(int i=0;i<ans.length;i++)
            System.out.println(ans[i]);
    }
     static String[] weightedUniformStrings(String s, int[] queries) {
      
     }
}
