class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] freq = new int[26];

        // count freq of each character 

        // It converts letters 'a' to 'z' into indices 0 to 25, allowing us to store frequencies  in a simple array instead of a HashMap.

        for(char ch: text.toCharArray()) {
            freq[ch - 'a']++;
        }

        // find max complete "balloons" words

        return Math.min(
            Math.min(freq['b' - 'a'], freq['a' - 'a']),
            Math.min(
                Math.min(freq['l' - 'a'] / 2, freq['o' - 'a'] / 2),
                freq['n' - 'a']
            )
        );
    }
}


// Count all required characters, divide counts of repeated letters (l and o) by their required frequency, then take the minimum count because the scarcest character limits the number of complete "balloon".

