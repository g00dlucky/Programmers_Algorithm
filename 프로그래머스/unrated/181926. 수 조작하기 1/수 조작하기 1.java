class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] a = control.toCharArray();
        
        for(int i = 0; i < a.length; i++) {
            if(a[i]=='w') {
                answer++;
            } else if(a[i]=='s') {
                answer--;
            } else if(a[i]=='d') {
                answer += 10;
            } else if (a[i]=='a') {
                answer -= 10;
            } else {}
        }        
        
        return answer;
    }
}