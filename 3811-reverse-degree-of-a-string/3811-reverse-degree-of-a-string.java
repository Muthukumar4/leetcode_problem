class Solution {
    public int reverseDegree(String str) {
                int sum=0;
       
        for (int i = 0; i <str.length() ; i++) {

            int ans=123-str.charAt(i);
            System.out.println(ans);
            sum+=(i+1)*ans;
        }
        return sum;
    }
}