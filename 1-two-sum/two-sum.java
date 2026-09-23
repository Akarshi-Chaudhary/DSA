// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] arr = new int[2];
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     arr[0] = i;
//                     arr[1] = j;               
//                 }
//             }
//         }
//         return arr;
//     }
// }

// class Solution{
//     public int[] twoSum(int[] nums, int target){
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < nums.length; i++){
//             int remain = target - nums[i];
//             if(map.containsKey(remain)){
//                 return new int[] {map.get(remain), i};
//             }
//             else{
//                 map.put(nums[i], i);
//             }
//         }
//         return new int[] {};
//     }
// }

// class Solution{
//     public int[] twoSum(int[] nums, int target){
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i = 0; i < nums.length; i++){
//             map.put(nums[i], i);
//         }

//         for(int i = 0; i < nums.length; i++){
//             int srch = target - nums[i];
//             if(map.containsKey(srch) && map.get(srch) != i){
//                 return  new int[]{ map.get(srch), i };
//             }
//         }
//         return new int[]{-1, -1};
//     }
// }

class Solution{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            // map.put(nums[i], i);
            int srch = target - nums[i];
            if(map.containsKey(srch) && map.get(srch) != i){
                return  new int[]{ map.get(srch), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}