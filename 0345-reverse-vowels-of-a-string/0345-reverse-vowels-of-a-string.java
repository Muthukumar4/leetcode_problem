import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
       
        int l=0,r=ch.length-1;
        while(l<r){
            while(  l < r && !list.contains(ch[l])){
                l++;
            }
            while(  l < r && !list.contains(ch[r])){
                r--;
            }
            if(l<r){
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}