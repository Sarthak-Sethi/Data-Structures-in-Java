/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving.GFG;

import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class Printallprime_Eiveofethosis {
    public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i= 0 ;i<t;i++){
		    int n = s.nextInt();
		    Eratosthenes(n);
		    System.out.println();
		}
	}
	public static void Eratosthenes(int n){
	    boolean check[] = new boolean[n+1];
	    int limit = (int)Math.sqrt(n);
	    for(int i=2;i<=limit;i++){
	        if(!check[i]){
	            for(int j=i+1;j<=n;j++){
	                if(j%i==0){
	                    check[j]= true;
	                }
	            }
	        }
	    }
	    for(int i=2;i<check.length;i++){
	        if(!check[i])
	        System.out.print(i+" ");
	    }
	}
}
