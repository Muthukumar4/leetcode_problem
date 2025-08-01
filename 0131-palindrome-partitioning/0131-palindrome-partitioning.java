class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> list=new ArrayList<>();
        partition(s,0,list,res);
        return res;
    }
     void partition(String str,int indx,List<String> list,List<List<String>> res){
        if(indx==str.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = indx; i < str.length() ; i++) {
            if(isPalin(str,indx,i)){
               list.add(str.substring(indx,i+1));
               partition(str, i+1, list, res);
               list.remove(list.size()-1);
            }

        }
    }

    boolean isPalin(String str, int st, int end) {
        while(st<=end){
            if(str.charAt(st++)!=str.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}