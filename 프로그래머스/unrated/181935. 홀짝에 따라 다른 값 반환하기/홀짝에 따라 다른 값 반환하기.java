class Solution {
    public int solution(int n) {
        int answer1 = 0; 
        int answer2 = 0;
        for(int i = n; i >= 0; i--){
            if (i % 2 != 0) {
               answer1 += i;
             } else {
               answer2 += i*i;
            }
        }
        
        return n % 2 != 0 ? answer1 : answer2;
    }
}