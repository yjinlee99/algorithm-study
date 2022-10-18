import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =0; i<n; i++) {
            //학교의 숫자
            int sn = sc.nextInt();

            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < sn; j++) {
                map.put(sc.next(), sc.nextInt());
            }

            int max = 0;
            String maxsc = "";
            for (String key : map.keySet()) {
                if (map.get(key) > max) {
                    max = map.get(key);
                    maxsc = key;
                }
            }

            System.out.println(maxsc);
        }
    }
}