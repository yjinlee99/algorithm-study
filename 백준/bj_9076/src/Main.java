import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트 케이스 개수
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            //5심판의 점수
            int[] arr = new int[5];

            for(int j=0; j<5; j++) {
                arr[j] = sc.nextInt();
            }

            //점수 정렬
            Arrays.sort(arr);


            //최고점과 최저점을 뺀 나머지 3명 점수의 최고점과 최저점의 차이가 4점 이상 나게 되면 KIN출력
            if(arr[3]-arr[1] >= 4)  {
                System.out.println("KIN");
            }
            //최고점과 최저점을 하나씩 제외한 점수의 합
            else{
                System.out.println(arr[1] + arr[2] + arr[3]);
            }
        }
    }
}
