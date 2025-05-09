class Solution {
    public int kthSmallest(int[][] matrix, int k) {
            int[] arr=new int[matrix.length*matrix[0].length];
        int h=0;
        for (int[] num:matrix){
            for (int val:num){
                arr[h]=val;
                h++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}