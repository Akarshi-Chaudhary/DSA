class Solution {
    public int countPartitions(int[] nums, int k) {
         int n = nums.length;
         long MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        long[] pref = new long[n + 1];

        dp[0] = 1;
        pref[0] = 1;

        TreeMap<Integer, Integer> map = new TreeMap<>();
            int left = 0;
            for (int right = 0; right < n; right++) {

            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
                while (map.lastKey() - map.firstKey() > k) {
                    int val = nums[left];
                    map.put(val, map.get(val) - 1);
                    if (map.get(val) == 0) map.remove(val);
                      left++;
                    }
                    long sum = pref[right] - (left == 0 ? 0 : pref[left - 1]);
                    if (sum < 0) sum += MOD;

                    dp[right + 1] = sum % MOD;
                    pref[right + 1] = (pref[right] + dp[right + 1]) % MOD;
                 }
        return (int) dp[n];
    }
}  
    