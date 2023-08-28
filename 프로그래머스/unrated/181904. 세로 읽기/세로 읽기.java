import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder sb =new StringBuilder();
        
        
        String[][] a = new String[(int) Math.ceil((double) my_string.length() / m)][m];
        String[] b = my_string.split("");
        int index = 0;
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<m; j++) {
                a[i][j] = b[index++];
            }
        }
        for(int k=0; k<a.length; k++) {
            sb.append(a[k][c-1]);
        }
        
        answer = sb.toString();
        return answer;
    }
}


//         List<String> list = new ArrayList<>();
        
//         for(int i=0; i<my_string.length()/m; i+=m){
//             list.add(my_string.substring(i,m+1));
//         }
//         answer = list.get(c-1);