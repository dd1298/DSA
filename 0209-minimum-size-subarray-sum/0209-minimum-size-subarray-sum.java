class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i,j;
        int n = nums.length;
        i = 0;
        j = 0;
        int sum = 0;
        int minLength = n+1;
        while(j < n && i <= j) {
            sum += nums[j];
            while(sum >= target) {
                minLength = Math.min(minLength, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        if(minLength == n+1) {
            return 0;
        }
        else {
            return minLength;
        }
    }
}