class Solution {
    public void moveZeroes(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[res]=nums[i];
                res++;
            }
            
        }

        for(int i=res;i<nums.length;i++)
        {
            nums[i]=0;
        }

        System.out.println(Arrays.toString(nums));
        
    }
}