class Solution {
    public double myPow(double base, int pow) {
         double ans=1.0;
         long power=pow;
        if(power<0){
            power=-power;
             while (power > 0) {
                if ((power & 1) == 1) {
                    ans *= base;
                }
                base *= base;
                power = power >> 1;
            }
            return 1.0/ans;
        }
       else{
            while (power > 0) {
                if ((power & 1) == 1) {
                    ans *= base;
                }
                base *= base;
                power = power >> 1;
            }
       }
        return ans;
    }
}