import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] num = new int[N];
        int max = 0;
        for(int i=0; i<N; i++) {
            num[i] = Integer.parseInt(bf.readLine());
            if(num[i] > max) max = num[i];
        }

        int[] dp = new int[max+4];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<=max; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for(int i=0; i<N; i++) {
            System.out.println(dp[num[i]]);
        }
    }
}
