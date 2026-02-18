class Solution {
    public boolean hasAlternatingBits(int n) {
        int highbit = Integer.highestOneBit(n);
        int allOnes = (highbit<<1)-1;
        if((n^ (n>>1)) == allOnes){
            return true;
        }
        return false;
    }
}  