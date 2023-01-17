import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        long result = 1;

        a = a % c;
        while(b>0) {
            if (b%2 == 1) {
                result *= a;
                result %= c;
            }
            a *= a;
            a %= c;
            b = b/2;
        }

        System.out.println(result % c);
    }
}
