// class Solution {
//     public int lengthOfLongestSubstring(String s) {

//         HashSet<Character>set = new HashSet<>();

//         int left = 0, right = 0;
//         int max = 0;
       

//         while(right < s.length()){
//             if(!set.contains(s.charAt(right))){
//                 set.add(s.charAt(right));
//                 max = Math.max(max, right - left + 1);
//                 right++;
//             }
//             else{
//                 set.remove(s.charAt(left));
//                 left++;
//             }
//         }
//         return max;
//     }
// }

// class Solution{
//     public int lengthOfLongestSubstring(String s){
//         HashMap<Character, Integer> map = new HashMap<>();
        
//         int left = 0, max = 0;

//         for(int right = 0; right < s.length(); right++){
            
//             char ch = s.charAt(right);

//             if(map.containsKey(ch)){
//                 left = Math.max(left, map.get(ch) + 1);
//             }
//             map.put(ch, right);
//             max = Math.max(max, right - left + 1);
//         }
//         return max;
//     }
// }

class Solution{
    public int lengthOfLongestSubstring(String s){

         // Store last seen index of every ASCII character
        int[] lastIndex = new int[128];

         // Initially, no character has been seen
        Arrays.fill(lastIndex, -1);

         // Start of current window
        int left = 0;
          // Best answer
        int maxlen = 0;

         // Scan the string
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            // Seen inside current window?
            if(lastIndex[ch] >= left){
                left = lastIndex[ch] + 1;
            }

              // Update latest position
            lastIndex[ch] = right;


            // Update answer
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}