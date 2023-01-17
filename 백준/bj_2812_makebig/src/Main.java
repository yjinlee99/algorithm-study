import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String s = bf.readLine();
        int[] num = new int[s.length()];
        for(int i=0; i<s.length(); i++) {
            num[i] = s.charAt(i) - '0';
        }

        int max = 0;


    }
}
