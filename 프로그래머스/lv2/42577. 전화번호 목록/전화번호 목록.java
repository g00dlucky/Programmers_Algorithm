import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length - 1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        
        
        
        return answer;
    }
}

// int min = Integer.MAX_VALUE;
//         for(String x: phone_book) {
//             if(min > x.length()) {
//                 min = x.length();
//             }
//         }
//         //자기 자신도 검사해버리니까 false가 나옴.
//         for(int i=0; i<phone_book.length; i++){
//             String a = phone_book[i].substring(0,min);
//             for(int j=phone_book.length-1; j>=0; j--) {
//                 if(phone_book[j].contains(a)) {
//                     answer = false;
//                 }
//             }
//         }