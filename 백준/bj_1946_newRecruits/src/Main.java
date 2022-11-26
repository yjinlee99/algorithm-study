import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        while(n>0) {
            int m = Integer.parseInt(bf.readLine());
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<m; i++) {
                String s = bf.readLine();
                StringTokenizer st = new StringTokenizer(s);
                map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            int min = m+1;
            int answer = 0;
            for(int i=1; i<=m; i++){
                int num = map.get(i);
                if(num < min) {
                    answer++;
                    min = num;
                }
            }
            System.out.println(answer);
            n--;
        }
    }
}
