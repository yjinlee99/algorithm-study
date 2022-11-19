import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        int n = Integer.parseInt(bf.readLine());
        int i=1;
        int j=10;
        while(true) {
            if(n/j==0) break;
            i++;
            j *= 10;
        }

        for(int m=n-9*i; m<n; m++){
            int num = m;
            int number = m;

            while(number > 0){
                num += number%10;
                number /= 10;
            }
            if(num == n) {
                answer = m;
                break;
            }
        }

        System.out.println(answer);
    }
}
