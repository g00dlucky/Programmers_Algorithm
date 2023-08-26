import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        String[] strArr = s.split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        for(String x : strArr) {
            sb.append(x);
        }
        answer = sb.toString();
        
        
        return answer;
    }
}