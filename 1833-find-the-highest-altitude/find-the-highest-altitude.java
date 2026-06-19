class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        int prefixSum = 0;
        int maxSum = 0;

        for(int i =  0; i < n; i++){
            prefixSum += gain[i];
            for(int j = 1; j < arr.length; j++){

                arr[j] = prefixSum;
                maxSum = Math.max(prefixSum, maxSum);
            }
        }
        return maxSum;

    }
}