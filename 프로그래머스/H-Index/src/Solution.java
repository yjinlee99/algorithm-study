import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        int j = 1;
        for(int i = citations.length-1; i >= 0; i--){
            if(citations[i] >= j) j++;
            else break;
        }

        answer = --j;
        return answer;
    }
}