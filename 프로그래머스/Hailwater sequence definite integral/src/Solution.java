import java.util.ArrayList;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];

        ArrayList<Integer> list = new ArrayList<>();

        int n=0;
        while(true) {
            list.add(n, k);
            n++;
            if(k==1) break;
            else if(k%2==0) k/=2;
            else if(k%2==1) k=k*3+1;
        }

        double[] size = new double[list.size()-1];
        for(int i=0; i< list.size()-1; i++) {
            size[i] = (list.get(i) + list.get(i+1))/2.0;
        }
        for( int i=0; i< ranges.length; i++) {
            int start = ranges[i][0];
            int end = list.size() + ranges[i][1]-1;
            if(start == end) answer[i] = 0;
            else if (end > start){
                double s = 0;
                for(int j=start; j<end; j++) {
                    s += size[j];
                }
                answer[i] = s;
            }
            else {
                answer[i] = -1;
            }

        }
        return answer;
    }
}