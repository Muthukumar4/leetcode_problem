class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int rl=0;
        int rup= matrix.length-1;
        int cl=0;
        int cup=matrix[0].length-1;
        ArrayList<Integer>list =new ArrayList<>();
        while(rl<=rup&&cl<=cup){
            for(int i=cl;i<=cup;i++){
                list.add(matrix[rl][i]);
            }
            rl++;
            for (int i = rl; i <=rup ; i++) {
                list.add(matrix[i][cup]);
            }
            cup--;
            if(rl<=rup){
                for (int i = cup; i >=cl ; i--) {
                    list.add(matrix[rup][i]);
                }
                rup--;
            }
            if(cl<=cup){
                for(int i=rup;i>=rl;i--){
                    list.add(matrix[i][cl]);
                }
                cl++;
            }
        }
        return list;
    }
}