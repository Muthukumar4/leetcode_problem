class Solution {
    public boolean isSameAfterReversals(int num) {
        int rem,res=0,res1=0,temp=num;
        while(temp!=0){
            rem=temp%10;
            res=res*10+rem;
            temp/=10;
        }
         while(res!=0){
            rem=res%10;
            res1=res1*10+rem;
            res/=10;
        }
        
        return (num==res1);

    }
}