class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str=s.split("\\s+");
    for(int i=0;i<str.length;i++){
        str[i]=new StringBuilder(str[i]).reverse().toString();
    }
        return String.join(" ",str).trim();
    }
}