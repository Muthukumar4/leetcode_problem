class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp=new int[nums.length];
        int key=0;
        k=k%nums.length;
        
            //System.out.print(Arrays.toString(nums));
        
        for (int i = nums.length-k; i < nums.length  ; i++) {
            temp[key]=nums[i];
            key++;
        }
        for (int i = 0; i < nums.length-k; i++) {
            temp[key]=nums[i];
            key++;
        }
        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
        
        
        System.out.println(Arrays.toString(temp));
    }
}