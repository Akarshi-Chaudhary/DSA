class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int count=0;;
        int n = arr.length;
        for (int i = 0; i+m < n; i++) {
          if(arr[i] == arr[i+m]){
                count++;
                if(count ==  m * (k-1)){
                     return true;
                }
            
            }
            else{
              count = 0 ;
            }
        }return false;
    } 
}

