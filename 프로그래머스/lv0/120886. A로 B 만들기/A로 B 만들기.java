import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        
        Arrays.sort(a); Arrays.sort(b);
        String c = new String(a);
        String d = new String(b);
        if(c.equals(d)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}