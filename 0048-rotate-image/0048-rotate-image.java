class Solution {
    public void rotate(int[][] arr) {
          int k=0,m=0;
           int[][] arr1=new int[arr.length][arr.length];

        for (int i = 0; i < arr.length ; i++) {
            m=0;
            for (int j = 0; j <arr[i].length ;   j++) {
                arr1[i][j]=arr[arr.length-1-m][k];
                m++;
            }
            k++;
        }
       for (int i = 0; i < arr.length ; i++) {
          for (int j = 0; j <arr[i].length ;   j++) {
            arr[i][j]=arr1[i][j];
          }
       }
        
    }
}