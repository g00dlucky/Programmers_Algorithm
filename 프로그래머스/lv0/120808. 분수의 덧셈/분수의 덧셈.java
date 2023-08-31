class Solution {
    public int[] solution(int number1, int denom1, int number2, int denom2) {
        int[] answer = {};
        
        int a = (number1 * denom2) + (number2 * denom1);
        int b = denom1 * denom2;
        
        int c = GCD(Math.abs(a), Math.abs(b)); // GCD는 양수여야 함
        answer = new int[]{a / c, b / c};  // 항상 기약분수로 만듦
        return answer;
    }
  
    public int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
