 public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int n = nums.length;
        int nearest = nums[0]+nums[1] +nums[n-1];
        for(int i=0;i<n-2;i++){
           int si = i+1;
            int ei = n-1;
            while(ei>si){
                int curr_sum = nums[i] + nums[si]+nums[ei];
                if(curr_sum> target) 
                    ei-=1;
                else
                    si+=1;
            nearest =Math.abs(curr_sum-target)>Math.abs(nearest-target) ? nearest :curr_sum;
            }
        }
        return nearest;
    }
