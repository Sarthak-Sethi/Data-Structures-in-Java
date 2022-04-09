
class Solution {
     HashMap<Integer,Integer> map = new HashMap<>();
  // comparator sorts on the basis of frequency of occurance of elements
    class SortOnFreq implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        if(map.get(a)>map.get(b))
            return -1;
        else if(map.get(a) == map.get(b))
            return 0;
        else 
        return 1;
    }
}
    public int[] topKFrequent(int[] arr, int k) {
      // storing elements wth freq in hashmap
        for(int i : arr) 
            map.put(i,map.getOrDefault(i,0)+1);
      // getting the keys from the array as [1,1,1,1,2,2,2,3,3] the keys are [1,2,3]
      List<Integer> nums = new ArrayList<>(map.keySet());
      // sorting on the basis of freq in reverse order 
        Collections.sort(nums,new SortOnFreq());
      // formatting the answer as per the leetcode type to a array
        int[] ans = new int[k];
    for(int i=0;i<k;i++) 
        ans[i] = nums.get(i);       
        return ans;
    }
}

