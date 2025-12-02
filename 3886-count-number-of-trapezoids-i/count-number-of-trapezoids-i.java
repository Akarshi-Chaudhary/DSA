// import java.util.*;

// class Solution {
//     public int countTrapezoids(int[][] points) {
//          Map<Integer, Integer> map = new HashMap<>();
//          for (int[] p : points) {
//             int y = p[1];
//             map.put(y, map.getOrDefault(y, 0) + 1);
//           }

//            List<Integer> ys = new ArrayList<>();
//            for (int y : map.keySet()) {
//              if (map.get(y) >= 2) ys.add(y);
//             }

//             long res = 0;
//             long mod = 1_000_000_007;

//             for (int i = 0; i < ys.size(); i++) {
//                 for (int j = i + 1; j < ys.size(); j++) {
//                  long c1 = map.get(ys.get(i));
//                  long c2 = map.get(ys.get(j));
//                  long w1 = c1 * (c1 - 1) / 2;
//                  long w2 = c2 * (c2 - 1) / 2;
//                  res = (res + (w1 % mod) * (w2 % mod)) % mod;
//                 }
//             }
//          return (int)res;
//     }
// }


import java.util.*;

class Solution {
    public int countTrapezoids(int[][] points) {
            long MOD = 1_000_000_007;
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int[] p : points) {
             map.computeIfAbsent(p[1], k -> new ArrayList<>()).add(p[0]);
            }
            List<List<Integer>> ys = new ArrayList<>();
            for (var entry : map.entrySet()) {
                List<Integer> xs = entry.getValue();
                if (xs.size() >= 2) {
                    Collections.sort(xs);
                    ys.add(xs);
                }
            }
            long res = 0;
            long MOD_RES = 0;

            Map<Integer, Long> freqX = new HashMap<>();
            long prevPairs = 0;
            for (List<Integer> xs : ys) {
                int n = xs.size();
                long currPairs = (long) n * (n - 1) / 2;
                res = (res + (prevPairs % MOD) * (currPairs % MOD)) % MOD;
                prevPairs = (prevPairs + currPairs) % MOD;
            }
            return (int)res;
    }
}
