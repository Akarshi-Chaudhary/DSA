class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0 ;
        for(int num : nums){
            int rem = num % 3 ;
            if(rem != 0)
             count ++;   
        }
        return count;
    }
}

//         for(int num : nums){
//             int rem = num % 3 ;
//             if(rem == 0) {
//                 continue;
//             }
//             else if (rem == 1 ){
//                 rem = rem - 1 ;
//                 count = count + 1;
//             }
//             else{
//                 count = count + 1;
//             }
           
//         }
//         return count ;
//     }
// }