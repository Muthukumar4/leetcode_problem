import java.math.*;
class Solution {
    public String addStrings(String str, String str1) {
       BigInteger num1=new BigInteger(str);
       BigInteger num2=new BigInteger(str1);
       return String.valueOf(num1.add(num2));

    }
}