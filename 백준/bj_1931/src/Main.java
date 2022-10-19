import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //회의 수
        int n = sc.nextInt();

        //시작시간과 끝나는 시간이 들어가는 2차원 배열
        int[][] meet = new int[n][2];

        //배열에 값 넣기
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                meet[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(meet, (o1, o2) -> {
            //만약 끝나는 시간이 같다면 시작시간으로 정렬
            if(o1[1]==o2[1]){
                return Integer.compare(o1[0], o2[0]);
            }
            //그외에는 끝나는 시간으로 정렬
            else {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        //제일 빨리 끝나는 회의로 시작해서 다음으로 제일 빨리 끝나는 회의 찾기
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
