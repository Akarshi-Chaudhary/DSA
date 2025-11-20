class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if(a[1] == b[1]) return b[0] - a[0];
            return a[1] - b[1];
        });
        
        List<Integer>selected = new ArrayList<>();

        for(int[] in : intervals){
            int start = in[0], end = in[1];

            int count = 0 ;
            for(int i = selected.size() - 1; i >= 0; i--) {
                if(selected.get(i) >= start && selected.get(i) <= end){
                    count++;
                    if (count == 2) break;
                }
            }

            for(int x = end; count <2; x--){
                if(!selected.contains(x)) {
                    selected.add(x);
                    count++;
                }
            }
        }

        return selected.size();
    }
}