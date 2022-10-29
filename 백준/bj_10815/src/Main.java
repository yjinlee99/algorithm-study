import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] str) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //상근이가 가지고 있는 숫자 카드의 개수
        int n = Integer.parseInt(bf.readLine());
        //상근이가 가지고 있는 숫자 카드 배열
        int[] card = new int[n];

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for(int i=0; i<n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        //숫자 카드 정렬
        Arrays.sort(card);

        //숫자 개수
        int m = Integer.parseInt(bf.readLine());
        s = bf.readLine();
        StringTokenizer sf = new StringTokenizer(s);

        for(int i=0; i<m; i++){
            //수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0
            int answer = 0;
            //가지고 있는지 아닌지 구해야할 숫자
            int num = Integer.parseInt(sf.nextToken());

            //이분 탐색
            if(num <= card[n-1] || num >= card[0]) {
                int left = 0;
                int right = n - 1;
                int mid;
                while (left <= right) {
                    mid = (left + right) / 2;
                    //상근이가 가지고 있는 숫자카드라면 answer을 1로 바꾸고 break 아니면 계속 탐색
                    if (card[mid] == num) {
                        answer = 1;
                        break;
                    } 
                    else if (card[mid] < num) left = mid + 1;
                    else right = mid - 1;
                }
            }
            System.out.print(answer+" ");
        }
    }
}
