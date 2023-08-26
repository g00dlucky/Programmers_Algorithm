import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int a = 0;
        boolean[] isPresent = new boolean[10];
        
        for(int number: numbers){
            isPresent[number] = true; // numbers의 index에 맞춰서 숫자가 있는지 없는지 확인
        }
        
        for(int i=0; i<10; i++){
            if(!isPresent[i]) {
                a += i;
            }
        }
        
       
        

        return a;
    }
}

        // for(int i=1; i<numbers.length; i++){
        //     for(int j=0; j<numbers.length; j++){
        //         if (i != numbers[j]){
        //             a += i;
        //         }
        //     }
        // }