import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] meet = new int[n][2];

        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                meet[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(meet, Comparator.comparingInt((int[] o)->o[1]));

        int num = meet[0][1];
        int answer = 1;
        for(int i=1;i<n;i++){
            if(meet[i][0]>=num){
                num=meet[i][1];
                answer++;
            }
        }

        System.out.println(answer);
    }
}
