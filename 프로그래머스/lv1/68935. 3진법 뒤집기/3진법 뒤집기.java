import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        //자동 앞 뒤 반전
        while(n != 0){
            str += n % 3;
            n = n / 3;
        }
        //일반적 방법
        
        //3진법인 str를 10진법으로 변환
        return Integer.parseInt(str,3); 
    }
}