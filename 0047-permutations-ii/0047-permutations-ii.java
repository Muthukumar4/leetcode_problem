class Solution {
    public List<List<Integer>> permuteUnique(int[] num) {
        List<List<Integer>>outer=new ArrayList<>();
        strperum(num,0, num.length-1 ,outer);
        return outer;
    }

        static void strperum(int[] ch, int l, int r, List<List<Integer>>outer){
            if(l==r){
                List<Integer> list=new ArrayList<>();
                for (int num:ch){
                    list.add(num);
                }
                outer.add(list);
                return ;
            }
            for(int i=l;i<=r;i++){
                if(shouldswap(ch,l,i)){
                swap(ch,l,i);
                strperum(ch,l+1,r,outer);
                swap(ch,l,i);
                }
            }
        }
        static boolean shouldswap(int[]ch,int l,int r){
            for(int i=l;i<r;i++){
                if(ch[i]==ch[r]){
                    return false;
                }
            }
            return true;
        }
        static void swap(int[] ch,int l,int h) {
            if (l != h) {
                int temp = ch[l];
                ch[l] = ch[h];
                ch[h] = temp;
            }
        }
    }
