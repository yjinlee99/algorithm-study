import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] map;
    static boolean[][] visit;

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        map = new int[n][n];

        int min = 100;
        int max = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] < min) min = map[i][j];
                if(map[i][j] > max) max = map[i][j];
            }
        }

        int answer = 1;
        for(int h=min; h<max; h++) {
            visit = new boolean[n][n];
            int cnt = 0;
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(map[i][j] > h && visit[i][j]==false) {
                        visit[i][j] = true;
                        cnt++;
                        findMap(i,j,h);
                    }
                }
            }
            if (cnt > answer) answer = cnt;
        }
        System.out.println(answer);
    }

    static void findMap(int X, int Y, int h) {
        if(X-1 >= 0){
            if(map[X-1][Y] > h && visit[X-1][Y]==false) {
                visit[X-1][Y] = true;
                findMap(X-1, Y, h);
            }
        }
        if(Y-1 >= 0){
            if(map[X][Y-1] > h && visit[X][Y-1]==false) {
                visit[X][Y-1] = true;
                findMap(X, Y-1, h);
            }
        }
        if(X+1 < n){
            if(map[X+1][Y] > h && visit[X+1][Y]==false) {
                visit[X+1][Y] = true;
                findMap(X+1, Y, h);
            }
        }
        if(Y+1 < n){
            if(map[X][Y+1] > h && visit[X][Y+1]==false) {
                visit[X][Y+1] = true;
                findMap(X, Y+1, h);
            }
        }
    }
}
