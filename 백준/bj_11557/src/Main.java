import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트 케이스 숫자
        int n = sc.nextInt();

        for(int i =0; i<n; i++) {
            //학교의 숫자
            int sn = sc.nextInt();

            //<학교, 술소비량> 맵
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < sn; j++) {
                map.put(sc.next(), sc.nextInt());
            }

            //술 소비량 최대값과 술 소비량이 제일 많은 학교의 이름 저장
            int max = 0;
            String maxsc = "";

            //맵을 한 번 돌면서 최대값 찾기
            for (String key : map.keySet()) {
                if (map.get(key) > max) {
                    max = map.get(key);
                    maxsc = key;
                }
            }

            //술 소비량이 제일 많은 학교 출력
            System.out.println(maxsc);
        }
    }
}