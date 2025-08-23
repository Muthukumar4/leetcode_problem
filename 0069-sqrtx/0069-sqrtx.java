class Solution {
    public int mySqrt(int x) {
        int s = 0, e = x, ans = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            long sq = (long) mid * mid;

            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;   
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans; 
        
    }
}