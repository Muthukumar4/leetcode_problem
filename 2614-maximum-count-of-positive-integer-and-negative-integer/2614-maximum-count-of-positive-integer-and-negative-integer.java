class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int var:nums){
            if(var>0){
                pos++;
            }
            if(var<0){
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
}