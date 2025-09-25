class Solution {
    public int subarraySum(int[] nums, int k) {
        int pre=0;
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            pre=0;
            for(int j=i;j<nums.length;j++){

            
            pre+=nums[j];     
            if(pre==k){
                count++;
            } 
            }
        }
            return count;
    
}
}