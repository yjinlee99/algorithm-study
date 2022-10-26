import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int end = 0;
        int[] money = new int[n];
        for(int i=0; i<n; i++){
            money[i] = sc.nextInt();
            if(money[i] > end) end = money[i];
        }

        int num = sc.nextInt();
        int start = 1;
        int mid;

        while(start<=end){
            mid = (start+end)/2;
            int sum = 0;
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
