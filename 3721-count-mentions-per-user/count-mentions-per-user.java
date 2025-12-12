
class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int[] mentions = new int[numberOfUsers];
        int[] offlineUntil = new int[numberOfUsers]; 

        class E {
            String type;
            int time;
            String payload;
            E(String type, int time, String payload) {
                this.type = type; this.time = time; this.payload = payload;
            }
        }

        List<E> list = new ArrayList<>();
        for (List<String> ev : events) {
            String type = ev.get(0);
            int t = Integer.parseInt(ev.get(1));
            String p = ev.get(2);
            list.add(new E(type, t, p));
        }

        
        Collections.sort(list, (a, b) -> {
            if (a.time != b.time) return Integer.compare(a.time, b.time);
            if (a.type.equals(b.type)) return 0;
            if (a.type.equals("OFFLINE") && b.type.equals("MESSAGE")) return -1;
            if (a.type.equals("MESSAGE") && b.type.equals("OFFLINE")) return 1;
           
            return a.type.compareTo(b.type);
        });

        for (E ev : list) {
            if (ev.type.equals("OFFLINE")) {
                int user = Integer.parseInt(ev.payload);
               
                offlineUntil[user] = ev.time + 60;
            } else if (ev.type.equals("MESSAGE")) {
                String msg = ev.payload;
                String[] tokens = msg.split("\\s+");
                for (String token : tokens) {
                    if (token.startsWith("id")) {
                       
                        int u = Integer.parseInt(token.substring(2));
                        mentions[u]++;
                    } else if (token.equals("ALL")) {
                        for (int u = 0; u < numberOfUsers; u++) mentions[u]++;
                    } else if (token.equals("HERE")) {
                        for (int u = 0; u < numberOfUsers; u++) {
                            
                            if (ev.time >= offlineUntil[u]) mentions[u]++;
                        }
                    }
                }
            }
          
        }

        return mentions;
    }
}
