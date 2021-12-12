private static boolean getSubsetWithGivenSum(int[] nums,int sum,int n){
  // if no sum to find
        if(sum==0)
            return true;
        boolean[][] dp = new boolean[n+1][sum+1];
       for(int i=0;i<dp.length;i++){
           for(int j=0;j<dp[0].length;j++){
             // i is the elements in array jinko use krke sum banana
             // i=o means koi element use nhi kr rhe
             //j=0 means 0 sum banana
             // so if 0 sum banana bina koi element use kiye , thats possible
               if(i==0 && j==0)
                   dp[i][j] = true;
             // if koi bhi element use kiye binaa, kuch bhi banana possible nhi so set false
               else if(i==0)
                   dp[i][j] = false;
             // making zero is possible ,
               else if(j==0)
                   dp[i][j] = true;
               else {
                 // i-1 mtlb to check if we can make a sum without using te ith number,
                 // mtlb hamari upar wali team hamare bina bana skti hai kyaa , agar yes to bas
                   if(dp[i-1][j])
                       dp[i][j] = true;
                   else {
                     // agar hamare upar wali team nhi bana skti, to 
                     // hum mtlb i kitna bna skti , that value is in i
                     // since i started from 0 and 0 means koi elemet use nhi kr rhe, so i=1 is the first element, 
                       int val = nums[i-1];
                 // val mtlb lgaao lo humne 9 banana and abhi hum jis i pe h vo 7 bana skta so we will check if rest of the team can make 2
                     // rest of the team, can make 2 runs means
                     // i-1 means rest of the team, and since we need 9 and we are at 7 so we need to check for 9-7 which is j - 7 since val is jaha hum hain
                       if(j>=val){
                           dp[i][j] = dp[i-1][j-val];
                       }
                   }
               }
           }
       }
        return dp[n][sum];
    }
