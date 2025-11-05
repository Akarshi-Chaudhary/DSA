class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer>set1 = new HashSet<>();
        for(int num: nums1){
            set1.add(num);
        }

        Set<Integer> finalset = new HashSet<>();
        for(int num : nums2){
            if(set1.contains(num)){
                finalset.add(num);
            }
        }
        
        int[] result = new int[finalset.size()];
        int i = 0;
        for(int num: finalset){
            result[i++] = num;
        }

        return result;
    }
}