package codeshef;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class hashmap_collection_pe_stream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	System.out.println(isIsomorphic("aabbcc", "def"));
     //  HashSet<Object> set =  hash_map.values().stream().map(p -> p.toString()).collect(Collectors.toCollection(HashSet::new));
      
		//System.out.println(set);
      System.out.println(7/2);
      System.out.println();
		
	}
	 public static boolean isIsomorphic(String s, String t) {
	        HashMap<Character,Integer> map = new HashMap<>();
	        HashMap<Character,Integer> map2 = new HashMap<>();
	        HashMap<Integer,Integer> valmap = new HashMap<>();
	        for(int i=0;i<s.length();i++){
	            if(map.containsKey(s.charAt(i))) {
	                map.put(s.charAt(i),map.get(s.charAt(i))+1);
	            }
	            else
	                map.put(s.charAt(i),1);
	        }
	        
	        for(int i=0;i<t.length();i++){
	            if(map2.containsKey(t.charAt(i))) {
	                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
	            }
	            else
	                map2.put(t.charAt(i),1);
	        }
	        System.out.println(map);
	        System.out.println(map2);
	       
	        for(Integer i : map.values()) {
	        	
	        	if(valmap.containsKey(i)) {
	        		valmap.put(i, valmap.get(i)+1);
	        	}
	        	else
	        		valmap.put(i, 1);
	        	System.out.println(valmap);
	        }
	        for(Integer i : map2.values()) {
	        	if(valmap.containsKey(i)) {
	        		valmap.put(i, valmap.get(i)-1);
	        		if(valmap.get(i)<0)
	        			return false;
	        	}
	        	else {
	        		return false;
	        	}
	        }
	        return true;
	      
	    }
}
