class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res=(n*(n+1)/2);
        int sum=0;
        for(int a:nums)
        {
            sum=sum+a;
        }
        int var=res-sum;
        return var;
    }
   
}