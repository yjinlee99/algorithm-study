import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int[] arr = new int[5];

            for(int j=0; j<5; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            if(arr[3]-arr[1] >= 4)  {
                System.out.println("KIN");
            }
            else{
                System.out.println(arr[1] + arr[2] + arr[3]);
            }
        }
    }
}
