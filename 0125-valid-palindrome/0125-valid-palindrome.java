class Solution {
    public boolean isPalindrome(String str) {
         String str1="";
        str=str.toLowerCase();
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLetterOrDigit(str.charAt(i))){
             str1+= String.valueOf(str.charAt(i));
            }
        }
       
        return ispaldro(str1);
    }
    static boolean ispaldro(String str){
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
