package codeshef;

import java.util.*;
public class lift_requests {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		  int t = sc.nextInt();
	        for(int i=0;i<t;i++){
	        	 int n = sc.nextInt();
	             int q = sc.nextInt();
	             int[][] arr = new int[q][2];
	             for(int j=0;j<q;j++) {
	            	 arr[j][0] = sc.nextInt();
	            	 arr[j][1] = sc.nextInt();
	            	 sc.nextLine();
	             }
	              lift(arr,n,q);
	        }
	       sc.close();
	}

	private static void lift(int[][] arr, int n, int q) {
		int curr = 0;
		  Long  ans = (long) 0;
		for(int i=0;i<q;i++) {
			ans+=Math.abs(curr-arr[i][0]);
			curr = arr[i][0];
			ans+=Math.abs(curr - arr[i][1]);
			curr = arr[i][1];
		}
		System.out.println(ans);
	}

}
