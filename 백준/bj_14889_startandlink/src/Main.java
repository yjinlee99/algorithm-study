import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static List<Integer> arr;
    public static boolean[] visit;
    public static int[][] power;
    public static int min = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        power = new int[n][n];

        for(int i=0; i<n; i++){
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for(int j=0; j<n; j++){
                power[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int depth = n/2;
        arr = new ArrayList<>();
        for(int i=0; i<depth; i++){
            arr.add(0);
        }
        visit = new boolean[n];
        arr.add(0);
        visit[0] = true;
        dfs(n, depth, 1,0);

        System.out.println(min);
    }

    public static void dfs(int N, int M, int depth, int start) {

        if(depth == M) {
            int startSum = 0;
            int linkSum = 0;
            for (int j=0; j<N; j++){
                for (int k=j+1; k<N; k++){
                    if(j==k) continue;
                    if(arr.contains(j) && arr.contains(k)) startSum+=power[j][k] + power[k][j];
                    else if(!arr.contains(j) && !arr.contains(k)) linkSum+=power[j][k] + power[k][j];
                }
            }
            int result = Math.abs(startSum-linkSum);
            if(result < min) min = result;
            return;
        }

        for( int i=start+1; i<N; i++){
            if(!visit[i]) {
                visit[i] = true;
                arr.set(depth, i);
                dfs(N,M,depth+1,i);
                visit[i]=false;
            }
        }
        return;
    }
}
