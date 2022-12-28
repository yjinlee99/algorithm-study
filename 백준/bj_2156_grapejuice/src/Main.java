import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] num = new int[N];

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for(int i=0; i<N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        dp[0] = 1;
        int answer = 0;
        for(int i=0; i<N; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(num[j] > num[i]) {
                    if(dp[j] > max) max = dp[j];
                }
            }
            dp[i] = max+1;
            if(dp[i] > answer) answer = dp[i];
        }

        System.out.println(answer);
    }
}
