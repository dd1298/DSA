class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i,j;
        i = 0;
        j = n-1;
        int maxWater = Integer.MIN_VALUE;
        while(i < j) {
            maxWater = Math.max(maxWater,(j-i)*(Math.min(height[i],height[j])));
            if(height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return maxWater;
    }
}