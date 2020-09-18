package ProblemSolving.GFG;

import java.util.Scanner;

public class RankOfMatrix {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[][] a = new int[3][3];
		for(int i=0;i<t;i++){
		    for(int j=0;j<3;j++){
		        for(int k=0;k<3;k++){
		            a[j][k] = s.nextInt();
		        }
		    }
		    //int ans = ;
		System.out.println(findRank(a));
		}
		
	}
	private static int findRank(int[][] a){
	    int op =  ((a[0][0]*(a[2][2]*a[1][1] - a[2][1]*a[1][2])) -
	              (a[0][1]*(a[2][2]*a[1][0] - a[2][0]*a[1][2])) +
	              (a[0][2]*(a[2][1]*a[1][0] - a[2][0]*a[1][1]))) ;
	              if(op==0){
	                  int op2 = (a[1][1]*a[0][0] - a[1][0]*a[0][1]);
	                  if(op2==0)
	                  return 1;
	                  else
	                  return 2;
	              }
	              else
	              return 3;
	}
}