import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        String[] str = s.split("-");
        String[] front = str[0].split("\\+");
        int plus = 0;
        for(int i=0; i<front.length; i++) {
            plus += Integer.parseInt(front[i]);
        }
        int minus = 0;

        for(int i=1; i<str.length; i++) {
            String[] back = str[i].split("\\+");
            for(int j=0; j<back.length; j++) {
                minus += Integer.parseInt(back[j]);
            }
        }

        System.out.println(plus-minus);
    }
}
