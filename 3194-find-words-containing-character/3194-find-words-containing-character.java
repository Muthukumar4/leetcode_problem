class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list=new ArrayList<>();
        int k=0;
        for(String word:words){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==x){
                    list.add(k);
                    break;
                }
            }
            k++;
        }
        return list;
    }
}