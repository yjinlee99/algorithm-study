import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] dp = new int[N+3];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for(int i=4; i<=N; i++) {
            dp[i] = dp[i-1] + 1;
            if(i%2==0) {
                if(dp[i/2]+1 < dp[i]) dp[i] = dp[i/2]+1;
            }
            if(i%3==0) {
                if(dp[i/3]+1 < dp[i]) dp[i] = dp[i/3]+1;
            }
        }

        System.out.println(dp[N]);
    }
}
