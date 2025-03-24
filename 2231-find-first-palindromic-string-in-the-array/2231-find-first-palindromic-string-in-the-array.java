class Solution {
    public String firstPalindrome(String[] words) {
         for(String var:words){
           StringBuilder str= new StringBuilder();
           for (int i =var.length()-1; i >=0; i--) {
               str.append(var.charAt(i));
           }
           if(var.contentEquals(str)){
               return var;
           }

       }
        return "";
    }
}