import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public static List<Long> num = new ArrayList<>();
    public static List<String> oper = new ArrayList<>();
    public static String operlist[];
    long answer;

    public long solution(String expression) {
        answer = 0;

        String[] n = expression.split("\\+|-|\\*");

        for(int i=0; i<n.length; i++) {
            num.add(Long.parseLong(n[i]));
        }
        String[] op = expression.split("0|1|2|3|4|5|6|7|8|9");

        for(int i=0; i<op.length; i++) {
            oper.add(op[i]);
        }
        Set<String> set = new HashSet<String>(oper);
        List<String> list = new ArrayList<>(set);
        operlist = list.toArray(new String[list.size()]);

        per(0, operlist.length);

        return answer;
    }

    static void per(int depth, int r) {
        if(depth == r) {
            operation();
            return;
        }

        for(int i=depth; i<r; i++) {
            swap(depth, i);
            per(depth+1, r);
            swap(depth, r);
        }
    }

    static void swap(int depth, int i) {
        String temp = operlist[depth];
        operlist[depth] = operlist[i];
        operlist[i] = temp;
    }

    static void operation() {

    }
}