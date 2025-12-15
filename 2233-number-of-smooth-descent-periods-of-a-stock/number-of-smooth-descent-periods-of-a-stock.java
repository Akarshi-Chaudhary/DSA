class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 0;
        long streak = 0;

        for (int i = 0; i < prices.length; i++) {
            if (i > 0 && prices[i] == prices[i - 1] - 1) {
                streak++;
            } else {
                streak = 1;
            }
            ans += streak;
        }
        return ans;
    }
}
