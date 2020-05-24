/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.*;


public class almostsorted { 
    // Almost sorted
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] input = new int[n];
    	int[] sorted = new int[n];
    	for (int i = 0; i < n; i++) {
    		input[i] = sc.nextInt();
    		sorted[i] = input[i];
    	}
    	Arrays.sort(sorted);
    	ArrayList<Integer> wrongList = new ArrayList<Integer>();
    	for (int i = 0; i < n; i++) {
    		if (input[i] != sorted[i]) {
    			wrongList.add(i);
    		}
    	}
    	int m = wrongList.size();
    	if (m == 0) {
    		System.out.println("yes");
    		return;
    	}
    	if (m == 2) {
    		System.out.println("yes\n swap"+(wrongList.get(0)+1)+" "+(wrongList.get(1)+1));
    		return;
    	}
    	int start = wrongList.get(0);
    	int stop = wrongList.get(m - 1);
    	int i = start;
    	int j = stop;
    	for (i=start; i < j; i++, j--) {
    		int temp = input[i];
    		input[i] = input[j];
    		input[j] = temp;
    	}

    	boolean equality = true;
    	for (int r = 0; r < n; r++) {
    		if (input[r] != sorted[r])
    			equality = false;
    	}

    	if (equality) {
    		System.out.println("yes\n reverse"+wrongList.get(0)+1+" " +wrongList.get(m-1)+1);
    	} else {
    		System.out.println("no");
    	}
    }
}

