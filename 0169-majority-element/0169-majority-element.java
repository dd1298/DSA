class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt =  1;
        int majority = nums[0];
        for(int i = 1; i < n; i++) {
            if(nums[i] == majority) {
                cnt++;
            }
            else {
                if(cnt > 0) {
                    cnt--;
                }
                else if(cnt == 0) {
                    majority = nums[i];
                    cnt = 1;
                }
            }
        }
        return majority;
    }
}