class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pfsum = new int[n];
        int i;
        int left,right;
        pfsum[0] = nums[0];
        for(i = 1; i < n; i++) {
            pfsum[i] = pfsum[i-1] + nums[i]; 
        }
        for(i = 0; i < n; i++) {
            left = 0;
            right = 0;
            if(i == 0) {
                left = 0;
            }
            else {
                left = pfsum[i-1];
            }
            right = pfsum[n-1] - pfsum[i];
            if(left == right) {
                return i;
            }
        }
        return -1;
    }
}