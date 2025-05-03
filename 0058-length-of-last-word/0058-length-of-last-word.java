class Solution {
    public int lengthOfLastWord(String s) {
        String str1=s.stripTrailing();
       int count=0;
        for (int i = str1.length()-1; i >=0 ; i--) {
            if(str1.charAt(i)!=' '){
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}