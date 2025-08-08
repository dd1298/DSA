class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint = -1;
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                breakPoint = i;
                break;
            }
        }
        if(breakPoint == -1) {
            Arrays.sort(nums);
            return;
        }
        for(int i = n-1; i >= breakPoint+1; i--) {
            if(nums[breakPoint] < nums[i]) {
                int t = nums[breakPoint];
                nums[breakPoint] = nums[i];
                nums[i] = t;
                break;
            }
        }
        int i = breakPoint+1;
        int j = n-1;
        while(i < j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}



//[1,2,3]
//