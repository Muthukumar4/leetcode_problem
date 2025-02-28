class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
        int sum1;
        sum1=nums[0]*nums[1]*nums[nums.length-1];
        int sum2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int max=Integer.MIN_VALUE;
        max=Math.max(sum1,sum2);
        return max;
    }
}