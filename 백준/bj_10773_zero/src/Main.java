import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();

        for( int i=0; i<n; i++){
            int num = Integer.parseInt(bf.readLine());

            if(num == 0) stack.pop();
            else stack.push(num);
        }
        int sum = 0;
        while(!stack.empty()){
            sum += stack.peek();
            stack.pop();
        }
        System.out.println(sum);
    }
}
