import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());


            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());

                if (map.containsKey(a)) {
                    map.put(a, map.get(a) + 1);
                } else map.put(a, 1);
            }
            int answer = 0;

            if (n > 2) {
                for (Integer key : map.keySet()) {
                    for (Integer key1 : map.keySet()) {
                        if (key1 == key) {
                            if (map.get(key) < 2) continue;
                        }
                        if (key - key1 != key1 && key - key1 != key && map.containsKey(key - key1)) {
                            answer += map.get(key);
                            break;
                        } else if (key - key1 == key1 && map.containsKey(key - key1) && map.get(key1) > 1) {
                            answer += map.get(key);
                            break;
                        } else if (key - key1 == key && map.get(key) > 1) {
                            answer += map.get(key);
                            break;
                        }
                    }
                }

                if (map.containsKey(0)) {
                    if (map.get(0) == 2) answer -= 2;
                }
            }

            System.out.println(answer);

    }
}

