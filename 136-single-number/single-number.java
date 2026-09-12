// class Solution {
//     public int singleNumber(int[] nums) {

//        HashMap<Integer, Integer> map = new HashMap<>();

//        for(int num : nums){
//             if(!map.containsKey(num)){
//                 map.put(num, 0);
//             }
//            map.put(num, map.get(num) + 1);
//         } 

//                 // for(int i = 0; i < nums.length; i++){
//                 //     if(map.get(nums[i]) == 1) return nums[i];
//                 // }

//         for(int num : nums){
//             if(map.get(num) == 1) return num;
//         }

//         return -1;
//     }
// }

class Solution {
   public int singleNumber(int[] nums) {

    int ans = 0;

       for(int num : nums){
          ans =  num ^ ans;
        }

        return ans;

    }
}