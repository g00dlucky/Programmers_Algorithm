class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        String a = "수";
        String b = "박";
        
        for(int i=1; i<=n; i++){
           
            if(i % 2 == 0){
                sb.append(b);
            } else {
                sb.append(a);
            }
        }
        answer = sb.toString();
        
        return answer;
    }
}