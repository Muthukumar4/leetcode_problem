class Solution {
    public int countOperations(int num1, int num2) {
        return helper1(num1,num2,0);
    }

     static int helper1(int num1, int num2, int op) {
        if(num1==0 || num2==0){
            return 0;
        }
        if(num1-num2==0){
            return op+1;
        }
        if(num1<num2){
            return helper1(num1,num2-num1,op+1);
        }
        return helper1(num1-num2,num2,op+1);
     
    }
}