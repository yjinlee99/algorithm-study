import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] origin = new int[n];
        int[] sorted = new int[n];
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(st.nextToken());
            origin[i] = k;
            sorted[i] = k;
        }

        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        int m=0;
        for(int i=0; i<n; i++) {
            if(!map.containsKey(sorted[i])) {
                map.put(sorted[i], m);
                m++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(map.get(origin[i])).append(' ');
        }
        System.out.println(sb);
    }
}
