class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for( int x : nums)  sum += x;
        if ((sum & 1 ) == 1) return 0;
        return nums.length-1;
    }
}