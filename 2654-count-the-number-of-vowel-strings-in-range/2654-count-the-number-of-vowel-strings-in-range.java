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

            char vo=words[i].charAt(0);
            if (words[i].length()<=1){
                if (list.contains(vo)){
                    count++;
                }
            }
            else {
                char vo1 = words[i].charAt(words[i].length()-1);
                if (list.contains(vo) && list.contains(vo1)) {
                    count++;
                }
            }
        }
        return count;
    
    }
}