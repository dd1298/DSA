class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int pfSum = 0;
        int cnt = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            pfSum += nums[i];
            // if(pfSum == k) {
            //     cnt++;
            // }
            int x = pfSum - k;
            if(mp.containsKey(x)) {
                cnt += mp.get(x);
            }
            mp.put(pfSum,mp.getOrDefault(pfSum,0)+1);
        }
        return cnt; 
    }
}