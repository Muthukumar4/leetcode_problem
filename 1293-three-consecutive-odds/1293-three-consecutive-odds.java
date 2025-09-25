class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       // Arrays.sort(arr);
        int i=0;
        int j=i+1;
        int k=j+1;
        while(k<arr.length){
            if((arr[i]&1)==1 && (arr[j]&1)==1 && (arr[k]&1)==1){
                return true;
            }
            i++;
            j++;
            k++;
        }
        return false;
    }
}