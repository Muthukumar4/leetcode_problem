class Solution {
    public String removeTrailingZeros(String num) {
        ArrayList<Character>list=new ArrayList<>();
        for (int i = num.length()-1; i >=0 ; i--) {
            if(num.charAt(i)!='0'){
                for (int j = 0; j <=i ; j++) {
                    list.add(num.charAt(j));
                }
                break;
            }
        }
        String str="";
        for (char ch:list){
            str+=ch;
        }
        return str;
    }
}