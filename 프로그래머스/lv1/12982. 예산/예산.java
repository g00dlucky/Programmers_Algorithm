import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        int count = 0;
            
        for(int i=0; i<d.length; i++){
            if(budget < d[i]){
                break;
            }
            budget -= d[i];
            count++;
        }
        return count;
    }
}

// import java.util.*;

// class Solution {
//     public int solution(int[] d, int budget) {
//         int answer = 0;
//         Arrays.sort(d);
//         int sum = 0;
//         int count = 0;
            
//         for(int i=0; i<d.length; i++){
//             sum += d[i];
//             count++;
//             if(sum > budget) {
//                 count = count -1;
//                 answer = count;
//                 break;
//             } else if(i == d.length -1 && sum == budget) {
//                 answer = count;
//                 break;
//             }

            
//         }
//         return answer;
//     }
// }