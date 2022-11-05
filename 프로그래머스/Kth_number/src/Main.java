public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        Solution s = new Solution();
        int[] answer = s.solution(array, commands);
        System.out.println(answer);
    }
}
