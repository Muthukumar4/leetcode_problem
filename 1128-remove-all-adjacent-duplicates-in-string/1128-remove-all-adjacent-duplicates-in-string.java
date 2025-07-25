class Solution {
    public String removeDuplicates(String str) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<str.length()){
            if(st.empty()){
            st.push(str.charAt(i));
            i++;
            continue;
            }
            if(st.peek()==str.charAt(i)){
                st.pop();
            }
            else{
                st.push(str.charAt(i));
            }
            i++;
        }
         StringBuilder sb = new StringBuilder();

        while (!st.empty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
    
}