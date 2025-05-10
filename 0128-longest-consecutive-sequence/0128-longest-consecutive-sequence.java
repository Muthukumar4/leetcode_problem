class Solution {
    public int longestConsecutive(int[] arr) {
      if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int last=arr[0];
        int num=1;
        int ans=1;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]==last+1){
                num++;
            } else if (arr[i]!=last) {
                num=1;
            }
            last=arr[i];
            ans=Math.max(num,ans);
        }  
        return ans;
    }
}