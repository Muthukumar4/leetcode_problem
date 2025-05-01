class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int ans:nums){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(ans);
                outer.add(inner);
            }
        }
        return outer;
    }
}