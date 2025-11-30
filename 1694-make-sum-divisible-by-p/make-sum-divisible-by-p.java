class Solution {
    public int minSubarray(int[] nums, int p) {
        long tot = 0;
        for (int x : nums) tot += x;

        int rem = (int)(tot % p);
        if (rem == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        long prefix = 0;
        int ans = nums.length;

        for(int i = 0; i < nums.length; i++){
            prefix = (prefix + nums[i]) % p;

            int requiremnt = (int)((prefix - rem + p) % p);

            if (map.containsKey(requiremnt)) {
                ans = Math.min(ans, i - map.get(requiremnt));
            }

            map.put((int)prefix, i );
        }
        return ans == nums.length ? -1 : ans;
    }
}