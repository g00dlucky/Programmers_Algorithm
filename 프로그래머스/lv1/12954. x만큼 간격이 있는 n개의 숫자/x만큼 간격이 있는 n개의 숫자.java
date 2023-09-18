class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int i = 0;
        long a = 0;
        
        while(i < n){
            a += x;
            answer[i]=a;
            i++;   
        }
        
        return answer;
    }
}