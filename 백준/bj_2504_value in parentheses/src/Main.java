import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        char[] c = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        int answer = 0;
        int sum = 0;
        int part = 0;

        for(int i=0; i<c.length; i++) {
            if(stack.isEmpty()){
                sum += part;
                if(c[i] == '(') part = 2;
                else if(c[i] == '[') part = 3;
                else {
                    sum = 0;
                    break;
                }
                stack.push(c[i]);
            }
            else {
                if(c[i] == '(') {
                    part *= 2;
                    stack.push(c[i]);
                }
                else if(c[i] == '[') {
                    part *= 3;
                    stack.push(c[i]);
                }
                else if(c[i] == ')') {
                    if(stack.peek() == '(') stack.pop();
                    else
                    {
                        sum = 0;
                        break;
                    }

                }
                else if(c[i] == ']') {
                    if(stack.peek() == '[') stack.pop();
                    else {
                        sum=0;
                        break;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
