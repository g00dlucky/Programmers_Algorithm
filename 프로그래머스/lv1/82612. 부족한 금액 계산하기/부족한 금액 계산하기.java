class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long a = 0;
        for(int i=1; i<=count; i++) {
            a += (long)(price * i);
        }      
        answer = (long)(money - a);
        
        

        return answer > 0 ? 0 : (long)(Math.abs(answer));
    }
}