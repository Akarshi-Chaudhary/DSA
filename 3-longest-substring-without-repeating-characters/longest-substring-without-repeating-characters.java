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

class Solution{
    public int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0, max = 0;

        for(int right = 0; right < s.length(); right++){
            
            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}