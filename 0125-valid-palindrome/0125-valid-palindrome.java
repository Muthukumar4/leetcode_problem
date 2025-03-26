class Solution {
    public boolean isPalindrome(String str) {
        if(str=="null" || str.isEmpty()){
            return false;
        }
          int l=0;
        int r=str.length()-1;
        while (l<r){
            while (l<r && !Character.isLetterOrDigit(str.charAt(l))){
                l++;
            }
            while (l<r && !Character.isLetterOrDigit(str.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(str.charAt(l))!=Character.toLowerCase(str.charAt(r))){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
    }
