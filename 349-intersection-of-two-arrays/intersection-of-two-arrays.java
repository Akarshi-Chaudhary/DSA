// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
        
//         Set<Integer> set1 = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();

//         for(int num : nums1){
//             set1.add(num);
//         }

//         for(int num : nums2){  
//             set2.add(num);  
//         }

//         int[] ans = new int[set1.size()];
        
//         int k = 0;

//         for(int num : set1){

//             if(set2.contains(num)){
//                 ans[k] = num;

//                 k = k + 1;
//             }
//         }
        
//         return Arrays.copyOfRange(ans, 0 , k);
//     }
// }


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {   
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){  
            set2.add(num);  
        }

        if(set1.size() < set2.size()){

            int[] ans = new int[set1.size()];
        
            int k = 0;

            for(int num : set1){

                if(set2.contains(num)){
                    ans[k] = num;

                    k = k + 1;
                }
            }
            return Arrays.copyOfRange(ans, 0 , k);

        }

        else
        {

            int[] ans = new int[set2.size()];
        
            int k = 0;

            for(int num : set2){

                if(set1.contains(num)){
                    ans[k] = num;

                    k = k + 1;
                }
            }
            return Arrays.copyOfRange(ans, 0 , k);
        }

    }
}


//"I store unique elements of both arrays in HashSets. Then I iterate through the smaller set and check membership in the larger set using contains(), which takes O(1) average time."
