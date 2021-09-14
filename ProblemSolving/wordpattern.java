package codeshef;
import java.util.*;
public class wordpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}
	 public boolean wordPattern(String pattern, String s) {
	        HashMap<Character,String> map = new HashMap<>();
	        HashSet<String> set = new HashSet<>();
	        String[] arr = s.split(" ");
	        if(arr.length!=pattern.length())
	            return false;
	        for(int i=0;i<pattern.length();i++){
	            if(map.containsKey(pattern.charAt(i))){
	                if(!map.get(pattern.charAt(i)).equals(arr[i])) 
	                    return false;
	            }
	            else {
	                if(set.contains(arr[i])){
	                    return false;
	                }
	                else {
	                     map.put(pattern.charAt(i),arr[i]);
	                set.add(arr[i]);
	                }
	            }
	        }
	     //   System.out.println(map);
	        return true;
	    }
}
