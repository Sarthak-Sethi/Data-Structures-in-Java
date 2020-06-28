/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author sarthak sethi
 */ 
import java.util.*;
import java.lang.*;
import java.io.*;
public class CheckPower {
  
		public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		for(int j=0;j<q;j++){
		    int x = s.nextInt();
		    int y= s.nextInt();
		    if(y==1){
		         System.out.println(1);
		    }
		    else if(x==1 && y!=1){
		         System.out.println(0);
		        
		    }
		    else if(y<x){
		        System.out.println(0);
		    }
		    else {
		     int res1 = (int)(Math.log(y)/Math.log(x));
		       double res2 = Math.log(y)/Math.log(x);
		       if(res1 == res2)
		       System.out.println(1);
		       else
		        System.out.println(0);
		       
		    }
		}
	}
	}
	

