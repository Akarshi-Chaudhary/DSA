class Solution {
    public int numSub(String s) {
        long total = 0;
        long k = 0;
        int mod = 1000000007;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i)=='1') {
                k++;
            }
            else {
                total = (total + k*(k+1)/2) % mod;
                k = 0;
            }
        }
        total = (total + k * (k + 1 )/ 2) % mod;
        return(int)total;
    }
}