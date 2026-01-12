class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        Set<Integer>unique = new HashSet<>();
        for ( int num : nums){
            unique.add(num);
        } // all array elemnt by user 

        
        List<Integer>MissingElement = new ArrayList<>();
        for(int i = min; i <= max; i++){
           if(!unique.contains(i)){
              MissingElement.add(i);
           }
        }

        
        return MissingElement;

    }
}