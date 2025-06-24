class Solution {
    public boolean isValid(String str) {
        Stack<Character> st=new Stack<>();
       for (int i = 0; i <str.length(); i++) {
           if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
               st.push(str.charAt(i));
           }
           else {
               if(st.empty()){
                   return false;
               }
               char ch=st.peek();
               st.pop();
               if((str.charAt(i)==')'&& ch=='(')||(str.charAt(i)=='}'&& ch=='{')||(str.charAt(i)==']'&& ch=='[')){
                   continue;
               }
               else{ return false;}

           }
       }
       return st.empty();
    }
}