/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAPS;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class pair_sum_to_0 {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}		
		PairSum(arr, n);
	}

    private static void PairSum(int[] arr, int size) {
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++)
        {
                    if(map.containsKey(arr[i]))
                    {
                        int a = map.get(arr[i]);
                        a=a+1;
                        map.put(arr[i],a);
                    }
                if(arr[i]>0)
                {
                    if(map.containsKey(-arr[i]))
                    { 
                    for(int j=0;j<map.get(-arr[i]);j++)
                    System.out.println("-"+arr[i]+" "+arr[i]);  
                    }
                    else
                        map.put(arr[i],1);
                }
                else
                {
                     if(map.containsKey(-arr[i]))
                     {
                      for(int j=0;j<map.get(-arr[i]);j++)
                     System.out.println(arr[i]+" "+-arr[i]); 
                     }
                          
                     else
                        map.put(arr[i],1);
                }
            }
                
        }
    }
    
    

