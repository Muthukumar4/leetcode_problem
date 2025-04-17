class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for(int i=0;i< image.length;i++){
            for (int j = 0; j <image[i].length/2 ; j++) {
                int temp=image[i][j];
                image[i][j]=image[i][image.length-1-j];
                image[i][image.length-1-j]=temp;
            }
        }
        for (int[] row:image){
            for (int i = 0; i <row.length ; i++) {
                row[i] = row[i] ^ 1;
            }
              
            }
            return image;
    }
}