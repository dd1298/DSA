class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(nums[i]) == false) {
                map.put(nums[i],i);
            }
        }
        for(int i = 0; i < n; i++) {
            int x = target - nums[i];
            if(map.containsKey(x) && map.get(x) != i) {
                return new int[]{i,map.get(x)};
            }
        }
        return new int[]{};
    }
}