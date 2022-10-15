class Solution {
    long countStrings(int n) {
   /* 
           Meaning - at every index of dp array we will store no of strings which end at 0 and whicend at 1, so we will make 2 1d arrays
                     now for the next index , since we dont want consectice 1's, 
                     no of string end at 0 dpz[i] = no of string end at 0, at prev index dpz[i-1] +  no of string end with 1, at prev indexd dpo[i-1];
                     dp1[i] = , for string ending with 1, we cannt consider prev string which end with 1, kyunki fr consetvie 1ho jaayenge naa, 
                     dp1[i] = no of string ending with 0, at prev index dpz[i-1];
                     
         That was array approach, but do we really need to store all values ? , to calcaute the answer at every index, we just need the old count 
         of string ending with 0 and old count of string  ending with 1
         
         So we only store oz (old zero) and o1 (old ones)
   */
        long oz = 1;
        long o1 = 1;
        for(int i=2;i<=n;i++) {
          // now we create nz and n1, 
            long nz = (oz + o1)%1000000007;
            long n1 = oz%1000000007;
          // now they have become old, hence updating
            oz = nz;
            o1 = n1;
        }
      // want to return modulo
        return (oz + o1)%1000000007;
    }
}
