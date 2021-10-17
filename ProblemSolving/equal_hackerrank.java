package codeshef;
import java.util.*;
public class equal_hackerrank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
	   public static int equal(List<Integer> arr) {
		    // Write your code here
		    int[] poss = new int[5];
		    int min = arr.stream().min(Integer::compare).get().intValue();
		    for(int i=0;i<5;i++){
		        for(int k : arr){
		            int diff = k- min;
		            int step = diff/5 + (diff%5)/2 + ((diff%5)%2)/1 ;
		            poss[i]+=step;
		        }
		        min--;
		    }
		    return Arrays.stream(poss).min().getAsInt();
		    }
}
