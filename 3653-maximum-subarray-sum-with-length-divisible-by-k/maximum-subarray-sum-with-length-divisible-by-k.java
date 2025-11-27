class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] minpref = new long[k];

        Arrays.fill(minpref, Long.MAX_VALUE);

        minpref[0] = 0;

        long prefix = 0;
        long ans = Long.MIN_VALUE;

        for(int i = 0; i<n; i++){
            prefix += nums[i];
            int mod = (i+1) % k;

            if(minpref[mod] != Long.MAX_VALUE){
                ans = Math.max(ans, prefix - minpref[mod]);

            }

            minpref[mod] = Math.min(minpref[mod], prefix);
            
        }
        return (ans == Long.MIN_VALUE) ? 0 : ans;
    }
}