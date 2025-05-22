class Solution {
    public List<Integer> getRow(int n) {
         List<Integer> list = new ArrayList<>();
        long number=1;
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == n) {
                list.add(1) ;
            } else {
                number = number * (n - i + 1) / i;
                list.add((int)number);
            }
        }
        return list;
    }
}