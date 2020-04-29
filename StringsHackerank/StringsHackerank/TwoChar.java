/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;
import java.util.HashMap;
/**
 *
 * @author sarthak sethi
 * // in a string find the maximum sum of 2 consective characters in  english alphabet 
 *                   
 */
public class TwoChar {
   
    public static void main(String[] args) {
        String s = "asvkugfiugsalddlasguifgukvsa";
        System.out.println(twocharalt(s));
    }
    public static int twocharalt(String s){ 
        String nonduplicates="" ;
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
               int temp = map.get(s.charAt(i));
               temp+=1;
               map.put(s.charAt(i), temp);
            }else{
               nonduplicates+=s.charAt(i);
            map.put(s.charAt(i), 1);
            }
        }
       // System.out.println(nonduplicates);
 
            System.out.println(map);
        
        for(int i=0;i<nonduplicates.length();i++){
            int canbeans=0;
            char tofind = nonduplicates.charAt(i);
            char tofind1 = tofind-=1;
            char tofind2 = tofind+=2;
            if(map.containsKey(tofind1)){
                canbeans = map.get(tofind1)+map.get(nonduplicates.charAt(i));
                if(ans<canbeans)
                    ans = canbeans;
            }
            if(map.containsKey(tofind2)){
                canbeans = map.get(tofind2)+map.get(nonduplicates.charAt(i));
                if(ans<canbeans)
                    ans = canbeans;
            }
        }
        return ans;
    }
}

