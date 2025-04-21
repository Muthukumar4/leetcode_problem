class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int num=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            list.add(nums[i]);
            if(count>n/2){
                num=nums[i];
            }
        }
        return num;
    }
}