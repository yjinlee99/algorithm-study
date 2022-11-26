import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        long answer = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        String s = bf.readLine();
        StringTokenizer st1 = new StringTokenizer(s);
        int[] distant = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            distant[i] = Integer.parseInt(st1.nextToken());
        }

        s = bf.readLine();
        StringTokenizer st2 = new StringTokenizer(s);
        int[] money = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            money[i] = Integer.parseInt(st2.nextToken());
        }

        int now = money[0];
        for (int i = 0; i < n - 1; i++) {
            if (now >= money[i]) {
                now = money[i];
            }
            answer += (long)distant[i] * (long)now;
        }

        System.out.println(answer);
    }
}
