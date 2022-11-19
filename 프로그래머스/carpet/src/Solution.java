class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for(int i=1; i<=yellow; i++){
            if(yellow%i == 0){
                int j=yellow/i;
                if(brown == 2*(i+j) + 4) {
                    answer[0] = i+2;
                    answer[1] = j+2;

                }
            }
        }

        return answer;
    }
}