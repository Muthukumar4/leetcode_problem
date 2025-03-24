class Solution {
    public int vowelStrings(String[] words, int left, int right) {
          int count=0;
        ArrayList<Character> list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        for (int i = left; i <=right ; i++) {
            String word=words[i];
                if (list.contains(word.charAt(0)) && list.contains(word.charAt(word.length()-1))) {
                    count++;
                }
        }
        return count;
    
    }
}