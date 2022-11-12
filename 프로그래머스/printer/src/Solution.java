class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        int[] num = new int[10];
        int now = 0;
        int nowloc = 0;
        for( int i=0; i<priorities.length; i++){
            num[priorities[i]]++;
        }
        for( int i=9; i>0; i--) {
            if(num[i] > 0) {
                now = i;
                break;
            }
        }

        while(now>0) {
            if(priorities[nowloc] == 0) {
                nowloc++;
            }
            else {
                if(priorities[nowloc] == now) {
                    answer++;
                    if(nowloc == location) {
                        break;
                    }
                    else {
                        priorities[nowloc]++;
                        if(nowloc > priorities.length - 1){
                            nowloc = 0;
                        }
                        num[now] --;
                        if(num[now] == 0){
                            for( int i=now-1; i>0; i--) {
                                if(num[i] > 0) {
                                    now = i;
                                    break;
                                }
                            }
                        }
                    }
                }
                else {
                    nowloc++;
                    if(nowloc > priorities.length - 1){
                        nowloc = 0;
                    }
                }
            }
        }
        return answer;
    }
}