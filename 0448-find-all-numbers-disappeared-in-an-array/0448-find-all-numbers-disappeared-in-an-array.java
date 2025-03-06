class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int a=1;
         ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i <nums.length; i++) {
           while (a<nums[i]){
               list.add(a);
               a++;
           }
            if (a==nums[i]) {
                a++;
            }
        }
             while (a<= nums.length){
                list.add(a);
                a++;
            }
    
    return list;

}
}