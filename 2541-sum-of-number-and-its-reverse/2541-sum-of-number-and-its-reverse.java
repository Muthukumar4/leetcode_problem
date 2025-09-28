class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }
        for(int i=0;i<num;i++){
            if(i+reverse(i)==num){
                return true;
            }
        }
        return false;
    }

    static int reverse(int nums){
        int ans=0;
        while(nums>0){
            int rem=nums%10;
            ans=ans*10+rem;
            nums/=10;
        }
        return ans;
    } 
}