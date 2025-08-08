class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSumSubarray = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            maxSumSubarray = Math.max(sum,maxSumSubarray);
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSumSubarray;
    }
}