class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0 ;
       int min1 = Integer.MAX_VALUE;
       int min2 = Integer.MAX_VALUE;
       int min11 = Integer.MAX_VALUE;
       int min22 = Integer.MAX_VALUE;

        for(int num : nums){
            sum += num;
            int r = num % 3;

            if( r == 1){
                if(num < min1){
                    min11 = min1;
                    min1 = num;
                }else if (num < min11){
                    min11 = num;
                }
            }
            else if(r == 2){
                if(num < min2){
                    min22 = min2;
                    min2 = num;
                } else if(num < min22){
                    min22 = num;
                }
            }
        }
        if(sum % 3 == 0) return sum;

        if(sum % 3 == 1){
            int remove1 = min1;
            int remove2 = (min2 == Integer.MAX_VALUE || min22 == Integer.MAX_VALUE)
                           ? Integer.MAX_VALUE
                           : min2 + min22;
            return sum - Math.min(remove1, remove2);

        }
        int remove1 = min2;
        int remove2 = (min1 == Integer.MAX_VALUE || min11 == Integer.MAX_VALUE)
                      ? Integer.MAX_VALUE
                      : min1 + min11;
        return sum -Math.min(remove1 , remove2);
    }
}