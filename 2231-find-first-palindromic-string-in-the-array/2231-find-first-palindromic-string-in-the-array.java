class Solution {
    public String firstPalindrome(String[] words) {
           for (String var:words){
            if(sec(var)){
                return var;
            }
        }
        return "";
    }
    static boolean sec(String str){
        int l=0;
        int r=str.length()-1;
        while (l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    }
