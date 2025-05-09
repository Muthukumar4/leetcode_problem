class Solution {
    public int[] rowAndMaximumOnes(int[][] matrix) {
          int count=0;
        int max=0;
        int rowin =0;

        for (int i = 0; i <matrix.length ; i++) {
            count=0;
            for (int j = 0; j <matrix[i].length ; j++) {
                if(matrix[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                 rowin = i;
            }
        }
        return new int[]{rowin,max};
    }
}