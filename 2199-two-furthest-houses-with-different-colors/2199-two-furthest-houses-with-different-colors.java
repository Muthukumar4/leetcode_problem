class Solution {
    public int maxDistance(int[] colors) {
        int max=0,ab=0;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<=colors.length-1;j++)
            if(colors[i]!=colors[j]){
                ab=Math.abs(i-j);
            }
            max=Math.max(max,ab);

        }
        return max;
    }
}