package codeshef;
import java.util.*;
public class harmonious_subseq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = {1,1,1,1};
		Arrays.sort(nums);
		Arrays.stream(nums).forEach((no) -> { System.out.print(no+" "); } );
		System.out.println(findLHS(nums));
	}
	 public static int findLHS(int[] nums) {
	        Arrays.sort(nums);
	        int ans = 0;
	        int i=0;
	        while(i<nums.length){
	            int curr_ans = 1;
	            System.out.println("for "+nums[i]);
	            if(i+1<nums.length) {
	            	int j = i+1;
	            for(; j<nums.length && nums[j]-nums[i]<=1 ; j++){
	            	System.out.println(nums[j]+" > "+nums[i]+" j is "+j);
	                curr_ans+=1;
	            }
	            System.out.println("j after loop "+j);
	            if(curr_ans>ans  && (nums[j-1]-nums[i])==1) {
	              System.out.println("ans "+ans);
	            	ans = curr_ans; 
	            }
	            }
	            i++;
	        }
	        return  ans;
	    }
}
