class Solution{
    public int removeDuplicates(int[] nums){
        int k = 1;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[j-1]){
                nums[k] = nums[j];
                k = k + 1;
            }
        }
        return k;
    }
}

// class Solution {
//     public int removeDuplicates(int[] nums){
//         int i = 0;
//         for(int j = 1; j < nums.length; j++){
//             if(nums[j] != nums[i]){
//                 i++;
//                 nums[i] = nums[j];
//             }
//         }
//         return i + 1;
//     }
// }


// class Solution {
//     public int removeDuplicates(int[] nums) {
      
//         Set<Integer>set = new HashSet<>();
//         for(int n:nums){
//             if(!set.contains(n)){
//                set.add(n);
//             }
//         }
//         int i = 0;
//         for(int n : set){
//             nums[i++] = n;
//         }

//         return set.size();

//     }
// }