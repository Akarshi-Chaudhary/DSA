class Solution {
    public boolean isPalindrome(String s) {
        // int left = 0, right = s.length() - 1;
        // while (left < right) {
        //     while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        //         left++;
        //     }
        //     while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
        //         right--;
        //     }
        //     if (Character.toLowerCase(s.charAt(left)) != 
        //         Character.toLowerCase(s.charAt(right))) {
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;


        int i = 0; int j = s.length()-1;
        while(i<j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){ i++; }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){ j--; }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
              return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
