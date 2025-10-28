class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] ans=new int[arr.length];
        int posind=0,negind=1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<0){
                ans[negind]=arr[i];
                negind+=2;
            }
            else {
                ans[posind]=arr[i];
                posind+=2;
            }
        }
        return ans;
    }
}