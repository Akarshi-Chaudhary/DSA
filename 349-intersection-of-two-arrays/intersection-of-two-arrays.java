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
}