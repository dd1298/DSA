class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultTemp = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int target = -nums[i];
            int j = i+1;
            int k = n-1;
            
            while(j < k) {
                if(nums[j] + nums[k] == target) {
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    resultTemp.add(temp);
                    temp = new ArrayList<>();
                    j++;
                    k--;
                    //break;
                }
                else if(nums[j] + nums[k] > target) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        for(List<Integer> s : resultTemp) {
            result.add(s);
        }
        return result;
    }
}