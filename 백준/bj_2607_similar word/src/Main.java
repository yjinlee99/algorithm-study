import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        char[] c = bf.readLine().toCharArray();

        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0; i<c.length; i++) {
            h.put(c[i], h.getOrDefault(c[i], 0) + 1);
        }

        int answer = 0;

        for(int i=0; i<n-1; i++) {
            char[] cp = bf.readLine().toCharArray();

            if(cp.length > c.length + 1 || cp.length < c.length - 1) continue;
            else {
                HashMap<Character, Integer> hp = new HashMap<>();
                hp.putAll(h);
                if(cp.length > c.length) {
                    for(int j=0; j<cp.length; j++) {
                        if(hp.containsKey(cp[j])){
                            hp.put(cp[j], hp.get(cp[j]) - 1);
                            if(hp.get(cp[j])==0) hp.remove(cp[j]);
                        }
                    }
                    if(hp.isEmpty()) answer++;
                }
                else if(cp.length == c.length) {
                    for(int j=0; j<cp.length; j++) {
                        if(hp.containsKey(cp[j])){
                            hp.put(cp[j], hp.get(cp[j]) - 1);
                            if(hp.get(cp[j])==0) hp.remove(cp[j]);
                        }
                    }
                    if(hp.isEmpty()) answer++;
                    else {
                        int sum = 0;
                        for(Character key:hp.keySet()) {
                            sum += hp.get(key);
                            if(sum > 1) break;
                        }
                        if(sum == 1) answer++;
                    }
                }
                else if(cp.length < c.length) {
                    answer++;
                    for(int j=0; j<cp.length; j++) {
                        if(hp.containsKey(cp[j])){
                            hp.put(cp[j], hp.get(cp[j]) - 1);
                            if(hp.get(cp[j])==0) hp.remove(cp[j]);
                        }
                        else {
                            answer--;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }


}
