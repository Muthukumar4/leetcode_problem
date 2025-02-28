class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1,diff=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]<nums[j]){
                    diff=nums[j]-nums[i];
                }
            
            max=Math.max(max,diff);
        }
        }
        return max;
    }
}