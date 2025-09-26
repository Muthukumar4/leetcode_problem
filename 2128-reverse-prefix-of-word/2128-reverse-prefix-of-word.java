class Solution {
    public String reversePrefix(String str, char ch) {
       for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                return reverse(0,i,str);
               
            }
        }
        return str;
    }
    static String reverse(int st,int en,String str){
        StringBuilder sb=new StringBuilder(str);
        while(st<en){
            char ch=sb.charAt(st);
            sb.setCharAt(st,sb.charAt(en));
            sb.setCharAt(en,ch);
            st++;
            en--;

        }
        return sb.toString(); 
    }
}