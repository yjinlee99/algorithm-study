import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] money = new int[n];

        int start = 0;
        int end = 0;
        for (int i=0; i<n; i++){
            money[i] = sc.nextInt();
            if (money[i] > start) start = money[i];
            end += money[i];
        }

        while(start<=end) {
            int mid = (start + end)/2;
            int check = mid;
            int num = 1;

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
