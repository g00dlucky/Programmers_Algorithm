class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String a = "";
        long b = 0;
        int cnt = 0;
        int index = 0;
        for(int i=p.length(); i<=t.length(); i++){
            
            a = t.substring(index++,i);    
            b = Long.parseLong(a);
            
            if (b <= Long.parseLong(p)) {
                cnt++;
            }
            
        }
        
        return cnt;
    }
}