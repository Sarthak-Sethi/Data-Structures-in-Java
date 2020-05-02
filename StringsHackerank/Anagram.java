/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

import java.util.HashMap;

/**
 *
 * @author sarthak sethi
 */
public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("lbafwuoawkxydlfcbjjtxpzpchzrvbtievqbpedlqbktorypcjkzzkodrpvosqzxmpad"));
        String s = "lbafwuoawkxydlfcbjjtxpzpchzrvbtievqbpedlqbktorypcjkzzkodrpvosqzxmpad";
        System.out.println(s.substring(33));
    }
     static int anagram(String s) {
        int ans =0;
        if(s.length()%2!=0)
        return -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length()/2;i++){
            if(map.containsKey(s.charAt(i))){
                int temp = map.get(s.charAt(i));
                temp+=1;
                map.put(s.charAt(i),temp);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)))
            ans+=1;
            else{
                int temp = map.get(s.charAt(i));
                temp-=1;
                if(temp==0)
                map.remove(s.charAt(i));
            }
        }
    return ans;
    }
}
