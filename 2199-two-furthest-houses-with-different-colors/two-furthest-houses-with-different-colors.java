class Solution {
    public int maxDistance(int[] colors) {
        // way 1: wrong 

        // int n = colors.length;
        // int maxdis = 0;
        // int i = 0; int j = n -1;
        // while(i < n && j >= 0){
        //     if(colors[i] != colors[j]){
        //         int diff = Math.abs(i - j);
        //         maxdis = Math.max(maxdis, diff);
        //     }
        //     else{
        //         j--;
        //     }
        
        // }
        // return maxdis;

        int n = colors.length;
        int maxdis = 0; 
        for(int i = 0; i < n; i++){
            if(colors[i] != colors[n - 1]){
                int diff = Math.abs(n - 1 - i);
                maxdis = Math.max(maxdis, diff);
                break;
            }
        }
        for(int j = n - 1; j >= 0; j--){
            if(colors[j] != colors[0]){
                int diff = j;
                maxdis = Math.max(maxdis, diff);
                break;
            }
        }
        return maxdis;
    }
}