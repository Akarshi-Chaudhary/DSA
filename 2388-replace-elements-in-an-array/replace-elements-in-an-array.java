class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
       Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i <nums.length; i++){
            map.put(nums[i], i);
        }

        // for (int i = 0; i < operations.length; i++) {
        //     int oldValue = operations[i][0];
        //     int newValue = operations[i][1];
            for(int[] op : operations){
                int oldValue = op[0];
                int newValue = op[1];
        
            int index = map.get(oldValue);
            nums[index] = newValue;

            map.remove(oldValue);
            map.put(newValue, index);
        }
        return nums;
    }
}


































//  for (int i = 0; i < operations.length; i++) {
//             int previousVal = operations[i][0];
//             int newVal = operations[i][1];

//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[j] == previousVal) {
//                     nums[j] = newVal;
//                     break;
//                 }
//             }
//         }
//         return nums;