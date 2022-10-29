import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //용돈 사용할 날짜 수
        int n = sc.nextInt();
        //몇 번 인출할지
        int m = sc.nextInt();
        //사용할 금액 배열
        int[] money = new int[n];

        //start는 배열의 최대값
        int start = 0;
        //end는 배열을 다 더한 값
        int end = 0;
        for (int i=0; i<n; i++){
            money[i] = sc.nextInt();
            if (money[i] > start) start = money[i];
            end += money[i];
        }

        //매개 변수 탐색
        while(start<=end) {
            int mid = (start + end)/2;
            int check = mid;
            int num = 1;

            //몇 번 인출할지 구하기
            for(int i=0;i<n;i++){
                check = check - money[i];
                if(check < 0) {
                    num++;
                    check = mid;
                    check = check - money[i];
                }
                if(num > m) break;
            }

            if(num<=m) end = mid - 1;
            else start = mid + 1;
        }

        System.out.println(start);
    }
}
