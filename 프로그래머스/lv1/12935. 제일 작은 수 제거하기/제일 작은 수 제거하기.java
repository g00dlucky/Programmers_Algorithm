import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        // if(arr.length == 1) {
        //     return new int[]{-1};
        // } 
        
        if(arr.length == 1) {
            int[] answer = {-1}; 
            return answer;
        }         
         //최소값 확인
        int min = Integer.MAX_VALUE;
        for(int x : arr) {
            if(min > x) {
                min = x;
            }
        }
        //최소값을 제외한 배열 만들기
        int[] answer = new int[arr.length-1];
        int index = 0;
       for(int x : arr){
           if(min != x) {
               answer[index++] = x; 
           }
       }
        
        return answer;
    }
}

// int index = 0;
// int a = Integer.Min_Value();
        
//         for(int x : arr){
//             a = Math.max(a,x);
//             answer[i] = a;
//             if(x <= a){
                
//             }   
//         }