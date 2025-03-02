class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        res[0]=search(nums,target,true);
        if(res[0]!=-1){
        res[1]=search(nums,target,false);
        }
        return res;
        
    }
    static int search(int[] arr,int target,boolean first){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                if(first){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}