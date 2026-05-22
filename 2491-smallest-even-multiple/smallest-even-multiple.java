class Solution {
    public int smallestEvenMultiple(int n) {
        int m = 0;
        if(n % 2 == 0){
            for(int i = 2; i <= n; i++){
                
                if(i % 2 == 0 && i % n == 0){
                    m = i;
                }
            }
        }
        else{
            for(int i = 2; i <= 2*n; i++){
                if(i % 2 == 0 && i % n ==0){
                    m = i;
                }
            }
        }
        return m;
    }
}