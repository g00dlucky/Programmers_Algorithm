class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int a = 0;
        for(int i = 0; i < numbers.length; i++) {
            a += numbers[i];
            if(a > n) {
                break;
            }
        }
        
        return a;
    }
}