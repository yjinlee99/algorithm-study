class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[prices.length-1] = 0;

        for(int i = prices.length-2; i >=0; i--){
            int num = 0;
            int now = prices[i];
            for( int j=i + 1; j< prices.length; j++){
                if(now <= prices[j]){
                    num++;
                }
                else {
                    num++;
                    break;
                }
            }
            answer[i] = num;
        }
        return answer;
    }
}