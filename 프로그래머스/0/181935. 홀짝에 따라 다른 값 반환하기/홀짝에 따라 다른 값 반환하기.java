class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2 != 0) {
            for(int i =0; i <= n/2; i++) {
                answer += 1 + i*2;
            }
        } else {
            for(int i =0; i <= n/2; i++) {
                answer += (i*2)*(i*2);
            }
        }
        return answer;
    }
}