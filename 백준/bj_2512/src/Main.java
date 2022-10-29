import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //지방의 수
        int n = sc.nextInt();

        //배열 중 최대값이 end
        int end = 0;
        //예산 배열
        int[] money = new int[n];
        for(int i=0; i<n; i++){
            money[i] = sc.nextInt();
            if(money[i] > end) end = money[i];
        }

        //총예산
        int num = sc.nextInt();
        //예산이 1 이상이기 때문에 start 1
        int start = 1;
        int mid;

        //매개 변수 탐색
        while(start<=end){
            mid = (start+end)/2;
            int sum = 0;
            //mid로 계산한 예산이 총 예산보다 작다면 true
            for(int i=0;i<n;i++){
                if(mid > money[i]) sum += money[i];
                else sum += mid;
            }
            if(sum <= num) start = mid + 1;
            else end = mid - 1;
        }
        System.out.println(end);
    }
}
