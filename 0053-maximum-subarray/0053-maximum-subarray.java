class Solution {
    public int maxSubArray(int[] nums) {
        int csu=nums[0];
        int ma=nums[0];
        for(int i=1;i<nums.length;i++){
            csu=Math.max(nums[i],csu+nums[i]);
            ma=Math.max(ma,csu); 
        }
        return ma;
    }
}