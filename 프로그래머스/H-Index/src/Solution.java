import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        //논문 인용 횟수 정렬
        Arrays.sort(citations);

        //배열의 끝에서 부터 n번째 값이 n보다 크다면 h가 n이상
        int j = 1;
        for(int i = citations.length-1; i >= 0; i--){
            if(citations[i] >= j) j++;
            else break;
        }

        answer = --j;
        return answer;
    }
}