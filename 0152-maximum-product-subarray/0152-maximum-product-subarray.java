class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int n = nums.length;
        int pro = 1;
        for(int i = 0; i < n; i++) {
            pro *= nums[i];
            maxProduct = Math.max(maxProduct, pro);
            if(pro == 0) {
                pro = 1;
            }
        }
        pro = 1;
        for(int i = n-1; i >= 0; i--) {
            pro *= nums[i];
            maxProduct = Math.max(maxProduct, pro);
            if(pro == 0) {
                pro = 1;
            }
        }
        return maxProduct;
    }
}


//[2,3,-2,4]
//6
//4
//[-2,0,-1]
//0
//[10,-5,-5,20,40]
//130
//800
