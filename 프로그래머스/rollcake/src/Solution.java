import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0; i<topping.length; i++) {
            h.put(topping[i], h.getOrDefault(topping[i], 0) + 1);
        }

        HashSet<Integer> d = new HashSet<>();
        for(int i=0; i<topping.length; i++) {
            d.add(topping[i]);
            h.put(topping[i], h.get(topping[i]) - 1 );
            if(h.get(topping[i]) == 0) h.remove(topping[i]);
            if(d.size() == h.size()) answer++;
        }

        return answer;
    }
}