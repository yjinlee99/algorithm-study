import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] str) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] card = new int[n];

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for(int i=0; i<n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);

        int m = Integer.parseInt(bf.readLine());
        s = bf.readLine();
        StringTokenizer sf = new StringTokenizer(s);

        for(int i=0; i<m; i++){
            int answer = 0;
            int num = Integer.parseInt(sf.nextToken());

            if(num <= card[n-1] || num >= card[0]) {
                int left = 0;
                int right = n - 1;
                int mid;
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (card[mid] == num) {
                        answer = 1;
                        break;
                    } else if (card[mid] < num) left = mid + 1;
                    else right = mid - 1;
                }
            }
            System.out.print(answer+" ");
        }
    }
}
