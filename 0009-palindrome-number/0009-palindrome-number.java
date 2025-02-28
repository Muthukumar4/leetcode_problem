class Solution {
    public boolean isPalindrome(int x) {
        int rem,res=0,ori=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            rem=x%10;
            res=res*10+rem;
            x/=10;
        }
        return ori==res;
    }
}