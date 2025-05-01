class Solution {
    public int lengthOfLongestSubstring(String str) {
         int s=0;
        int e=0;
        int max=0;
        ArrayList<Character> list=new ArrayList<>();
        while(e<str.length()){
            if(!list.contains(str.charAt(e))){
                list.add(str.charAt(e));
                e++;
                max=Math.max(max,e-s);
            }
            else{
                list.removeFirst();
                s++;
            }

        }
        return max;
    }
}