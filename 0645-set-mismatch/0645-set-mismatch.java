class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int missing = -1;
        int duplicate = -1;
        int sum = 0;
        int newSum = 0;
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(hashSet.contains(nums[i])) {
                duplicate = nums[i];
                break;
            }
            hashSet.add(nums[i]);
        }
        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }
        sum -= duplicate;
        for(int i = 1; i <= n; i++) {
            newSum += i;
        }
        missing = newSum - sum;
        return new int[]{duplicate,missing};
    }
}