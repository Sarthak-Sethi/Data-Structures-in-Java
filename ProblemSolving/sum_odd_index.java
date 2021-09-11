package codeshef;
import java.util.*;
import java.util.stream.IntStream;
public class sum_odd_index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arrayPairSum(new int[] {10,9,8,7,6,5,4,3,2,1});
		OptionalInt ans = Arrays.stream(new int[] {6,2,6,5,1,2}).sorted().skip(5-1).findFirst();
	System.out.println(ans);
		//	System.out.println(arrayPairSum_stream(new int[] {6,2,6,5,1,2}));
	}
	
	public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans =0;
        for(int i=0;i<nums.length;i+=2)
            ans+=nums[i];
        return ans;
    }
	
}
