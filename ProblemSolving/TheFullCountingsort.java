/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;
import  java.util.*;
/**
 *
 * @author sarthak sethi
 */
public class TheFullCountingsort {
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//int arr[] = new int[100];
		StringBuilder str[] = new StringBuilder[100];
		for(int i=0;i<100;i++){
			str[i] = new StringBuilder();
		}
		for (int i = 0; i < n; i++) {
			int no  = in.nextInt();
			String s = in.next();
				//arr[no]++;
				if (i <n/2) {
					str[no].append("- ");
				} else {
					str[no].append(s+" ");
				}
			
		}
		for(int i=0;i<100;i++){
			 System.out.print(str[i]);
		}   
}
}
