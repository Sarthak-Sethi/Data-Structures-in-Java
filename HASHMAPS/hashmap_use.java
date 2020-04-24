/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAPS;

import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author sarthak sethi
 */
public class hashmap_use {
    public static void main(String[] args) {
           HashMap<String, Integer> map = new HashMap<>();
		// insert
		map.put("abc",1);
		map.put("def", 23);
		map.put("abc1",1);
		map.put("def1", 2);
	
                map.get(Collections.max(map.values()));
        
		}
}
