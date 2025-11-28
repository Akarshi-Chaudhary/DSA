class Solution {
    int count = 0;
    int mod;

     public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        mod = k;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
                                                                                                }
        boolean[] visited = new boolean[n];
        dfs(0, graph, values, visited);
        return count;
 }
 private long dfs(int node, List<List<Integer>> graph, int[] values, boolean[] visited) {
   visited[node] = true;
   long sum = values[node];
   for (int nxt : graph.get(node)) {
        if (!visited[nxt]) {
             sum += dfs(nxt, graph, values, visited);
        }
    }
    if (sum % mod == 0) {
        count++;
        return 0; 
    }
     return sum; 
   }
   }

