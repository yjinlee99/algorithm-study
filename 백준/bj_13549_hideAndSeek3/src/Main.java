import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int answer;
    static boolean[] visit;

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int s = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        visit = new boolean[200000];
        if(s>=b) answer = s-b;
        else {
            answer = b-s;
            bfs(s,b);
        }

        System.out.println(answer);
    }

    public static void bfs(int s, int b) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visit[s] = true;

        while(!q.isEmpty()) {
            int temp = q.poll();

            if(temp < b || visit[temp*2] == false) {
                visit[temp*2] = true;
                q.add(temp*2);
            }
            if(temp)
        }
    }
}
