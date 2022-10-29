import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);

        //랜선의 개수
        int k = Integer.parseInt(st.nextToken());
        //필요한 랜선의 개수
        int n = Integer.parseInt(st.nextToken());

        //랜선 길이 배열
        long[] lan = new long[k];
        //랜선의 길이 중 최대값보다 큰 랜선을 만들수는 없으므로 end는 최대값
        long end = 0;

        for(int i=0; i<k; i++){
            lan[i] = Integer.parseInt(bf.readLine());
            if(lan[i] > end) end = lan[i];
        }

        //랜선의 길이가 1이상이므로 start는 1
        long start = 1;
        long mid;
        //매개 변수 탐색으로 최댓값 구하기
        while(start<=end) {
            mid = (start+end)/2;
            long num = 0;

            //만들 수 있는 랜선의 길이 구하기
            for(int i=0; i<k; i++){
                num = num + (lan[i]/mid);
                //랜선의 길이가 n이 넘으면 true이므로 break
                if(num>n) break;
            }

            if(num>=n) start = mid + 1;
            else end = mid - 1;
        }
        System.out.println(end);
    }
}
