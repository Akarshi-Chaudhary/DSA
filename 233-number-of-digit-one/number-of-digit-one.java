class Solution {
    public int countDigitOne(int n) {

        //*mmry limit exceeds 
        // if(n==0)
        // {
        //   return 0;
        // }
         
        // int count = 0;
        // StringBuilder sb  = new StringBuilder();
        // for(int i = 1; i <= n ; i++){
        //     sb.append(i);
        // }
        
        // for(int i = 0 ; i < sb.length(); i++){
        //     if (sb.charAt(i) == '1'){
        //         count = count+1;
        //     }
        // }
        // return count;


//*way 2 limit exceeds
        // int cnt = 0;
        // for(int i =0; i <=n ; i++){
        //     int num =i;
        //     while(num>0){
        //         if(num%10 == 1){
        //             cnt++;

        //             num/=10;
        //         }
        //     }
            
        // }
        // return cnt;
     int ans = 0;
     for(int i = 1; i <= n; i*=10){
        int div = i*10;
        int q = n/div;
        int rem = n %div; 
        ans += q*i;
        if(rem >= i){
            ans += Math.min(rem-i+1,i);
        }
    }
    return ans;
        
    }
}