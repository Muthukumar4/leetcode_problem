class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int var:nums){
            if(even(var)){
                count++;
            }
        }
        return count;
    }
     static boolean even(int var) {
        if(var<0){
            var=var*-1;
        }
        int num=(int)(Math.log10(var))+1;
        return num%2==0;
    }
}