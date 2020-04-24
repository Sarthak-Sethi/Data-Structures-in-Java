/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class intersection_of_2_arrays {
        public static void intersection(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
// agar nhi h to add krdo
            }
            else{
                map.put(arr1[i],map.get(arr1[i])+1);
                // agar h to ek baar plus one

            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(map.containsKey(arr2[i])&&map.get(arr2[i])>0){
                System.out.println(arr2[i]);
                map.put(arr2[i],map.get(arr2[i])-1);
                // ek kam krdo 
            }
        }
    }
        static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1, arr2);
	}
    
}
