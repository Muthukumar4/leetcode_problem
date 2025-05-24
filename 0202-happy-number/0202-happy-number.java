class Solution {
    public boolean isHappy(int num) {
         int slow=num;
        int fast=num;
        do {
            slow=numbersqr(slow);
            fast=numbersqr(numbersqr(fast));
        }while (slow!=fast);
        if(slow==1){
            return true;
        }
        else {
            return false;
        }
    }
    static int numbersqr(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}