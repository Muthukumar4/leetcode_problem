class Solution {
    public int strStr(String haystack, String needle) {
          if(haystack.contains(needle)){
            int sum=haystack.indexOf(needle);
            return sum;
        }
        return -1;
    }
}