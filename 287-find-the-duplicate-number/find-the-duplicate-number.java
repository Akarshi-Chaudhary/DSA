// class Solution {
//     public int findDuplicate(int[] nums) {
//         int ans = 0;

//         for(int i = 0; i < nums.length; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 if(nums[i] == nums[j]) ans = nums[j]; 
//             }
//         }
//         return ans;
//     }
// }  // O(n^2) time , spce O(1)

// class Solution{
//     public int findDuplicate(int[] nums){
//       HashSet<Integer> set = new HashSet<>();
//        for(int n : nums){
//             if(set.contains(n)) return n;
//             set.add(n);
//         }
//         return -1;
//     }
// }  //O(n) space complexity , timeO(1)

class Solution{
    public int findDuplicate(int[] nums){

        int slow = nums[0];
        int fast = nums[0];
 
        // find  a meetng points inside cycle  , It does NOT guarantee meeting at duplicate
        // means:Move first ,  Check latermeans:
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);
        
        //find cycle enternce  Because now we want BOTH pointers to move at SAME speed
        // distance(start → cycleStart) = distance(meetingPoint → cycleStart)
        // arom meeting pointo:  slow starts from beginning , fast starts from meeting point
            slow = nums[0];

            while(slow != fast){
                slow = nums[slow];
                fast = nums[fast];
            }
        return slow;
    }
}