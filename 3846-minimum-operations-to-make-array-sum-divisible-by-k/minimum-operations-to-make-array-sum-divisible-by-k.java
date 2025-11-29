class Solution {
    public int minOperations(int[] nums, int k) {
        // int inc = 1, dec = 1;
        // int ans = 1;

        // for( int i = 1; i <nums.length; i++){
        //     if(nums[i] > nums[i - 1]){
        //         inc++;
        //         dec = 1;
        //     } else if (nums[i] < nums[i -1]){
        //         dec++;
        //         inc = 1;
        //     } else{
        //         inc = 1;
        //         dec = 1;
        //     }
        //     ans = Math.max(ans, Math.max(inc, dec));
        // }
        // return ans;
        // class Solution {
        //         public int minOperations(int[] nums, int k) {
                        long sum = 0;
                                for (int x : nums) sum += x;
                                        return (int)(sum % k);   // remainder is the minimum number of -1 ops needed
                                            }
                                            }

    //     }
    // }
//}