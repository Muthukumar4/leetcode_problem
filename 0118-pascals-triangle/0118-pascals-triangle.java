class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            int number=1;
            List<Integer>list1=new ArrayList<>();

            for (int j = 0; j <=i ; j++) {
                if(j==0||i==j){
                    list1.add(1);
                }
                else {
                    number = number * (i - j + 1) / j;
                    list1.add(number);
                }
            }
            list.add(list1); 

        }
        return list;
    }
}