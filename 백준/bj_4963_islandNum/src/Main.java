import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int n;
    static int m;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = bf.readLine();

            StringTokenizer st = new StringTokenizer(s);
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            if(n==0 && m==0) break;

            map = new int[m][n];
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int answer = 0;

            for (int i = 0; i < m ; i++) {
                for (int j = 0; j < n ; j++) {
                    if (map[i][j] == 1) {
                        map[i][j] = 2;
                        answer++;
                        findMap(i, j);
                    }
                }
            }

            System.out.println(answer);
        }
    }

    static void findMap(int nowX, int nowY) {
        if(nowX-1 >=0 && nowY-1 >=0) {
            if (map[nowX - 1][nowY - 1] == 1) {
                map[nowX - 1][nowY - 1] = 2;
                findMap(nowX - 1, nowY - 1);
            }
        }
        if(nowX-1 >= 0) {
            if(map[nowX-1][nowY] == 1){
                map[nowX - 1][nowY] = 2;
                findMap(nowX - 1, nowY);
            }
        }
        if(nowX-1 >= 0 && nowY+1 < n) {
            if (map[nowX - 1][nowY + 1] == 1) {
                map[nowX - 1][nowY + 1] = 2;
                findMap(nowX - 1, nowY + 1);
            }
        }
        if(nowY-1 >=0) {
            if (map[nowX][nowY-1] == 1) {
                map[nowX][nowY-1] = 2;
                findMap(nowX, nowY-1);
            }
        }
        if(nowY+1 < n) {
            if (map[nowX][nowY + 1] == 1) {
                map[nowX][nowY + 1] = 2;
                findMap(nowX, nowY + 1);
            }
        }
        if(nowX+1<m && nowY-1>=0) {
            if (map[nowX + 1][nowY - 1] == 1) {
                map[nowX + 1][nowY - 1] = 2;
                findMap(nowX + 1, nowY - 1);
            }
        }
        if(nowX+1 < m) {
            if (map[nowX + 1][nowY] == 1) {
                map[nowX + 1][nowY] = 2;
                findMap(nowX + 1, nowY);
            }
        }
        if(nowX+1<m && nowY+1<n) {
            if (map[nowX + 1][nowY + 1] == 1) {
                map[nowX + 1][nowY + 1] = 2;
                findMap(nowX + 1, nowY + 1);
            }
        }
    }
}
