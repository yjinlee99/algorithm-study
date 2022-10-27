import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] lan = new long[k];
        long end = 0;

        for(int i=0; i<k; i++){
            lan[i] = Integer.parseInt(bf.readLine());
            if(lan[i] > end) end = lan[i];
        }

        long start = 1;
        long mid;
        while(start<=end) {
            mid = (start+end)/2;
            long num = 0;

            for(int i=0; i<k; i++){
                num = num + (lan[i]/mid);
                if(num>n) break;
            }

            if(num>=n) start = mid + 1;
            else end = mid - 1;
        }
        System.out.println(end);
    }
}
