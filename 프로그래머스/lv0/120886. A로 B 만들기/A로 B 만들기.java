import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        
        Arrays.sort(a); Arrays.sort(b);
        StringBuilder sb = new StringBuilder();
        sb.append(a,0,a.length); String c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b,0,b.length); String d = sb2.toString();
        
        if(c.equals(d)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}