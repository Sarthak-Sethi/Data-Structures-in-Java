
class Solution {
    public int maxArea(int[] arr) {
        int max = 0;
        int left = 0;
        int right = arr.length - 1;
        while(right>left){
            int len = right - left;
            int breadth = Math.min(arr[left], arr[right]);
            int area = len*breadth;
            max = Math.max(area,max);
            if(arr[left]>arr[right]) 
                right--;
            else if(arr[right]>arr[left])
                left++;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
