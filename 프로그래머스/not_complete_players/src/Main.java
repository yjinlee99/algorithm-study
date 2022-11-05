public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] p = {"mislav", "stanko", "mislav", "ana"};
        String[] c = {"stanko", "ana", "mislav"};
        String a = s.solution(p,c);
        System.out.println(a);
    }
}
