import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long now = 1;
        long nowIndex = 0;

        LinkedList<Long> li = new LinkedList<Long>();

        for(long i=1; i<n+1; i++){
            li.add(i);
        }

        for(long i=1; i<n; i++){
            now = i * i * i;

            long go = now % li.size() - 1;
            if(go == -1) go = li.size() - 1;
            nowIndex = go + nowIndex;

            if (nowIndex  > li.size() - 1){
                nowIndex = nowIndex - li.size();
            }

            li.remove((int)nowIndex);
        }
        System.out.println(li.getFirst());
    }
}
